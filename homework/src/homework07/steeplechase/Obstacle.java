package homework07.steeplechase;

public abstract class Obstacle {

    private final String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
