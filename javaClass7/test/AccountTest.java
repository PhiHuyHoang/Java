/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaclass7.Account;
import javaclass7.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hallgato
 */
public class AccountTest {
    
    
    Person testPerson;
    Account testAccount;
    
    @Before
    public void setUp() {
        testAccount = new Account(testPerson,"5555",8000);
    }
    
    @Test
    public void testDeposit()
    {
        testAccount.deposit(1000);
        Assert.assertEquals(testAccount.balance,9000);
    }
    
    @Test
    public void testSufficicent()
    {
        testAccount.deposit(2000);
        Assert.assertEquals(testAccount.balance,10000);
    }

    @Test
    public void testInsufficicent()
    {
        testAccount.deposit(-9000);
        Assert.assertEquals(testAccount.balance,2000);
    }

    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
