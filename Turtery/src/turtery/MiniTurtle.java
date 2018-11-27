/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtery;

/**
 *
 * @author hallgato
 */
public class MiniTurtle extends Turtle{
    private int age;
    public MiniTurtle(Handler owner, cutenessFactor factor, int size, int bitePower, int age) {
        super(owner, factor, size, bitePower);
        this.age = age;
    }
    
    // 50 is the mature age
    public int mature()
    {
        return 50 - this.age;
    }
}
