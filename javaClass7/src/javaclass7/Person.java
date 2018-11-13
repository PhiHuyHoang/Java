/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass7;

import java.io.Serializable;

/**
 *
 * @author hallgato
 */
public class Person implements Serializable {
    
    private String name;
    
    public String getName(){return name;}
    
    public Person(String name)
    {
        this.name = name;
    }
}
