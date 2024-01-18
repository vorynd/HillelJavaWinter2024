package homework14;

public class Run {

    public static void main(String[] args) {
        String[][] myArray = {{"18", "28", "18", "18"}, {"54", "5", "90", "85"}, {"45", "3", "14", "18"}, {"45", "3", "14", "18"}};
        String[][] myArray1 = {{"18", "28", "18"}, {"28", "45", "90"}, {"45", "3", "14"}};
        String[][] myArray2 = {{"18", "28", "18", "18"}, {"28", "74", "j", "85"}, {"45", "3", "14", "18"}, {"45", "3", "14", "18"}};
        try {
            System.out.println(ArrayValueCalculator.doCalc(myArray));
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println(ArrayValueCalculator.doCalc(myArray1));
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println(ArrayValueCalculator.doCalc(myArray2));
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
