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
public abstract class Food implements Expirable {
    public String name;
    public DIET edible;
    public int amount;
    public int expire;
    public int age;
    public boolean spoiled;
    
    public Food(String name, DIET edible, int amount,int expire,int age, boolean spoiled)
    {
        this.name = name;
        this.edible = edible;
        this.amount = amount;
        this.expire = expire;
        this.age = age;
        this.spoiled = spoiled;
    }
}
