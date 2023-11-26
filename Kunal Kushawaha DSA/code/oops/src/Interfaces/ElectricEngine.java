package Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("The Electric engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("The Electric engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The Electric engine swoosh");
    }
}
