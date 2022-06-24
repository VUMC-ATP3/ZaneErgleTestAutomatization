package mavenTestNGHomework;

import classroom6.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public void testSum(){
        System.out.println("Test sum ir sācies...");
        int actualResult = calculator.sum(5,3);
        int expectedResult = 8;
        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(calculator.sum(-5,3),-2);
        Assert.assertEquals(calculator.sum(-5,-3),-8);
        Assert.assertEquals(calculator.sum(0,-3),-3);
        Assert.assertEquals(calculator.sum(2,0),2);
        Assert.assertEquals(calculator.sum(0,0),0);
    }

    @Test
    public void dalisanasTests(){
        System.out.println("Dalisanas tests ir sācies..");
        Assert.assertEquals(calculator.divide(8.2,2.0),4.1);
    }

    @Test
    public void izteiksmesTests(){
        System.out.println("izteiksmes tests");
        Assert.assertEquals(calculator.divide(8.2,2.0) + calculator.sum(1,2),7.1);
    }

    @BeforeClass
    public void beforeClass(){
        this.calculator = new Calculator();
    }

    @BeforeMethod
    public void izpilditPirmsKatraTesta(){
        System.out.println("Izpildas before test.");
    }


}