package uk.axone.devintest.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        /*
            TreeSet
            - null not allowed
            - Duplicates not allowed
            - Data is ordered
            - The datatype used for elements must implement the Comparable<T> interface
        */

        Set<String> countries = new TreeSet<>();
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United Kingdom");
        countries.add("United States");
        countries.add("Germany");
        countries.add("France");
        countries.add("Chile");
        countries.add("Spain");
        countries.add("Argentina");
        countries.add("Brazil");

        for(String country : countries){
            System.out.println(country);
        }

        System.out.println("--------------------------");

        Set<Book> myBooks = new TreeSet<>();
        myBooks.add(new Book(1, "D -Java is fun"));
        myBooks.add(new Book(12, "B -JavaScript is cool"));
        myBooks.add(new Book(345, "A -Selenium rocks!!"));
        myBooks.add(new Book(34, "C - I love Java!!"));
        myBooks.add(new Book(567, "E - cucumber is cool!!"));

        for(Book bk: myBooks){
            System.out.println(bk.getBookID()+"  "+ bk.getBookName());
        }


    }



}
