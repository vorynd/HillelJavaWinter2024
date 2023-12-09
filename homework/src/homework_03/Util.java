package homework_03;

public class Util {

    // #1
    public void oddNum() {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // #2
    public void factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(n + "! = " + result);
    }

    // #3
    public void oddNumWhile() {
        int i = 1;
        while (i < 100) {
            System.out.print(i + ", ");
            i = i + 2;
        }
        System.out.println();
    }

    // #3
    public void factorialWhile(int n) {
        int result = 1;
        int i = 1;
        while (i < n) {
            i++;
            result = result * i;
        }
        System.out.println(n + "! = " + result);
    }

    // #4
    public void oddNumDoWhile() {
        int i = 1;
        do {
            System.out.print(i + ", ");
            i = i + 2;
        }
        while (i < 100);
        System.out.println();
    }

    // #4
    public void factorialDoWhile(int n) {
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;
        }
        while (i <= n);
        System.out.println(n + "! = " + result);
    }

    // #5
    public void exponentiation(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println(x + "^" + n + " = " + result);
    }

    // #6
    public void sequence() {
        for (int i = 0; i > -50; i = i - 5) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // #7
    public void multiplication(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
        System.out.println();
    }

    // #8
    public void oddArray() {
        int[] array = new int[10];
        int y = 1;
        for (int i = 0; i < 10; i++) {
            array[i] = y;
            y = y + 2;
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    // #9
    public void minInArray(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        System.out.println("min = " + result);
    }

    // #10
    public void maxInArray(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        System.out.println("max = " + result);
    }

    // #11
    public void swapMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;
    }

    public void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

