package homework20;


import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {


        String format = "[%s] [%s] Message: [%s] \n";
        String path = "C:\\Users\\vorynd\\IdeaProjects\\HillelJavaWinter2024\\homework20\\src\\main\\java\\";
        FileLogger logger = new FileLogger(new FileLoggerConfiguration(path, LoggingLevel.DEBUG, 2048, format));
        for (int i = 0; i < 150; i++) {
            try {
                logger.debug("message #" + i);

            } catch (FileMaxSizeReachedException exception) {
                System.out.println(exception.getMessage());
            }
        }

    }


}
