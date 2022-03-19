package uk.axone.devintest.accmod.pack2;

import uk.axone.devintest.accmod.pack1.AccessModifiers;

public class AccessTest {

    void checkAccess(){
        AccessModifiers accMod = new AccessModifiers();
        accMod.publicMethod();
        //accMod.privateMethod();
        //accMod.defaultMethod();
        //accMod.protectedMethod();
    }
}
