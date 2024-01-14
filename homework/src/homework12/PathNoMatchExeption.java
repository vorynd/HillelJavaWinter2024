package homework12;

public class PathNoMatchExeption extends Exception {

    private FileData fileData;
    private String path;

    public PathNoMatchExeption(FileData fileData, String path) {
        this.fileData = fileData;
        this.path = path;
    }

    public FileData getFileData() {
        return fileData;
    }

    public String getPath() {
        return path;
    }
}
