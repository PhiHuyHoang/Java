/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hallgato
 */
public class Handler {
 
    private String name;
    
    public static List<Turtle> turtles;
    
    public String getName()
    {
        return name;
    }
    
    public Handler(String name) 
    {
        this.name = name;
        this.turtles = new ArrayList<Turtle>();
    }
}

