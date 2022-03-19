package uk.axone.devintest.datatypes;

import java.io.File;

public class DataTypes {

    //Primitive DataTypes

    //Numeric - Integers
    byte myByte = 125;
    short myShort = 32337;
    int myInt = 93456689;
    long myLong = 784899594499499945L;

    //Numeric - Floating point
    float myFloat = 10.86457F;//32 bit number - 7 decimal places
    double myDouble = 678.8948972893798;//64 bit number - 16 decimal places

    char mychar = 'A';

    boolean bool1 = true;
    boolean bool2 = false;

    //Reference Datatypes
    //Classes from Java API library
    File f1 = new File("readme.txt");
    String str = new String("Axone");

    //your own classes
    Employee ram = new Employee();
    DataTypes dt = new DataTypes();
}
