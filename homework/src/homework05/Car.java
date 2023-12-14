package homework05;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Vroom-Vroom");
    }

    private void startElectricity() {
        System.out.println("Starting electricity");
    }

    private void startCommand() {
        System.out.println("Start command");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system");
    }
}
