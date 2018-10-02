/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass4;

/**
 *
 * @author hallgato
 */
public class SnappingTurtle extends Turtle{

    public SnappingTurtle(String name, int age, int speed, int stomach,DIET diet) throws AgeIsHigherThan200Exception {
        super(name, age, speed, stomach,diet);
    }
    
    public boolean eat(Food food)
    {
        if(food.edible == this.diet)
        {
            this.stomach += food.amount;
            return true;          
        }
        else
        {
            return false;
        }
    }

    @Override
    public void cycle() {
        this.age += 1;
        this.stomach -= 1;
        
        if( age >= 200)
        {
            die();
        }
    }

    @Override
    public void die() {
        System.out.println("The cycle of life can be cruel");
    }
    @Override
    public void live() {
        System.out.println("A turtle has made into the water!");
    }
    
}
