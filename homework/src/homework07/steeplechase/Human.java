package homework07.steeplechase;

public class Human extends Participant {

    public Human(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }

    boolean run(Racetrack racetrack) {
        if (racetrack.getLength() <= getMaxRun()) {
            System.out.println("Participant human " + getName() + " run track " + racetrack.getName() + " on distance " + racetrack.getLength());
            return true;
        } else {
            System.out.println("Participant human " + getName() + " failed on track " + racetrack.getName() + " on distance " + racetrack.getLength());
            return false;
        }
    }

    boolean jump(Wall wall) {
        if (wall.getHeigt() <= getMaxJump()) {
            System.out.println("Participant human " + getName() + " jumped wall " + wall.getName() + " of height " + wall.getHeigt());
            return true;
        } else {
            System.out.println("Participant human " + getName() + " failed to jum wall " + wall.getName() + " of height " + wall.getHeigt());
            return false;
        }
    }
}
