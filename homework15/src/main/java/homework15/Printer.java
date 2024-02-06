package homework15;

import java.util.Arrays;
import java.util.List;

public class Printer {

    FontMapper fontMapper;

    public Printer(Font font) {
        this.fontMapper = new FontMapper(font);
    }

    public void print(String[] args) {
        Arrays.asList(concat(fontMapper.mapFont(args))).forEach(System.out::println);
    }

    public String[] concat(List<String[]> list) {
        String[] result = list.get(0);
        for (int j = 1; j < list.size(); j++) {
            for (int i = 0; i < list.get(j).length; i++) {
                result[i] = result[i] + " " + list.get(j)[i];
            }
        }
        return result;
    }

}

