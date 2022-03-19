package uk.axone.devintest.oops.inheritance;

public class Phone {

    private String make;
    private String model;
    int price;

    Phone(){
        System.out.println("Phone Constructor");
    }

    Phone(String make){
        System.out.println("Phone Constructor 2");
        this.make = make;
    }


     void makeCall(int calledNum){
        System.out.println("Phone is making a call to "+ calledNum);
    }

    //receiveCall method is overloaded
    void receiveCall(int callingNum){
        System.out.println(make +" Phone is receiving a call from "+callingNum);
    }

    final void receiveCall(){

    }

    void receiveCall(int callingNum, String message){

    }

    public static void main(String[] args) {

    }
}
