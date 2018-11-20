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
public class IceDragon extends Dragon {
    private String transform;
    public IceDragon(String birthdate, int age, String color, int size, boolean adult, String name, breathType newbreathType, String transform) {
        super(birthdate, age, color, size, adult, name, newbreathType);
        this.transform = transform;
    }
    
}
