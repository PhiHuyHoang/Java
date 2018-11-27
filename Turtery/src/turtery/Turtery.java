/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtery;

import com.google.gson.Gson;

/**
 *
 * @author hallgato
 */
public class Turtery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotSameAquariumException {
        
        Handler handler1 = new Handler("Handler 1");
        Handler handler2 = new Handler("Handler 2");
        
        Turtle turtle1 = new Turtle(handler1,cutenessFactor.adorable,20,30);
        Turtle turtle2 = new Turtle(handler2,cutenessFactor.menacing,20,30);
        Turtle turtle3 = new Turtle(handler1,cutenessFactor.snappy,20,30);
        Turtle turtle4 = new Turtle(handler2,cutenessFactor.adorable,50,20);
        Turtle turtle5 = new Turtle(handler1,cutenessFactor.menacing,40,50);
       
        
        try
        {
            System.out.println(turtle1.duel(turtle2));
        }
        catch(NotSameAquariumException ex)
        {
            System.out.println(ex);
        }
        
        System.out.println(turtle1.duel(turtle3));

        MiniTurtle miniTurtle1 = new MiniTurtle(handler1,cutenessFactor.menacing,40,50,20);
        
        try
        {
            System.out.println(turtle1.duel(miniTurtle1));
        }
        catch(NotSameAquariumException ex)
        {
            System.out.println(ex);
        }
        
        Gson gson = new Gson();
        try
        {
        String json1 = gson.toJson(turtle1);
        String json2 = gson.toJson(turtle2);
        String json3 = gson.toJson(turtle3);
        String json4 = gson.toJson(turtle4);
        String json5 = gson.toJson(turtle5);
        
        System.out.println(json1);
        System.out.println(json2);
        System.out.println(json3);
        System.out.println(json4);
        System.out.println(json5);
        
        Turtle turtle1Clone = gson.fromJson(json1, Turtle.class);
        Turtle turtle2Clone = gson.fromJson(json2, Turtle.class);
        Turtle turtle3Clone = gson.fromJson(json3, Turtle.class);
        Turtle turtle4Clone = gson.fromJson(json4, Turtle.class);
        Turtle turtle5Clone = gson.fromJson(json5, Turtle.class);
        
        System.out.println(turtle1Clone.getOwner().getName());
        System.out.println(turtle2Clone.getOwner().getName());
        System.out.println(turtle3Clone.getOwner().getName());
        System.out.println(turtle4Clone.getOwner().getName());
        System.out.println(turtle5Clone.getOwner().getName());
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

    }
    
}
