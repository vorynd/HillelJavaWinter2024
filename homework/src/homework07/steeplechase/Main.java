package homework07.steeplechase;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Racetrack("Track # 1", 15),
                new Wall("Wall # 1", 5),
                new Racetrack("Track # 2", 30),
                new Wall("Wall # 2", 8),
                new Racetrack("Track # 3", 40),
                new Wall("Wall # 3", 12),
                new Racetrack("Track # 4", 20),
                new Wall("Wall # 4", 10),
        };
        Participant[] participants = {
                new Human("George", 60, 15),
                new Human("Istvan", 35, 10),
                new Cat("Tomas", 50, 12),
                new Cat("Ginger", 50, 8),
                new Robot("R2d2", 15, 5),
                new Robot("T-800", 800, 80)
        };

        for (Participant participant : participants) {
            participant.overcome(obstacles);
        }
    }
}
