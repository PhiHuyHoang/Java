/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

/**
 *
 * @author I352015
 */
public class Dragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InfightException {
        // TODO code application logic here
        Trainer trainer1 = new Trainer("Trainer 1");
        Trainer trainer2 = new Trainer("Trainer 2");
        Trainer trainer3 = new Trainer("Trainer 3");
        
        TheDragon fireDragon = new TheDragon(trainer1,power.fire,50,50,50);
        TheDragon waterDragon = new TheDragon(trainer2,power.water,50,50,50);
        TheDragon iceDragon = new TheDragon(trainer3,power.ice,50,50,50);
        
        BabyDragon babyFireDragon = new BabyDragon(trainer2,power.fire,20,20,20,20);
        
        Gson gson = new Gson();
        String json = gson.toJson(fireDragon);
        String json1 = gson.toJson(waterDragon);
        String json2 = gson.toJson(iceDragon);
        
        System.out.println(json);
        System.out.println(json1);
        System.out.println(json2);
        
        TheDragon jsonFireDragon = gson.fromJson(json, TheDragon.class);
        TheDragon jsonWaterDragon = gson.fromJson(json1, TheDragon.class);
        TheDragon jsonIceDragon = gson.fromJson(json2, TheDragon.class);
        
        System.out.println(jsonFireDragon.getTrainer().getName());
        System.out.println(jsonWaterDragon.getTrainer().getName());
        System.out.println(jsonIceDragon.getTrainer().getName());
        
        try
        {
        String winner1 = fireDragon.battle(waterDragon);
        String winner2 = fireDragon.battle(iceDragon);
        String winner3 = waterDragon.battle(iceDragon);
        String winner4 = babyFireDragon.battle(fireDragon);
        
        List<String> listOfWinner = new ArrayList<String>();
        
        listOfWinner.add(winner1);
        listOfWinner.add(winner2);
        listOfWinner.add(winner3);
        listOfWinner.add(winner4);
        
        for(String winner : listOfWinner)
        {
            System.out.println(winner);
        }
        }
        catch(InfightException ex)
        {
            System.out.println(ex);
        }
        
    }
    
}
