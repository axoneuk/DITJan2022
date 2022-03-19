package uk.axone.devintest.accmod.pack1;

public class AccessTest {

    void testAccess(){

        AccessModifiers accMod = new AccessModifiers();

        //public,protected and default variables and methods can be accessed outside the class in another class in the same package
        accMod.publicMethod();
        accMod.strPub = "Axone";

        accMod.protectedMethod();
        accMod.strPro = "Axone";

        accMod.defaultMethod();
        accMod.str = "Axone";

        //private methods and variables cannot be accessed outside of the class
        //accMod.privateMethod();
        //accMod.strPri = "Axone";

    }
}
