package homework_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();

        System.out.println("task 1");
        util.oddNum();

        System.out.println("task 2");
        util.factorial(0);
        util.factorial(1);
        util.factorial(2);
        util.factorial(3);
        util.factorial(4);

        System.out.println("task 3");
        util.oddNumWhile();

        System.out.println("task 3");
        util.factorialWhile(0);
        util.factorialWhile(1);
        util.factorialWhile(2);
        util.factorialWhile(3);
        util.factorialWhile(4);

        System.out.println("task 4");
        util.oddNumDoWhile();

        System.out.println("task 4");
        util.factorialDoWhile(0);
        util.factorialDoWhile(1);
        util.factorialDoWhile(2);
        util.factorialDoWhile(3);
        util.factorialDoWhile(4);

        System.out.println("task 5");
        util.exponentiation(2, 0);
        util.exponentiation(0, 3);
        util.exponentiation(1, 0);
        util.exponentiation(2, 2);
        util.exponentiation(2, 3);

        System.out.println("task 6");
        util.sequence();

        System.out.println("task 7");
        System.out.println("Please enter number");
        util.multiplication(new Scanner(System.in).nextInt());

        System.out.println("task 8");
        util.oddArray();

        System.out.println("task 9");
        int[] array = {4, -5, 0, 6, 8};
        util.printIntArray(array);
        util.minInArray(array);

        System.out.println("task 10");
        util.printIntArray(array);
        util.maxInArray(array);

        System.out.println("task 11");
        util.printIntArray(array);
        util.swapMinMax(array);
        util.printIntArray(array);

    }
}
