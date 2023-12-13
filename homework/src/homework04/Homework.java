package homework04;

public class Homework {

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public void checkSumSign() {
        int a = 7;
        int b = 95;

        int summ = a + b;
        if (summ >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public void printColor() {
        int value = 104;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");
        }
    }

    public void compareNumbers() {
        int a = 56;
        int b = 70;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean compareIntsSumm(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число позитивне");
        } else {
            System.out.println("Число від'ємне");
        }
    }

    public boolean checkIfNegative(int number) {
        return number < 0;
    }

    public void printStringCycle(String string, int num) {
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.println(string);
            }
        } else System.out.println("num must be > 0");
    }

    public boolean checkIfLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return (year % 4 == 0) && (year % 100 != 0);
    }
}



