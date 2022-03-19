package uk.axone.devintest.accmod.pack2;

import uk.axone.devintest.accmod.pack1.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {

    void checkProtectedAccess(){
        strPro = "Developer In Test";
        protectedMethod();
    }

    void checkDefaultAccess(){
        //str = "Developer In Test";
        //defaultMethod();
    }

    void checkPublicAccess(){
        strPub = "Developer In Test";
        publicMethod();
    }

    void checkPrivateAccess(){
        //strPri = "DevOps Engineer";
        //privateMethod();
    }
}
