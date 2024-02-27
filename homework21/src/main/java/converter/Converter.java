package converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;

public class Converter {
    private final Path path;
    private final Path convertedFolder;
    private final String separator;

    public Converter(String[] args) {
        path = getDir(args);
        separator = FileSystems.getDefault().getSeparator();
        convertedFolder = Path.of(path + separator + "converted");
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
            log(oldFile, convertedFile, elapsedTime);
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
            log(oldFile, convertedFile, elapsedTime);
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

    private void log(File oldFile, File newFile, long milis) throws IOException {
        File log = new File(convertedFolder + separator + "log.txt");
        if (!log.exists()) {
            log.createNewFile();
        }
        String format =  "%s -> %s; %s; %s -> %s; \n";
        String str = String.format(format, oldFile.getName(),newFile.getName(),formatTime(milis),formatFileSize(oldFile),formatFileSize(newFile));
        try (OutputStream outputStream = new FileOutputStream(log, true)) {
            outputStream.write(str.getBytes());
        }
    }

    private String formatFileSize(File file) {
        long fileSizeBytes = file.length();
        double fileSizeKB = (double) fileSizeBytes / 1024;
        double fileSizeMB = (double) fileSizeBytes / (1024 * 1024);
        if (fileSizeBytes < 1024) {
            return  fileSizeBytes + " bytes";
        } else if (fileSizeKB < 1024) {
            return  String.format("%.2f KB", fileSizeKB);
        } else return  String.format("%.2f MB", fileSizeMB);
    }

    private String formatTime(long milis) {
        double elapsedTimeSeconds = milis / 1000.0;
        return elapsedTimeSeconds + " seconds";
    }
}


