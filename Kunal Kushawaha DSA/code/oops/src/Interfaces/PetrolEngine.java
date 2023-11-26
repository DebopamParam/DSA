package Interfaces;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("The petrol engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("The petrol engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The petrol engine vrooooom");
    }
}
