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
public abstract class Car {
    private String name;
    private Person person;
    public enum nationality { French, American, Italy};
    private nationality newnationality;
    
    public Car(String name, Person person, nationality newnationality)
    {
        this.name = name;
        this.person = person;
        this.newnationality = newnationality;
    }
    
    public void driveable()
    {
        System.out.println("I'm driven by " + person.getName());
    }
}
