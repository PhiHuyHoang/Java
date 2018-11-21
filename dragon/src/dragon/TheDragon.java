/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragon;

/**
 *
 * @author I352015
 */
public class TheDragon {

    public TheDragon(Trainer trainer, power newpower, int strength, int vitality, int magicPower) {
        this.trainer = trainer;
        this.newpower = newpower;
        this.strength = strength;
        this.vitality = vitality;
        this.magicPower = magicPower;
    }
    
    private Trainer trainer;
    public power newpower;
    public int strength;
    public int vitality;
    public int magicPower;
    public Trainer getTrainer()
    {
        return trainer;
    }
    
    public String battle(TheDragon otherDragon) throws InfightException
    {
        if(trainer.getName().equals(otherDragon.getTrainer().getName()))
        {
            throw new InfightException();
        }
        else
        {
            if(!newpower.equals(otherDragon.newpower))
            {
                return ((newpower == power.fire && otherDragon.newpower == power.water) || 
                        (newpower == power.ice && otherDragon.newpower == power.fire) || 
                        (newpower == power.water && otherDragon.newpower == power.ice)) ? otherDragon.getTrainer().getName() + " win": trainer.getName() + " win";
            }
            else
            {
                return ((strength+vitality) >= (otherDragon.strength+otherDragon.vitality))? trainer.getName() + " win": otherDragon.getTrainer().getName() + " win";
            }
        }
    }
    
}
