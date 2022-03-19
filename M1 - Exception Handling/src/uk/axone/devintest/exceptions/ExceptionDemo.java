package uk.axone.devintest.exceptions;

public class ExceptionDemo {

    static String strEx = null;

    public static void main(String[] args) {

        System.out.println("------- START ---------");

        try{
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(z);

            String[] strArr = new String[10];
            String str = strArr[11];

            strEx.trim();
        }
        catch(ArithmeticException ex){
            System.out.println("Division by ZERO is not allowed");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Please check the array index");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch(Exception ex){
            System.out.println("Something went wrong");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        finally{
            System.out.println("inside finally block");
        }
        System.out.println("----------- END ----------");

    }
}
