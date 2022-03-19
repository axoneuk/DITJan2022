package uk.axone.devintest.oops.inheritance;

public class PhoneTest {

    public static void main(String[] args) {

        SmartPhone iPhone = new SmartPhone("Apple");
        iPhone.receiveCall(93403094);

        System.out.println("----------------------------");
        
        iPhone = new SmartPhone();

        System.out.println("----------------------------");

        iPhone = new SmartPhone("Google","pixel3");

        //iPhone.receiveCall(98049);

       /* mph.makeCall(76787888);
        mph.receiveCall(76758889);
        mph.playMusic();
        mph.sendSMS();


        System.out.println("----------------------------");

        SmartPhone iPhone = new SmartPhone();
        iPhone.makeCall(98093480);
        iPhone.receiveCall(8548885);*/

        Phone ph1 = new MobilePhone();
        ph1.receiveCall();
        ph1.receiveCall(439803);
        ph1.receiveCall(9430,"hello");

    }
}
