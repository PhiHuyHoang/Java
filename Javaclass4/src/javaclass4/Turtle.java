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

enum DIET {something0,something1,something2, CANT_EAT}

public abstract class Turtle implements Expirable
{
    
    String name;
    int age;
    int speed;
    DIET diet;
    int stomach;
    
    public Turtle(String name, int age, int speed, int stomach, DIET diet) throws AgeIsHigherThan200Exception
    {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.stomach = stomach;
        this.diet = diet;
        
        if(age > 200)
        {
            throw new AgeIsHigherThan200Exception("Age greater than 200");
        }
    }
   
    public abstract boolean eat(Food food);
   
    public abstract void die();
    public abstract void live();
}

