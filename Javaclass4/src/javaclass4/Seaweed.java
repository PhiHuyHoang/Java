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
public class Seaweed extends Food{

    public Seaweed(String name, DIET edible, int amount, int expire, int age, boolean spoiled) {
        super(name, edible, amount, expire, age, spoiled);
    }

    @Override
    public void cycle() {
        this.age += 1;
    }
    
}
