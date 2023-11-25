package ua.hillel.shutko.homework2.car;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Launch of the electronic system");
    }

    private void startCommand() {
        System.out.println("Launch of the command system");
    }

    private void startFuelSystem() {
        System.out.println("Starting the fuel system");
    }
}
