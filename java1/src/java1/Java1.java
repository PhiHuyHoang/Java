/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.ArrayList;
import java.util.List;
import java1.Car.nationality;

/**
 *
 * @author I352015
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Person("person 1");
        Person person2 = new Person("person 2");
        Person person3 = new Person("person 3");
        
        Family family = new Family();
        family.addNewPerson(person1);
        family.addNewPerson(person2);
        family.addNewPerson(person3);
        
        BMW bmw = new BMW("BMW-3000",person1,nationality.American,true);
        Audi audi = new Audi("Audi-4000",person2,nationality.Italy,family);
        Renault renault = new Renault("Renault-5000",person3);
        
        List<Car> listOfCar = new ArrayList<Car>();
        
        listOfCar.add(bmw);
        listOfCar.add(audi);
        listOfCar.add(renault);
        
        for(Car car : listOfCar)
        {
            car.driveable();
        }
        
    }
    
}
