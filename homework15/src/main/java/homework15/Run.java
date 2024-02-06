package homework15;



public class Run {
    public static void main(String[] args) {
        try {
            new Printer(new FontImpl()).print(args);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("should run with args");
        }
    }
}



