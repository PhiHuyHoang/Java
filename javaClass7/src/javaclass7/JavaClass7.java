/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass7;
import com.google.gson.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;
/**
 *
 * @author hallgato
 */
public class JavaClass7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person Hoang = new Person("Hoang");
        Person Hoang1 = new Person("Hoang1");
        Person Hoang2 = new Person("Hoang2");
        Person Hoang3 = new Person("Hoang3");
        Person Hoang4 = new Person("Hoang4");
        
        Account AHoang = new Account(Hoang,"12340",1000);
        Account AHoang1 = new Account(Hoang1,"12341",2000);
        Account AHoang2 = new Account(Hoang2,"12342",3000);
        Account AHoang3 = new Account(Hoang3,"12343",4000);
        Account AHoang4 = new Account(Hoang4,"12344",5000);
        
        //serialization
        
        try
        {
            FileOutputStream fos = new FileOutputStream("hoang.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(Hoang);
            
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        FileInputStream fis;
        ObjectInputStream ois;
        try{
            fis = new FileInputStream("hoang.txt");
            ois = new ObjectInputStream(fis);
            Person newHoang = (Person)ois.readObject();
            System.out.println(newHoang.getName());
        }catch(FileNotFoundException ex)
        {
            System.out.println(ex);
        }
        
        //classes to json
        Gson gson = new Gson();
        String json = gson.toJson(AHoang);
        String json1 = gson.toJson(AHoang1);
        String json2 = gson.toJson(AHoang2);
        String json3 = gson.toJson(AHoang3);
        String json4 = gson.toJson(AHoang4);
        
        System.out.println(json);
        System.out.println(json1);
        System.out.println(json2);
        System.out.println(json3);
        System.out.println(json4);
        
        //json to classes
        Account jsonHoang = gson.fromJson(json,Account.class);
        Account jsonHoang1 = gson.fromJson(json1,Account.class);
        Account jsonHoang2 = gson.fromJson(json2,Account.class);
        Account jsonHoang3 = gson.fromJson(json3,Account.class);
        Account jsonHoang4 = gson.fromJson(json4,Account.class);
        
        System.out.println(jsonHoang.getAccountNumber());
        System.out.println(jsonHoang1.getAccountNumber());
        System.out.println(jsonHoang2.getAccountNumber());
        System.out.println(jsonHoang3.getAccountNumber());
        System.out.println(jsonHoang4.getAccountNumber());
        
    }
    
}
