package homework06;

public class Main {
    public static void main(String[] args) {
        Dog bob = new Dog("Боб");
        Cat tom = new Cat("Том");

        bob.run(25);
        bob.swim(5);

        tom.run(50);
        tom.swim(10);
    }
}
