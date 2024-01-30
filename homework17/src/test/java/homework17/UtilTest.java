package homework17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class UtilTest {

    private Util sut = new Util();

    @Test
    void testCalcWithEmptyCollection() {
        Assertions.assertEquals(0.0, sut.calc(List.of()));
    }

    @Test
    public void testCalcWithNonEmptyCollection() {
        double result = sut.calc(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(3.0, result);
    }

    @Test
    public void testCalcWithNonEmptyCollectionWithNull() {
        Collection<Integer> collection = Arrays.asList(1, null, 7, 10);
        double result = sut.calc(collection);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void testMapToPair() {
        List<Pair> result = sut.mapToPair((List.of("abc", "def", "ghi")));
        Assertions.assertEquals(List.of(new Pair("ABC", "abc"),
                new Pair("DEF", "def"),
                new Pair("GHI", "ghi")), result);
    }
    @Test
    void testMapToPairWithEmptyCollection() {
        List<Pair> result = sut.mapToPair((List.of()));
        Assertions.assertEquals(List.of(), result);
    }
    @Test
    public void testMapToPairWithMixedCaseStrings() {
        Collection<String> inputCollection = Arrays.asList("AbCd", "EfGh", "iJkL", "mNoP");
        List<Pair> result = sut.mapToPair(inputCollection);
        Assertions.assertEquals(List.of(new Pair("ABCD", "abcd"),
                new Pair("EFGH", "efgh"),
                new Pair("IJKL", "ijkl"),
                new Pair("MNOP", "mnop")),result);
    }

    @Test
    public void testMapToPairWithNullElement() {
        Collection<String> inputCollection = Arrays.asList("apple", null, "cherry");
        List<Pair> result = sut.mapToPair(inputCollection);
        Assertions.assertEquals(List.of(new Pair("APPLE", "apple"),
                new Pair("CHERRY", "cherry")), result);
    }

    @Test
    public void testMapToPairWithEmptyString() {
        Collection<String> inputCollection = Arrays.asList("apple", "", "cherry");
        List<Pair> result = sut.mapToPair(inputCollection);
        Assertions.assertEquals(List.of(new Pair("APPLE", "apple"),
                new Pair("", ""),
                new Pair("CHERRY", "cherry")),result);
    }

    @Test
    void testFilter() {
        Collection<String> result = sut.filter(List.of("abcd", "efgKKh", "ijlkl", "mnop", "st"));
        Assertions.assertEquals(List.of("abcd", "mnop"), result);
    }
    @Test
    public void testFilterWithNullElement() {
        Collection<String> inputCollection = Arrays.asList("abcd", null, "efh", "ijkjjl", "mnop", "qrDst");
        Collection<String> result = sut.filter(inputCollection);
        Assertions.assertEquals(List.of("abcd", "mnop"),result);
    }

}
