package homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FontMapper {

    Font font;

    public FontMapper(Font font) {
        this.font = font;
    }

    public List<String[]> mapFont(String[] args) {
        List<String> numbers = parse(args);
        List<String[]> result = new ArrayList<>();
        numbers.forEach(number -> {
            try {
                result.add(font.getFont()[Integer.parseInt(number)]);
            } catch (NumberFormatException exception) {
                System.out.println("args should be numeric values");
            }
        });
        return result;
    }

    private List<String> parse(String[] args) {
        List<String> strings = new ArrayList<>();
        for (String str : args) {
            String[] array = str.split("");
            strings.addAll(Arrays.asList(array));
        }
        System.out.println(strings);
        return strings;
    }
}
