package uk.axone.devintest.junit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtils_Test {

    AppUtils app = new AppUtils();

    @Test
    public void add_test1(){
        int actResult = app.add(100, 200);
        int expResult = 300;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void add_test2(){
        int actResult = app.add(100, -200);
        int expResult = -100;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void add_test3(){
        int actResult = app.add(-100, -200);
        int expResult = -300;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_test1(){
        int actResult = app.multiply(10, 20);
        int expResult = 200;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_test2(){
        int actResult = app.multiply(10, -20);
        int expResult = -200;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_test3(){
        int actResult = app.multiply(-10, -20);
        int expResult = 200;
        System.out.println("Actual Result = "+actResult);
        Assert.assertEquals(expResult, actResult);
    }
}
