/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dragon.InfightException;
import dragon.TheDragon;
import dragon.Trainer;
import dragon.power;
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
public class DragonTrainnerTest {
    
    public DragonTrainnerTest() {
    }
    
    TheDragon fireDragon;
    TheDragon waterDragon; 
    Trainer trainer1 = new Trainer("Trainer 1");
    Trainer trainer2 = new Trainer("Trainer 2");
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        trainer1 = new Trainer("Trainer 1");
        trainer2 = new Trainer("Trainer 2");
        fireDragon = new TheDragon(trainer1,power.fire,50,50,50);
        waterDragon = new TheDragon(trainer2,power.water,50,50,50);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testBattle() throws InfightException
    {
        Assert.assertEquals(fireDragon.battle(waterDragon), "Trainer 2 win");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
