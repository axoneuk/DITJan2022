package uk.axone.devintest.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        /*
        HashMap
            - Insertion Order is not maintained
            - Duplicate keys not allowed
         */

        /*
        TreeMap
         - The entries are ordered based on the key
         - Teh datatype used for the Key must implement the Comparable Interface
         - duplicate keys are not allowed
         */

        Map<String, String> appConfig = new TreeMap<>();
        appConfig.put("A - URL","www.axone.uk");
        appConfig.put("D - username1", "admin");
        appConfig.put("B - username2", "admin1");
        appConfig.put("E - username3", "admin2");
        appConfig.put("C - password","admin123P@ss");

        String value = appConfig.get("username");
        System.out.println(value);

        System.out.println("--------------------------------");

        for(Map.Entry<String, String> configItem : appConfig.entrySet()){
            System.out.println(configItem.getKey() + "   "+configItem.getValue());
        }

        Map<String, Book> bookAllocation = new TreeMap<>();
        bookAllocation.put("Ram", new Book(1, "I love Java!"));
        bookAllocation.put("Karthik", new Book(23, "Cucumber is Cool!"));

        Book b1 = bookAllocation.get("Karthik");
        System.out.println(b1.getBookName());

    }

}