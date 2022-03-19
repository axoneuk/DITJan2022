package uk.axone.devintest.arrays;

import java.io.File;

public class ArrayDemo {

    public static void main(String[] args) {

        //initialise an array of 5 Strings
        String[] testTools = new String[5];
        testTools[0] = "Selenium";
        testTools[1] = "Cucumber";
        testTools[2] = "jBehave";
        testTools[3] = "Appium";
        testTools[4] = "TestNG";
        //System.out.println(testTools.length);
        for(int i=0; i < testTools.length; i++){
            System.out.println(testTools[i]);
        }

       String[] progLangs = {"java","c++","Python","Scala"};
        for(int i=0; i < progLangs.length; i++){
            System.out.println(progLangs[i]);
        }

        int[] nums = {1,2,34,948093, 439395, 937898273, 7, 8398, 8349439, 438994};
        System.out.println(nums[9]);

        File[] myFiles = new File[45];

        Car[] myCars = new Car[20];

    }
}
