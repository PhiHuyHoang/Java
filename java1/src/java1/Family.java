/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.util.*;
/**
 *
 * @author I352015
 */
public class Family {
    
    private List<Person> listOfPerson;
    
    public List<Person> getListOfPerson()
    {
        return listOfPerson;
    }
    
    public Family()
    {
        listOfPerson = new ArrayList<Person>();
    }
    
    public void addNewPerson(Person person)
    {
        listOfPerson.add(person);
    }
    
}
