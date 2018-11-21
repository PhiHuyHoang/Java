/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaweek10.Account;
import javaweek10.Person;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I352015
 */
public class AccountTest {
    
    public AccountTest() {
    }
    Person person1;
    Account account1;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        person1 = new Person("Person 1");
        account1 = new Account(person1,"1234567",5000);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testDeposit()
    {
        account1.deposit(5000);
        assertEquals(account1.getBalance(), 10000);
    }
    
    @Test
    public void testSufficientDeposit()
    {
        account1.deposit(2000);
        assertEquals(account1.getBalance(),7000);
    }
    
    @Test
    public void testInsufficientDeposit()
    {
        account1.deposit(-6000);
        assertEquals(account1.getBalance(),-1000);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
