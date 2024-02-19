package homework20;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    public void info(String message) throws IOException {
        log(LoggingLevel.INFO, message);
    }

    public void debug(String message) throws IOException {
        if (config.getLevel().equals(LoggingLevel.DEBUG)) {
            log(LoggingLevel.DEBUG, message);
        }
    }

    private void log(LoggingLevel level, String message) throws IOException {
        File file = new File(config.getPath());
        if (!file.exists()) {
            file.createNewFile();
        }
        String str = String.format(config.getFormat(), getCurrentFormattedTime(), level, message);
        if (file.length() >= config.getMaxFileSize()) {
            throw new FileMaxSizeReachedException("Max file size reached: " + config.getMaxFileSize() + ". Current size: " + file.length() + ". File on path " + file.getPath());
        }
        try (OutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(str.getBytes());
        }
        System.out.print(str);
    }

    public static String getCurrentFormattedTime() {
        String pattern = "yyyy-MM-dd hh:mm:sss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}
