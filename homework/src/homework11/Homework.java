package homework11;

import java.util.*;

public class Homework {

    public int countOccurance(List<String> list, String str) {
        int count = 0;
        if (str != null) {
            for (String s : list) {
                if (str.equals(s)) {
                    count++;
                }
            }
        } else {
            for (String s : list) {
                if (null == s) {
                    count++;
                }
            }
        }
        return count;
    }

    public <E> List<E> toList(E[] array) {
        return Arrays.asList(array);
    }

    public List<Integer> findUnique(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public void calcOccurance(List<String> list) {
        HashSet<String> unique = new HashSet<>(list);
        unique.forEach(str -> System.out.println(str + " count = " + countOccurance(list, str)));
    }

    public List<Word> findOccurance(List<String> list) {
        HashSet<String> unique = new HashSet<>(list);
        ArrayList<Word> result = new ArrayList<>();
        unique.forEach(str -> result.add(new Word(str, countOccurance(list, str))));
        return result;
    }

}
