package uk.axone.devintest.oops.polymorphism;

import uk.axone.devintest.oops.abstractclasses.Car;
import uk.axone.devintest.oops.abstractclasses.Truck;
import uk.axone.devintest.oops.inheritance.MobilePhone;
import uk.axone.devintest.oops.inheritance.SmartPhone;
import uk.axone.devintest.oops.interfaces.Barclays;
import uk.axone.devintest.oops.interfaces.HSBC;

public class HouseTest {

    public static void main(String[] args) {

        House ramsHouse = new House();
        ramsHouse.setName("Arnwood");
        ramsHouse.setAddress("Reading");
        ramsHouse.setNumRooms(2);
        ramsHouse.setFlat(true);
        MobilePhone mph = new MobilePhone();
        ramsHouse.setPhone(mph);
        Car ramsCar = new Car();
        ramsHouse.setVehicle(ramsCar);
        HSBC ramsBank = new HSBC("40-42-09");
        ramsHouse.setBank(ramsBank);

        House tomsHouse = new House();
        tomsHouse.setNumRooms(5);
        tomsHouse.setPhone(new SmartPhone());
        tomsHouse.setVehicle(new Truck());
        tomsHouse.setBank(new Barclays());
    }

}
