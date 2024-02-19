package homework20;

import java.io.File;

public class FileLoggerConfiguration {
    private String path;
    private LoggingLevel level;
    private Integer maxFileSize;
    private String format;

    public FileLoggerConfiguration(String path, LoggingLevel level, Integer maxFileSize, String format) {
        this.path = path;
        this.level = level;
        this.maxFileSize = maxFileSize;
        this.format = format;
    }

    public String getPath() {
        return path;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public String getFormat() {
        return format;
    }
}
