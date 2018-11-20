/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonnursery;
import dragonnursery.Dragon.breathType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *
 * @author hallgato
 */
public class DragonNursery {

    /**
     * @param args the command line arguments
     */
    
    static List<Dragon> listOfDragon = new ArrayList<Dragon>();
    
    public static void AddDragon(List<Dragon> newlistOfDragon)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Dragon type: \n1.Fire Dragon\n2.Ice Dragon\n3.Wind Dragon");
        String checkTypeOfDragon = in.nextLine();   
        //String birthdate,int age,String color,int size,boolean adult,String name, breathType newbreathType
        System.out.println("Enter Dragon birthdate: ");
        String birthdate = in.nextLine();
        System.out.println("Enter Dragon age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Enter Dragon color: ");
        String color = in.nextLine();
        System.out.println("Enter Dragon size: ");
        int size = in.nextInt();
        System.out.println("Dragon adult is Adult?(true/false): ");
        boolean adult = in.nextBoolean();
        in.nextLine();
        System.out.println("Enter Dragon name: ");
        String name = in.nextLine();
        System.out.println("Enter Dragon breath type: ");
        breathType newbreathType = breathType.valueOf(in.nextLine());
        Dragon newDragon = null;
        switch(checkTypeOfDragon)
        {
            case "1": 
                System.out.println("Dragon eat human? (true/false): ");
                boolean eatHuman = in.nextBoolean();
                newDragon = new FireDragon(birthdate,age,color,size,adult,name,newbreathType,eatHuman); break;
            case "2":
                System.out.println("Increase Dragon speed: ");
                String transform = in.nextLine();
                newDragon = new IceDragon(birthdate,age,color,size,adult,name,newbreathType,transform); break;
            case "3":
                System.out.println("Increase Dragon speed: ");
                int speed = in.nextInt();
                newDragon = new WindDragon(birthdate,age,color,size,adult,name,newbreathType,speed); break;
        }
        if (newlistOfDragon.contains(newDragon)) {
            System.out.println("Dragon is already existed");
        } else {
            newlistOfDragon.add(newDragon);
        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here

        FireDragon fireDragon1 = new FireDragon("20/11",200,"Blue",20,true,"Fire Dragon 1",breathType.fire,false);
        FireDragon fireDragon2 = new FireDragon("20/11",300,"Blue",20,true,"Fire Dragon 2",breathType.fire,false);
        FireDragon fireDragon3 = new FireDragon("20/11",400,"Blue",20,true,"Fire Dragon 3",breathType.fire,false);
        
        IceDragon iceDragon1 = new IceDragon("20/11",200,"Blue",20,true,"Ice Dragon 1",breathType.ice,"Naruto");
        IceDragon iceDragon2 = new IceDragon("20/11",200,"Blue",30,true,"Ice Dragon 2",breathType.ice,"Adam Levine");
        IceDragon iceDragon3 = new IceDragon("20/11",200,"Blue",50,true,"Ice Dragon 3",breathType.ice,"Bruce Lee");
        
        WindDragon windDragon1 = new WindDragon("20/11",200,"Blue",20,true,"Wind Dragon 1",breathType.acid,100);
        WindDragon windDragon2 = new WindDragon("20/11",200,"Blue",50,true,"Wind Dragon 2",breathType.acid,200);
        WindDragon windDragon3 = new WindDragon("20/11",200,"Blue",60,true,"Wind Dragon 3",breathType.acid,300);
        
        
        listOfDragon.add(fireDragon1);
        listOfDragon.add(fireDragon2);
        listOfDragon.add(fireDragon3);
        listOfDragon.add(iceDragon1);
        listOfDragon.add(iceDragon2);
        listOfDragon.add(iceDragon3);
        listOfDragon.add(windDragon1);
        listOfDragon.add(windDragon2);
        listOfDragon.add(windDragon3);
        
        FileOutputStream fos = new FileOutputStream("dragon.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(Dragon item : listOfDragon)
        {
            oos.writeObject(listOfDragon);
        }
        oos.close();
        
        FileInputStream fis = new FileInputStream("dragon.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Dragon> newListOfDragon = (List<Dragon>) ois.readObject();
        
        for(Dragon item : newListOfDragon)
        {
            System.out.println(item.getName());
        }
        ois.close();
        
        AddDragon(newListOfDragon);
        
        FileOutputStream fos2 = new FileOutputStream("dragon.txt");
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        for(Dragon item : newListOfDragon)
        {
            oos2.writeObject(item);
        }
        oos2.close();
        
        System.out.println("New list of Dragon");
        for(Dragon item : newListOfDragon)
        {
            System.out.println(item.getName());
        }
    }
    
}
