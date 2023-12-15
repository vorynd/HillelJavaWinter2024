package homework06;

public class Cat extends Animal {
    static int counter;

    public Cat(String name) {
        super(name);
        counter++;
        System.out.println("Створено " + counter + " котів");
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        } else {
            System.out.println("Кіт не може бігти так далеко");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кіт не вміє плавати");
    }
}
