package uk.axone.devintest.oops.inheritance;

public class MobilePhone extends Phone {

    public MobilePhone(){
        System.out.println("MobilePhone Constructor");
    }

    MobilePhone(String make){
        super(make);
        System.out.println("MobilePhone Constructor 2");
    }

    void sendSMS(){
        System.out.println("MobilePhone is sending SMS");
    }

    void playMusic(){
        System.out.println("MobilePhone is playing music");
    }

    //Overriding the method in the parent class
    @Override
    void makeCall(int calledNum){
        System.out.println("Mobile Phone is calling "+calledNum);
    }

    void doSomething(){
        makeCall(8885885);
        receiveCall(38854954);
        receiveCall();
        receiveCall(940845,"rtuiirt");
    }

    public static void main(String[] args) {

    }

}
