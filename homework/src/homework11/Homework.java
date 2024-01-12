package homework11;

import java.util.*;

public class Homework {

    public int countOccurance(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        int count = 0;
        if (str != null) {
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    count++;
                }
            }
        } else {
            while (it.hasNext()) {
                if (null == it.next()) {
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
        ArrayList<String> unique = new ArrayList<>(new HashSet<>(list));
        unique.forEach(str -> System.out.println(str + " count = " + countOccurance(list, str)));
    }

    public List<Word> findOccurance(List<String> list) {
        ArrayList<String> unique = new ArrayList<>(new HashSet<>(list));
        ArrayList<Word> result = new ArrayList<>();
        unique.forEach(str -> result.add(new Word(str, countOccurance(list, str))));
        return result;
    }

}
