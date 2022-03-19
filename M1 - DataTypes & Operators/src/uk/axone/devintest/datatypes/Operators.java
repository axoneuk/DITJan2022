package uk.axone.devintest.datatypes;

public class Operators {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        //Arithmetic operators
        int z = x + y;//Addition
        int a = x - y;//subtraction
        int b = x * y;//multiplication
        int c = x / y;//Division
        int d = x % y;//Modulus 3 % 2 = 1; 15 % 3 = 0; 7 % 5 = 2

        //Assignment
        int k = 4;
        int m = 3;

        k += m;// k = k + m
        k -= m;// k = k - m
        k *= m;// k= k * m
        k /= m;// K = k / m

        //increment operators
        x = 20;
        y = 30;

        System.out.println(x++); // x =  x + 1 - post-increment - value is incremented but available in the next statement only
        System.out.println(x);

        System.out.println(++y); // y = y + 1 - pre- increment - value is incremented and available in the same statement
        System.out.println(y);

        x--;//x = x -1 - post-derement
        --y;//y = y -1 - pre decrement

        x = 30;
        y = 10;
        //Comparison operators
        boolean result = x > y;
        System.out.println(result);
        boolean result2 = x < y;
        System.out.println(result2);

        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean result3 = (x == y);//comparing x and y for equality - only use with primitive datatypes
        boolean result4 = (x != y);//comparing x and y for inequality - only use with primitive datatypes
    }

}
