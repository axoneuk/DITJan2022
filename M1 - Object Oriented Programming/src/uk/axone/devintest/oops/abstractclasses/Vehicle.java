package uk.axone.devintest.oops.abstractclasses;

public abstract class Vehicle {

    String make;

    Vehicle(){
        System.out.println("Vehicle Constrcutor");
    }

    public Vehicle(String make){
        this.make = make;
    }

    //Abstract Methods
    abstract int getNumWheels();
    protected abstract String getFuelType();
    public abstract boolean isElectric();
    abstract void brake();

    //Non abstract methods
    void moveForward(){
        System.out.println(make +" Vehicle is moving forward");
    }

    void accelerate(){
        System.out.println(make+" Vehicle is accelerating");
    }

    static void honk(){
        System.out.println("Vehicle is honking");
    }

}
