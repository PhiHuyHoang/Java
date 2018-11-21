/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author I352015
 */
public class BMW extends Car {
    private boolean fanciness;
    public BMW(String name, Person person, nationality newnationality, boolean fanciness) {
        super(name, person, newnationality);
        this.fanciness = fanciness;
    }
    
}
