package uk.axone.devintest.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        /*
        //pre java 1.4
        ArrayList herbs = new ArrayList<String>();

        //since java 1.5
        ArrayList<String> hrbs = new ArrayList<String>();
        */

        //ARRAYLIST
        //- Maintians insertion order
        // -Allows duplicates
        // -Allows null

        //since Java 1.7
        ArrayList<String> herbs = new ArrayList<>();
        herbs.add("Basil");
        herbs.add("Thyme");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add("Rosemary");
        herbs.add(null);
        herbs.add("Coriander");
        herbs.add("Mint");

        herbs.remove(2);
        herbs.add(0, "Mint");
        herbs.set(1, "bay leaf");

        for(String hrb : herbs){
            System.out.println(hrb);
        }

        System.out.println("-------------------------");

        for(int i=0; i < herbs.size(); i++){
            System.out.println(herbs.get(i));
        }

    }

}
