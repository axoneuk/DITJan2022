package uk.axone.devintest.objects;

import java.io.File;

public class Variables {
    /* global variables - Declared outside of methods and constructors
                        - they can be used throughout the class

                        1) Instance variables : non-static
                        2) Class variables : static
                        Note that static variables must always be global
     */
    //Instance variables
    String str;
    HumanBeing ram;
    Employee karthik;
    int i = 10;
    File f1 = new File("readme.txt");

    //Class variables
    static String str1;
    static HumanBeing tom;
    static Employee jack;
    static int a;

    /*local variables - scope is limited to the method or constructor
        1) variables declared in a method/cont
        2) arguments passed to a method/const
     */

    int doSomething(int numTimes){//numTimes - method argument -local
        karthik = new Employee();
        i = 11;
        numTimes = 20;//local to this method
        int j = 32;//local variable
        String strLocal = "doing Something";//local variable
        return j;
    }

    void doSomethingElse(){
        i = 30;
        //numTimes = 45;
        //j = 32;
        //strLocal = "Axone";
        String strLocal = "doing Something";
        str = "Axone";
    }
}