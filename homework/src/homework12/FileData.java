package homework12;

public class FileData {
    private String fileName;
    private int size;
    private String path;

    public FileData(String fileName, int size, String path) {
        this.fileName = fileName;
        this.size = size;
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileName=" + fileName +
                ", size=" + size +
                ", path=" + path ;
    }
}
