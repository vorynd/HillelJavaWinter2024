package homework07.steeplechase;

public class Racetrack extends Obstacle {
    private  final int length;

    public Racetrack(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
