package homework_02;

public class ArithmeticMeanTwoNumbers {
    public static void main(String[] args) {
        double firstValue = Double.parseDouble(args[0]);
        double secondValue = Double.parseDouble(args[1]);
        System.out.println("First number is: " + firstValue);
        System.out.println("Second number is: " + secondValue);
        System.out.println("Arithmetic mean of this numbers is: " + (firstValue + secondValue) / 2);
    }
}
