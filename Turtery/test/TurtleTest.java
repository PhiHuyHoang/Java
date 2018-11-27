/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import turtery.Handler;
import turtery.NotSameAquariumException;
import turtery.Turtle;
import turtery.cutenessFactor;

/**
 *
 * @author hallgato
 */
public class TurtleTest {
    
    private Handler handler1;
    private Handler handler2;
    
    private Turtle turtle1;
    private Turtle turtle2;    
    
    @Before
    public void setUp() {
        handler1 = new Handler("Handler 1");
        handler2 = new Handler("Handler 2");
        turtle1 = new Turtle(handler1,cutenessFactor.adorable,20,30);
        turtle2 = new Turtle(handler2,cutenessFactor.menacing,20,30);
    }
    
    @Test
    public void testDuelMethod() throws NotSameAquariumException
    {
        assertEquals(turtle1.duel(turtle2),"Handler 2 win");
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
