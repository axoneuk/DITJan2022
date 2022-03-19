package uk.axone.devintest.strings;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = new String();
        char[] chrArr = {'A','X','O','N','E'};
        String str2 = new String(chrArr);
        String str3 = new String("AXONE");

        //String literal
        String strl = "AXONE";

        strl = strl.concat("TECH");
        strl = strl.concat("UK");

        System.out.println(strl);

        System.out.println("---------------------------------------");

        StringBuilder sBuff = new StringBuilder("AXONE");

        sBuff.append("TECH");
        sBuff.append("UK");
        System.out.println(sBuff);

        String strb = sBuff.toString();
    }

}
