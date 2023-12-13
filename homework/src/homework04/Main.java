package homework04;

public class Main {
    public static void main(String[] args) {
        Homework homework = new Homework();


        homework.printThreeWords();
        homework.checkSumSign();
        homework.printColor();
        homework.compareNumbers();

        System.out.println(homework.compareIntsSumm(1, 2));
        System.out.println(homework.compareIntsSumm(5, 5));
        System.out.println(homework.compareIntsSumm(10, 10));
        System.out.println(homework.compareIntsSumm(120, 10));

        homework.printNumberSign(-1);
        homework.printNumberSign(0);
        homework.printNumberSign(1);

        System.out.println(homework.checkIfNegative(-1));
        System.out.println(homework.checkIfNegative(0));
        System.out.println(homework.checkIfNegative(1));

        homework.printStringCycle("test",4);

        System.out.println(homework.checkIfLeapYear(500));
        System.out.println(homework.checkIfLeapYear(1600));
        System.out.println(homework.checkIfLeapYear(1992));



    }
}
