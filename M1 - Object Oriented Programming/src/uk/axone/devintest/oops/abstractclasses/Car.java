package uk.axone.devintest.oops.abstractclasses;

public class Car extends Vehicle{

    public Car(){
        System.out.println("Car Constrcutor");
    }

    public Car(String make){
        super(make);
    }

    @Override
    int getNumWheels() {
        return 4;
    }

    @Override
    protected String getFuelType() {
        return "Petrol";
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    @Override
    void brake() {
        System.out.println("Car is stopping");
    }
}
