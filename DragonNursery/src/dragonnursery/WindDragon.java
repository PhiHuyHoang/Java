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
public class WindDragon extends Dragon {
    private int increaseSpeed;
    public WindDragon(String birthdate, int age, String color, int size, boolean adult, String name, breathType newbreathType, int increaseSpeed) {
        super(birthdate, age, color, size, adult, name, newbreathType);
        this.increaseSpeed = increaseSpeed;
    }

}
