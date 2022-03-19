package uk.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJunitDemo {

    @Test
    public void test1(){
        startTest();
        System.out.println("running test 1");
    }

    @Test
    public void test2(){
        startTest();
        System.out.println("running test 2");
    }

    @Test
    public void test3(){
        startTest();
        System.out.println("running test 3");
    }

    @Ignore
    public void test4(){
        startTest();
        System.out.println("running test 4");
    }

    private boolean startTest(){
        System.out.println("starting test ..");
        return true;
    }

}
