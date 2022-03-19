package uk.axone.devintest.chapter1;

import java.io.File;
import java.util.ArrayList;

/**
 * Author - Ram
 * Date -16 Jan 2022
 */

public class MyClass {

    //Variables
    int x = 10;//this statement is initialising a variable of the type int with an initial value of 10
    int y = 20;//data type - int, variable name is y and the value is 20
    String str ="Axone";

    StringBuffer sBuff;
    Thread t1;
    Process p1;
    File f1;
    ArrayList arrLst;


    //Constructor
    //No return Type
    //name matches the class
    MyClass(){
        System.out.println("Inside constructor");
    }

    //methods
    void addNumbers(){
        int z = x + y;
        System.out.println(z);
    }

    /*void subtractNumbers(){
        int a = 32;
        int b= 30;
        int c = a -b;
    }*/

    void subtractNumbers(){
        int a = 20;
        int b= 10;
        int c = a -b;
        System.out.println(c);
    }

    int multiplyNumbers(){
        int p = x * y;
        return p;
    }

    int divideNumbers(int a, int b){
        int q = a / b;
        return q;
    }

    void main(){

    }

    //THE main method
    public static void main(String[] args) {
        //Execution starts here - first statement in the main method
        System.out.println("Starting exectuion");

        MyClass mc = new MyClass();//creating an instance of MyClass, constructor is invoked
        mc.addNumbers();
        mc.subtractNumbers();
        int p = mc.multiplyNumbers();
        System.out.println("product is "+p);
        int q = mc.divideNumbers(100, 50);
        System.out.println("Quotient is "+q);
    }

}
