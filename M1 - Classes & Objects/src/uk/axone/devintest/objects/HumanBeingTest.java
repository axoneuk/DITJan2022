package uk.axone.devintest.objects;

public class HumanBeingTest {

    public static void main(String[] args) {

       HumanBeing ram = new HumanBeing("Ram D");
       ram.gender = "Male";
       ram.sleep();
       ram.talk();
       ram.eat();

      HumanBeing karthik = new HumanBeing("Karthik G","Male");
      karthik.talk();
      karthik.sleep();
      karthik.eat();

      //The compiler allows us to access static variables and methods using an instance, but its not appropriate.
      //System.out.println(karthik.NUM_EARS);
      //karthik.doSomething();

      //static variables and methods should always be accessed directly using the class name
      System.out.println(HumanBeing.NUM_EARS);
        HumanBeing.doSomething();
      /*HumanBeing sri = new HumanBeing("Sridevi","Female");
      sri.eat();*/

    }
}
