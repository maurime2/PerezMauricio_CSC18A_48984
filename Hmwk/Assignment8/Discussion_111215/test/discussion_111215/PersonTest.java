package discussion_111215;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    public PersonTest() {
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
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Bill";
        Person instance = new Person(firstName,"Jones",new Date(1,1,2000));
        instance.setFirstName(firstName);
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Jones";
        Person instance = new Person("Bill","Jones",new Date(1,1,2000));;
        instance.setLastName(lastName);
        
    }

        /**
     * Test of setDateOfBirth method, of class Person.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        Date dob = new Date(1,1,2000);
        Person instance = new Person("Bill","Jones",dob);
        instance.setDateOfBirth(dob);
        
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "Bill";
        Person instance = new Person(expResult,"Jones",new Date(1,1,2000));        
        String result = instance.getFirstName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");        
        String expResult = "Jones";
        Person instance = new Person("Bill",expResult,new Date(1,1,2000));
        String result = instance.getLastName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getDateOfBirth method, of class Person.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Date expResult = new Date(1,1,2000);
        Person instance = new Person("Bill", "Jones", expResult);        
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);        
    }
    
}
