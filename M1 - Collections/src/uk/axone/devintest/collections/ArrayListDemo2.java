package uk.axone.devintest.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //ArrayList<int> numbers = new ArrayList<>();
        //Primitive Datatypes are NOT allowed within the Collection Classes
        /*
        PRIMITIVE                   Wrapper Classes(java.lang)
        - int                       Integer
        - float                     Float
        - double                    Double
        - long                      Long
        - short                     Short
        - byte                      Byte
        - char                      Character
        - boolean                   Boolean
        */

        int i = 23;
        Integer num = i;//Changing a primitive datatype to a reference datatype - auto-boxing
        int x = num.intValue();//changing a reference datatype to a primitive datatype - auto-unboxing.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1024);
        numbers.add(204904);
        numbers.add(30490840);

        for(int numb : numbers){
            System.out.println(numb);
        }

        //ArrayList is better for storing and accessing data
        //LinkedList is better for manipulating data
        List<Book> myBooks  = new LinkedList<>();
        myBooks.add(new Book(1, "Java is fun"));
        myBooks.add(new Book(12, "JavaScript is cool"));
        myBooks.add(new Book(345, "Selenium rocks!!"));

        for(Book bk : myBooks){
            System.out.println(bk.getBookID() + "  "+bk.getBookName());
        }

    }
}
