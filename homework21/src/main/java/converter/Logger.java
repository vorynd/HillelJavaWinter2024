package converter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

public class Logger {
    File log;

    public Logger(Path convertedFolder, String separator) {
        log = new File(convertedFolder + separator + "log.txt");
    }

    public void log(File oldFile, File newFile, long milis) throws IOException {
        if (!log.exists()) {
            log.createNewFile();
        }
        String format = "%s -> %s; %s; %s -> %s; \n";
        String str = String.format(format, oldFile.getName(), newFile.getName(), formatTime(milis), formatFileSize(oldFile), formatFileSize(newFile));
        try (OutputStream outputStream = new FileOutputStream(log, true)) {
            outputStream.write(str.getBytes());
        }
    }

    private String formatFileSize(File file) {
        long fileSizeBytes = file.length();
        double fileSizeKB = (double) fileSizeBytes / 1024;
        double fileSizeMB = (double) fileSizeBytes / (1024 * 1024);
        if (fileSizeBytes < 1024) {
            return fileSizeBytes + " bytes";
        } else if (fileSizeKB < 1024) {
            return String.format("%.2f KB", fileSizeKB);
        } else return String.format("%.2f MB", fileSizeMB);
    }

    private String formatTime(long milis) {
        double elapsedTimeSeconds = milis / 1000.0;
        return elapsedTimeSeconds + " seconds";
    }
}
