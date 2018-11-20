/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonnursery;

/**
 *
 * @author hallgato
 */
public class FireDragon extends Dragon {
    private boolean EatHuman;
    public FireDragon(String birthdate, int age, String color, int size, boolean adult, String name, breathType newbreathType, boolean EatHuman) {
        super(birthdate, age, color, size, adult, name, newbreathType);
        this.EatHuman = EatHuman;
    }  
}
