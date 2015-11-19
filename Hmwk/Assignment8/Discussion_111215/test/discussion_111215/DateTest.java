package discussion_111215;

import discussion_111215.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateTest {
    
    public DateTest() {
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
     * Test of setMonth method, of class Date.
     */
    @Test
    public void testSetMonth() {
        System.out.println("setMonth");
        int month = 1;
        Date instance = new Date();
        boolean expResult = true;
        boolean result = instance.setMonth(month);
        assertEquals(expResult, result);        
    }

    /**
     * Test of setDay method, of class Date.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        int day = 1;
        Date instance = new Date();
        boolean expResult = true;
        boolean result = instance.setDay(day);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setYear method, of class Date.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 1801;
        Date instance = new Date();
        boolean expResult = true;
        boolean result = instance.setYear(year);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date instance = new Date();
        int expResult = 1;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date instance = new Date();
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date instance = new Date();
        int expResult = 1801;
        int result = instance.getYear();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Date.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Date instance = new Date();
        String expResult = "1/1/1801";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
