package uk.axone.devintest.oops.abstractclasses;

public class VehicleTest {

    public static void main(String[] args) {

        //Vehicle.honk();

        //Car myCar = new Car();
       /* myCar.getNumWheels();
        myCar.accelerate();*/

        //Abstract classes cannot be instantiated
        //Vehicle myVh = new Vehicle();

        Vehicle vh1 = new Car();
        Vehicle vh2 = new Bike();
        Vehicle vh3 = new Truck();

        vh1.brake();
        vh2.brake();
        vh3.brake();

    }

}
