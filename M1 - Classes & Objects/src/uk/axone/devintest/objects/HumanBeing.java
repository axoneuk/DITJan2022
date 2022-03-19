package uk.axone.devintest.objects;

public class HumanBeing {

    //Instance variables (they are non-static)
    String name;
    String gender;
    int age;
    String eyeColour;
    String bloodGp;
    int height;
    int weight;

    //Class variables (they are static)
    //static variables are always global - can only be created outside of methods and constructors
    final static int NUM_EYES = 2;
    final static int NUM_EARS = 2;
    final static int NUM_LEGS = 2;
    final static int NUM_HANDS = 2;

    HumanBeing(String name){
        this.name = name;
        breathe();
    }

    HumanBeing(String hName, String hGender){
        this.name = hName;
        this.gender = hGender;
        breathe();
    }


    //method overloading - talk method is overloaded
    void talk(){
        System.out.println(name + " is talking");
    }

    void talk(String language){
        System.out.println(name + " is talking in "+ language);
    }

    void talk(String language, int loudness){

    }

    void talk(int loudness, String language){

    }

    void work(){
        System.out.println(name + " is working");
    }

    void eat(){
        System.out.println(name + " who is "+ gender +" is eating");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }

    void breathe(){
        System.out.println(name + " is breathing");
    }

    //Only static variables can be used in static methods
    static void doSomething(){
        System.out.println("HumanBeing is doing something with "+ NUM_HANDS + " hands");
    }

}
