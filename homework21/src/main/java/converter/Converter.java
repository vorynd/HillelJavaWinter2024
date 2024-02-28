package converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;

public class Converter {
    private final Path path;
    private final Path convertedFolder;
    private final String separator;
    private final Logger logger;

    public Converter(String[] args) {
        path = getDir(args);
        separator = FileSystems.getDefault().getSeparator();
        convertedFolder = Path.of(path + separator + "converted");
        logger = new Logger(convertedFolder, separator);
    }

    public void run() {
        File converted = new File(convertedFolder.toUri());
        converted.mkdir();

        ObjectMapper jsonMapper = new ObjectMapper();
        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());

        getFiles().forEach(file -> {
            if (".json".equals(getFileExtension(file))) {
                processConvertation(file, createConvertedFile(file, ".yaml"), jsonMapper, yamlMapper);
            }
            if (".yaml".equals(getFileExtension(file))) {
                processConvertation(file, createConvertedFile(file, ".json"), yamlMapper, jsonMapper);
            }
        });
    }

    private File createConvertedFile(File fromFile, String extension) {
        return new File(convertedFolder + separator
                + fromFile.getName().substring(0, fromFile.getName().lastIndexOf(".")) + extension);
    }

    private void processConvertation(File fromFile, File toFile, ObjectMapper fromMapper, ObjectMapper toMapper) {
        long startTime = System.currentTimeMillis();
        try {

            convert(fromFile, toFile, fromMapper, toMapper);

            long elapsedTime = System.currentTimeMillis() - startTime;
            logger.log(fromFile, toFile, elapsedTime);
        } catch (IOException ignored) {
        }
    }

    private void convert(File fromFile, File toFile, ObjectMapper fromMapper, ObjectMapper toMapper) throws IOException {
        Object obj = fromMapper.readValue(fromFile, Object.class);
        toMapper.writeValue(toFile, obj);
    }

    private Path getDir(String[] args) {
        if (args.length == 0) {
            return FileSystems.getDefault().getPath("").toAbsolutePath();
        } else return Path.of(args[0]);
    }

    private String getFileExtension(File file) {
        String str = file.getAbsolutePath();
        int index = str.lastIndexOf(".");
        return index == -1 ? null : str.substring(index);
    }

    private List<File> getFiles() {
        return Arrays.stream(Objects.requireNonNull(new File(path.toUri()).listFiles())).toList();
    }
}


