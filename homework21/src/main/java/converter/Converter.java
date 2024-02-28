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
        List<String> yamlList = new ArrayList<>();
        List<String> jsonList = new ArrayList<>();
        File converted = new File(convertedFolder.toUri());
        converted.mkdir();
        getFiles().forEach(str -> {
            if (".json".equals(getFileExtension(str))) {
                jsonList.add(str);
            }
            if (".yaml".equals(getFileExtension(str))) {
                yamlList.add(str);
            }
        });
        jsonList.forEach(this::convertJsonToYaml);
        yamlList.forEach(this::convertYamlToJson);
    }

    private void convertJsonToYaml(String filePath) {
        long startTime = System.currentTimeMillis();
        try {
            File oldFile = new File(filePath);
            File convertedFile = new File(convertedFolder + separator
                    + filePath.substring(filePath.lastIndexOf(separator), filePath.lastIndexOf(".")) + ".yaml");
            convertedFile.createNewFile();

            ObjectMapper jsonMapper = new ObjectMapper();
            Object obj = jsonMapper.readValue(oldFile, Object.class);
            ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
            yamlMapper.writeValue(convertedFile, obj);
            long elapsedTime = System.currentTimeMillis() - startTime;
            logger.log(oldFile, convertedFile, elapsedTime);
        } catch (IOException ignored) {
        }
    }

    private void convertYamlToJson(String filePath) {
        long startTime = System.currentTimeMillis();
        try {
            File oldFile = new File(filePath);
            File convertedFile = new File(convertedFolder + separator
                    + filePath.substring(filePath.lastIndexOf(separator), filePath.lastIndexOf(".")) + ".json");
            convertedFile.createNewFile();

            ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
            Object obj = yamlMapper.readValue(oldFile, Object.class);
            ObjectMapper jsonMapper = new ObjectMapper();
            jsonMapper.writeValue(convertedFile, obj);
            long elapsedTime = System.currentTimeMillis() - startTime;
            logger.log(oldFile, convertedFile, elapsedTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Path getDir(String[] args) {
        if (args.length == 0) {
            return FileSystems.getDefault().getPath("").toAbsolutePath();
        } else return Path.of(args[0]);
    }

    private String getFileExtension(String str) {
        int index = str.lastIndexOf(".");
        return index == -1 ? null : str.substring(index);
    }

    private List<String> getFiles() {
        return Arrays.stream(Objects.requireNonNull(new File(path.toUri()).listFiles())).map(File::toString).toList();
    }
}


