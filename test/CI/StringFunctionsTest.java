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
public class StringFunctionsTest {
    
    public StringFunctionsTest() {
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
     * Test of reverse method, of class StringFunctions.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        String input = "teja";
        StringFunctions instance = new StringFunctions();
        String expResult = "ajet";
        String result = instance.reverse(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of lowerCase method, of class StringFunctions.
     */
    @Test
    public void testLowerCase() {
        System.out.println("lowerCase");
        String input = "TEJA";
        StringFunctions instance = new StringFunctions();
        String expResult = "teja";
        String result = instance.lowerCase(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of upperCase method, of class StringFunctions.
     */
    @Test
    public void testUpperCase() {
        System.out.println("upperCase");
        String input = "teja";
        StringFunctions instance = new StringFunctions();
        String expResult = "TEJA";
        String result = instance.upperCase(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of concat method, of class StringFunctions.
     */
    @Test
    public void testConcat() {
        System.out.println("concat");
        String input = "teja";
        String concatString = "swini";
        StringFunctions instance = new StringFunctions();
        String expResult = "tejaswini";
        String result = instance.concat(input, concatString);
        assertEquals(expResult, result);
    }

    /**
     * Test of split method, of class StringFunctions.
     */
    @Test
    public void testSplit() {
        System.out.println("split");
        String input = "tejaswini,kalluri";
        String splitToken = ",";
        StringFunctions instance = new StringFunctions();
        String expResult = "tejaswini  kalluri";
        String result = instance.split(input, splitToken);
        assertEquals(expResult, result);
    }

    /**
     * Test of toggleCase method, of class StringFunctions.
     */
    @Test
    public void testToggleCase() {
        System.out.println("toggleCase");
        String input = "tEjaSwiNi";
        StringFunctions instance = new StringFunctions();
        String expResult = "TeJAsWInI";
        String result = instance.toggleCase(input);
        assertEquals(expResult, result);
    }
    
}
