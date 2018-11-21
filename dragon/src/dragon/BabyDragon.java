/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author I352015
 */
public class BabyDragon extends TheDragon {
    
    private int age;
    private int mature()
    {
        return age -50;
    }
    
    private String trainerName;
    
    public BabyDragon(Trainer trainer, power newpower, int strength, int vitality, int magicPower, int age) {
        super(trainer, newpower, strength, vitality, magicPower);
        this.age = age;
        this.trainerName = trainer.getName();
    }
    
    public String battle(TheDragon otherDragon)
    {
        String[] listOfName = new String[] {trainerName,otherDragon.getTrainer().getName()};
        return listOfName[new Random().nextInt(listOfName.length)] + " win";
    }
    
}
