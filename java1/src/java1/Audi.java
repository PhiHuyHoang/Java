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
public class Audi extends Car {
    
    private Family family;
    public Audi(String name, Person person, nationality newnationality, Family family) {
        super(name, person, newnationality);
        this.family = family;
    }
    
    public void driveable()
    {
        for(Person person : family.getListOfPerson())
        {
            System.out.println("I'm driven by " + person.getName());
        }
    }
    
}
