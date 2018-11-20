/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonnursery;

import java.io.Serializable;

/**
 *
 * @author hallgato
 */
public abstract class Dragon implements Serializable {
    private String birthdate;
    private int age;
    private String color;
    private int size;
    private boolean adult;
    private String name;
    public enum breathType
    {
        fire,frost,acid,ice,earth
    };
    private breathType newbreathType;
    
    public String getName()
    {
        return name;
    }
    
    public Dragon(String birthdate,int age,String color,int size,boolean adult,String name, breathType newbreathType)
    {
        this.birthdate = birthdate;
        this.age = age;
        this.color = color;
        this.size = size;
        this.adult = adult;
        this.name = name;
        this.newbreathType = newbreathType;
    }
}
