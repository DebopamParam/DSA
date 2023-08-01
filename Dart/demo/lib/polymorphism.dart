
void main()
{
    // //Normal Class
    // Car toyota = Car();
    // print(toyota.color + " " + toyota.noOfSeats.toString());
    // toyota.drive();

    // print("\n");

    // //Inherited class

    // ElectricCar tesla = ElectricCar();
    // print(tesla.color + " " + tesla.noOfSeats.toString());
    // tesla.drive();
    // print("Before charging" + tesla.charge.toString());
    // tesla.recharge();
    // print("After charging" + tesla.charge.toString());

    // print("\n");

    // //Polymorphasized Class 1 
    // LevitatingCar carpet =LevitatingCar();
    // print(carpet.color);
    // carpet.drive();

    // print("\n");

    //Polymorphasized Class 2
    SelfDrivingCar dmd=SelfDrivingCar('Eden Garden');
    print(dmd.color);
    dmd.drive();

    print("\n");
}


//Parent Class
class Car
{
    String color = 'black';
    int noOfSeats=4;

    void drive() {
        print("Turn Wheen");
    }
}

//Inherited Class

class ElectricCar extends Car
{
    int charge=50;
    void recharge() {
        charge=100;
    }
}

//Polymorphasized Class

class LevitatingCar extends Car
{
    @override  //Changing a desired property of the Parent class
    void drive() {
        print("Glide like butter towards destination");
    }
}

class SelfDrivingCar extends Car
{
    String destination;

    SelfDrivingCar(this.destination);


    @override //Adding or Modifying the existing propertyof the parent class
    void drive() {
        super.drive();

        print("Wheeing towards $destination");

        print("You can sleep peacefully till we reach $destination");//Addition or Modification
    }
}

