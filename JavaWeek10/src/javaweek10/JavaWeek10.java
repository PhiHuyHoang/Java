/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek10;

import com.google.gson.Gson;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author I352015
 */
public class JavaWeek10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        Person person1 = new Person("Person 1");
        Account account1 = new Account(person1,"123456789",5000);
        try
        {
        FileOutputStream fos = new FileOutputStream("hoang.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person1);
        
        FileInputStream fis = new FileInputStream("hoang.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person newPerson1 = (Person)ois.readObject();
        System.out.println(newPerson1.getName());
        
        }catch(FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        
        Gson gson = new Gson();
        String json = gson.toJson(account1);
        System.out.println(json);
        Account newAccount1 = gson.fromJson(json, Account.class);
        System.out.println(newAccount1.getAccountNumber());
    }
    
}
