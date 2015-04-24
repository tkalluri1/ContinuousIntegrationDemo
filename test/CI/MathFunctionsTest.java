/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MathFunctionsTest {
    
    public MathFunctionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class MathFunctions.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 9;
        double number2 = 2;
        MathFunctions instance = new MathFunctions();
        double expResult =12;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of subtract method, of class MathFunctions.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 9;
        double number2 = 2;
        MathFunctions instance = new MathFunctions();
        double expResult = 7;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiply method, of class MathFunctions.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 9;
        double number2 = 2;
        MathFunctions instance = new MathFunctions();
        double expResult = 18;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of divide method, of class MathFunctions.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double number1 = 9;
        double number2 = 2;
        MathFunctions instance = new MathFunctions();
        double expResult = 4.5;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of factorial method, of class MathFunctions.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double number1 = 5;
        MathFunctions instance = new MathFunctions();
        double expResult = 120;
        double result = instance.factorial(number1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of power method, of class MathFunctions.
     */
    @Test
    public void testPower() {
        System.out.println("power");
        double number1 = 2;
        double number2 = 5;
        MathFunctions instance = new MathFunctions();
        double expResult = 32;
        double result = instance.power(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of log method, of class MathFunctions.
     */
    @Test
    public void testLog() {
        System.out.println("log");
        double number1 = 10;
        MathFunctions instance = new MathFunctions();
        double expResult =2.302585092994046;
        double result = instance.log(number1);
        assertEquals(expResult, result, 0.0);
    }
    
}
