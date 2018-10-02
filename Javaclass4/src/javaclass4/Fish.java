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
public class Fish extends Food {

    public Fish(String name, DIET edible, int amount, int expire, int age, boolean spoiled) {
        super(name, edible, amount, expire, age, spoiled);
    }

    @Override
    public void cycle() {
        this.expire -= 1;
        this.age += 1;
        if(this.expire == 0)
        {
            spoiled = true;
        }
        if(spoiled == true)
        {
            this.edible = DIET.CANT_EAT;
        }
    }
}
