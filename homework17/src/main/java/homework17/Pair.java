package homework17;

import java.util.Objects;

public class Pair {
    private String upper;
    private String lower;

    public Pair(String upper, String lower) {
        this.upper = upper;
        this.lower = lower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(upper, pair.upper) && Objects.equals(lower, pair.lower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upper, lower);
    }
}
