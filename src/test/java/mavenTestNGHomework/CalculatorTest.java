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
        System.out.println("Test summing");
        double actualResult = calculator.sum(50.8,3.0);
        double expectedResult = 53.8;
        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(calculator.sum(-5,3),-2);
        Assert.assertEquals(calculator.sum(-5,-3),-8);
        Assert.assertEquals(calculator.sum(0,-3),-3);
        Assert.assertEquals(calculator.sum(2,0),2);
        Assert.assertEquals(calculator.sum(9,9),18);
    }

    @Test
    public void testSubstract(){
        System.out.println("Test subtraction");
        double actualResult = calculator.subtract(5,3);
        double expectedResult = 2;
        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(calculator.subtract(-5,3),-8);
        Assert.assertEquals(calculator.subtract(-5,-3),-2);
        Assert.assertEquals(calculator.subtract(0,-3),3);
        Assert.assertEquals(calculator.subtract(2,0),2);
        Assert.assertEquals(calculator.subtract(80,40),40);
    }

    @Test
    public void testMultiply() {
        System.out.println("Test multiplication");
        double actualResult = calculator.multiply(5,3);
        double expectedResult = 15;
        Assert.assertEquals(calculator.multiply(8.2, 2.0), 16.4);
        Assert.assertEquals(calculator.multiply(5.7, 5.7), 32.49);
        Assert.assertEquals(calculator.multiply(50.5, 5.0), 252.5);
        Assert.assertEquals(calculator.multiply(200, 50), 10000);
        Assert.assertEquals(calculator.multiply(513, 10), 5130);
    }

    @Test
    public void testDivide() {
        System.out.println("Test division");
        double actualResult = calculator.divide(15,3);
        double expectedResult = 5;
        Assert.assertEquals(calculator.divide(8.2, 2.0), 4.1);
        Assert.assertEquals(calculator.divide(5.7, 5.7), 1);
        Assert.assertEquals(calculator.divide(50.5, 5.0), 10.1);
        Assert.assertEquals(calculator.divide(200, 50), 4);
        Assert.assertEquals(calculator.divide(513, 10), 51.3);
    }

    @Test
    public void testExpression(){
        System.out.println("Test expression");
        Assert.assertEquals(calculator.divide(8.2,2.0) + calculator.sum(1,2),7.1);
    }

    @BeforeClass
    public void beforeClass(){
        this.calculator = new Calculator();
    }

    @BeforeMethod
    public void runBeforeEachTest(){
        System.out.println("This runs before each test...Test has started...");
    }
}