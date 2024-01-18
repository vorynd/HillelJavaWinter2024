package homework14;

public class ArrayValueCalculator {

    public static int doCalc(String[][] input) {
        if (input.length != 4) {
            throw new ArraySizeException("input array must be 4x4");
        }
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].length != 4) {
            throw new ArraySizeException("input array must be 4x4");
        }
            for (int j = 0; j < input[i].length; j++) {
                try {
                    result += Integer.parseInt(input[i][j]);
                } catch (NumberFormatException exception) {
                    throw new ArrayDataException("Wrong data on index [" + i + "][" + j + "]");
                }
            }
        }
        return result;
    }
}
