package homework06;

public class Animal {
    static int counter;
    private String name;

    public Animal(String name) {
        this.name = name;
        counter++;
        System.out.println("Створено " + counter + " тварин");
    }

    public void run(int length) {
        if (length > 0) {
            System.out.println(name + " пробіг " + length + " м");
        }
    }

    public void swim(int length) {
        if (length > 0) {
            System.out.println(name + " проплив " + length + " м");
        }
    }
}
