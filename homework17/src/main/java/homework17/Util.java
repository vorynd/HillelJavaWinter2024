package homework17;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class Util {

    public double calc(Collection<Integer> collection) {
        OptionalDouble average = collection.stream().filter(Objects::nonNull).mapToDouble(Integer::doubleValue).average();
        return average.orElse(0.0);
    }

    public List<Pair> mapToPair(Collection<String> collection) {
        return collection.stream().filter(Objects::nonNull).map(str -> new Pair(str.toUpperCase(), str.toLowerCase())).toList();
    }


    public Collection<String> filter(Collection<String> collection) {
        return collection.stream().filter(Objects::nonNull).filter(str -> str.length() == 4 && str.equals(str.toLowerCase())).toList();
    }

    public void print(Collection<String> collection) {
        filter(collection).forEach(System.out::println);
    }
}

