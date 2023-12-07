package homework_02;

public class ArithmeticMeanAnyNumber {
    public static void main(String[] args) {
        double summ = 0;
        System.out.print("Numbers are: ");
        for (String arg : args) {
            System.out.print(arg + " ");
            summ = summ + Double.parseDouble(arg);
        }
        System.out.println();
        System.out.println("Arithmetic mean of this numbers is: " + summ / args.length);
    }
}
