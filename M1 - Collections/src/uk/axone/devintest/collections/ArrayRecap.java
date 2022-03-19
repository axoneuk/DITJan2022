package uk.axone.devintest.collections;

public class ArrayRecap {

    public static void main(String[] args) {

        String[] strArr = new String[4];
        int[] numbers = {1,2,3,4,5};

        String[] herbs = {"Thyme","Rosemary","Basil","Coriander"};


        //for loop
        for (int i=0; i < herbs.length; i++){
            System.out.println(herbs[i]);
            if(i == 1){
                herbs[i] = "mint";
            }
        }

        System.out.println("----------------------------");

        //for each loop (Enhanced for loop)
        for(String str : herbs){
            System.out.println(str);
        }

    }

}