/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtery;

import java.util.Random;

/**
 *
 * @author hallgato
 */
public class Turtle {
    
    private Handler owner;
    public cutenessFactor factor;
    public int size;
    public int bitePower;
    
    public Handler getOwner()
    {
        return owner;
    }
    
    public Turtle(Handler owner, cutenessFactor factor, int size, int bitePower) {
        this.owner = owner;
        this.factor = factor;
        this.size = size;
        this.bitePower = bitePower;
        this.owner.turtles.add(this);
        
    }
    /*Adorable turtles always lose, unless they fight another adorable turtle.menacingvs snappy-> menacingwins*/
    public String duel(Turtle turtle) throws NotSameAquariumException
    {
        if(this.getClass().equals(MiniTurtle.class))
        {
            return "Can not fight";
        }  
        else
        {
            if(turtle.getClass().equals(MiniTurtle.class))
            {
                Turtle turtleClone = turtle.getOwner().turtles.get(new Random().nextInt(turtle.getOwner().turtles.size()));
                return this.duel(turtleClone);
            }
            else
            {
                if(!this.owner.equals(turtle.getOwner()))
                {
                    throw new NotSameAquariumException("Dont have same aquarium owner");
                }
                else
                {
                    if(!this.factor.equals(turtle.factor))
                    {
                        return (this.factor.equals(cutenessFactor.menacing) && turtle.factor.equals(cutenessFactor.adorable)) ||
                               (this.factor.equals(cutenessFactor.snappy) && turtle.factor.equals(cutenessFactor.adorable)) ||
                                (this.factor.equals(cutenessFactor.menacing) && turtle.factor.equals(cutenessFactor.snappy))? this.owner.getName() + " win" : turtle.getOwner().getName() + " win";
                    }
                    else
                    {
                        return (this.size + this.bitePower) >= (turtle.size + turtle.bitePower) ? this.owner.getName() + " win" : turtle.getOwner().getName() + " win";
                    }
                 }
            }
        }
    
    }
}
