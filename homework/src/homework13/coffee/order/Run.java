package homework13.coffee.order;

public class Run {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("Martinez");
        coffeeOrderBoard.add("Lopez");
        coffeeOrderBoard.add("Sanchez");
        coffeeOrderBoard.add("Diego");
        coffeeOrderBoard.add("Mark");
        coffeeOrderBoard.add("Pedro");

        coffeeOrderBoard.draw();
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println();
        coffeeOrderBoard.draw();
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println();
        coffeeOrderBoard.draw();
        System.out.println(coffeeOrderBoard.deliver(3));
        System.out.println();
        coffeeOrderBoard.draw();

        

    }
}
