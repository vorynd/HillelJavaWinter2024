package homework07.steeplechase;

public abstract class Participant {
    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Participant(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public void overcome(Obstacle[] obstacles) {
        boolean canProceed = true;
        for (Obstacle obstacle :
                obstacles) {
            if (obstacle.getClass().equals(Wall.class)) {
                canProceed = jump((Wall) obstacle);
            } else {
                canProceed = run((Racetrack) obstacle);
            }
            if (!canProceed) {
                System.out.println(getName() + " is eliminated from the competition");
                break;
            }
        }
        if (canProceed) {
            System.out.println(getName() + " completed stepplechase");
        }
    }

    boolean run(Racetrack racetrack) {
        return racetrack.getLength() <= getMaxRun();
    }

    boolean jump(Wall wall) {
        return wall.getHeigt() <= getMaxJump();
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
