package homework12;

import java.nio.file.InvalidPathException;
import java.util.*;

public class FileNavigator {
    private HashMap<String, ArrayList<FileData>> map = new HashMap<>();

    public void add(FileData file, String path) throws InvalidPathException{
        if (!Objects.equals(path, file.getPath())) {
            throw new InvalidPathException(path, file.toString());
        }
        map.computeIfAbsent(path, key -> new ArrayList<>());
        map.get(path).add(file);
    }

    public List<FileData> find(String path) {
        return map.get(path);
    }

    public List<FileData> filterBySize(int size) {
        ArrayList<FileData> result = new ArrayList<>();
        map.forEach((key, value) -> value.forEach(file -> {
            if (file.getSize() <= size) {
                result.add(file);
            }
        }));
        return result;
    }

    public void remove(String path){
        map.remove(path);
    }

    public List<FileData> sortBySize(){
        ArrayList<FileData> result = new ArrayList<>();
        map.forEach((key, value) -> result.addAll(value));
        result.sort(Comparator.comparingInt(FileData::getSize));
        return result;
    }

    public void showAll() {
        System.out.println(map);
    }
}
