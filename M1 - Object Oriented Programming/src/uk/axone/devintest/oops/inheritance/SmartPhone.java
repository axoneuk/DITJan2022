package uk.axone.devintest.oops.inheritance;

public final class SmartPhone extends MobilePhone{


    public SmartPhone(){
        System.out.println("SmartPhone Constructor");
    }

    SmartPhone(String make){
        super(make);
        System.out.println("SmartPhone Constructor 2");

    }

    SmartPhone (String make, String model){
        System.out.println("SmartPhone Constructor 3");
    }

    @Override
    void makeCall(int calledNum){
        System.out.println("SmartPhone is making a call to "+ calledNum);
    }


    void installApp(){

    }

    void runGooleMaps(){

    }

    void doSomethingElse(){
        receiveCall(38854954);
        receiveCall();
        receiveCall(940845,"rtuiirt");
    }

    public static void main(String[] args) {

    }
}
