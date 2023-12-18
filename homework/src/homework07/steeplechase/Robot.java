package homework07.steeplechase;

public class Robot extends Participant {

    public Robot(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    boolean run(Racetrack racetrack) {
        if (racetrack.getLength() <= getMaxRun()) {
            System.out.println("Participant robot " + getName() + " run track " + racetrack.getName() + " on distance " + racetrack.getLength());
            return true;
        } else {
            System.out.println("Participant robot " + getName() + " failed on track " + racetrack.getName() + " on distance " + racetrack.getLength());
            return false;
        }
    }

    boolean jump(Wall wall) {
        if (wall.getHeigt() <= getMaxJump()) {
            System.out.println("Participant robot " + getName() + " jumped wall " + wall.getName() + " of height " + wall.getHeigt());
            return true;
        } else {
            System.out.println("Participant robot " + getName() + " failed to jum wall " + wall.getName() + " of height " + wall.getHeigt());
            return false;
        }
    }
}

