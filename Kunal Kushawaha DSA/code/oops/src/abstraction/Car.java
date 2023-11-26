package abstraction;

import Interfaces.NiceCar;

public class Car {

    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();
        car.start_music();
        car.give_Surrounding_Status();
        car.stop_music();
        car.stop();
    }

}
