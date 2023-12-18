package homework07.steeplechase;

public class Wall extends Obstacle {
    private final int heigt;

    public Wall(String name, int heigt) {
        super(name);
        this.heigt = heigt;
    }

    public int getHeigt() {
        return heigt;
    }
}
