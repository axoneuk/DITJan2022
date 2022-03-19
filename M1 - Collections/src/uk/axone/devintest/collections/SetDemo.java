package uk.axone.devintest.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        /*
        HashSet
        - does not maintain insertion order
        - does not store duplicates
        - allows null
         */

        Set<String> countries = new HashSet<>();
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United States");
        countries.add("Germany");
        countries.add("France");
        countries.add(null);
        countries.add(null);
        countries.add("Spain");

        for(String country : countries){
            System.out.println(country);
        }

    }

}