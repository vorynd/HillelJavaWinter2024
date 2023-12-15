package homework06;

public class Dog extends Animal {
    static int counter;

    public Dog(String name) {
        super(name);
        counter++;
        System.out.println("Створено " + counter + " собак");
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        } else {
            System.out.println("Собака не може бігти так далеко");

        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println("Собака не може пливти так далеко");
        }
    }
}
