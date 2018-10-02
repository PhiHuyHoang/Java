/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass4;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author hallgato
 */
public class Javaclass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AgeIsHigherThan200Exception {
        // TODO code application logic here
        List<Turtle> turtles = new ArrayList<>();
        turtles.add(new SnappingTurtle("Turtle 1",197,10,30,DIET.something0));
        turtles.add(new SnappingTurtle("Turtle 2",198,20,40,DIET.something1));
        turtles.add(new SnappingTurtle("Turtle 3",130,30,50,DIET.something2));
        turtles.add(new SnappingTurtle("Turtle 4",140,40,60,DIET.something0));
        
        List<Food> food = new ArrayList<>();
        food.add(new Fish("Fish 1", DIET.something0, 10, 10, 20, false));
        food.add(new Fish("Fish 2", DIET.something1, 20, 30, 10, false));
        food.add(new Fish("Fish 3", DIET.something2, 30, 30, 40, false));
        food.add(new Fish("Fish 4", DIET.something0, 50, 10, 20, false));
        food.add(new Seaweed("Seaweed 1", DIET.something0, 50, 10, 20, false));
        
        
        try{
            for (int i = 0; i < 20; i++) {
                turtles.forEach((turtle) -> turtle.cycle());
                food.forEach((currentFood) -> currentFood.cycle());
                TimeUnit.SECONDS.sleep(1);
            }
        }catch(InterruptedException e){
        
        }
        
    }
    
}
