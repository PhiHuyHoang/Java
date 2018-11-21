/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek10;

import java.io.Serializable;

/**
 *
 * @author I352015
 */
public class Person implements Serializable {

    public Person(String name) {
        this.name = name;
    }
    private String name;
    public String getName() { return name; }
    
    
}
