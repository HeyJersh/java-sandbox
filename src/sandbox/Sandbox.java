/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author kaize
 */
import java.io.*;
public class Sandbox {

    /**
     * @param args the command line arguments
     * Instance variables
     */
    public String name;
    
    private int level;
    
    //Constructor
    public Sandbox(String sandboxName) {
        name = sandboxName;
        
    }
    
    //Method to set difficulty level
    public void setLevel(int sandboxLevel) {
        level = sandboxLevel;
        
    }
    
    //Method to print object data
    public void printName() {
        System.out.println("Name : " + name);
        System.out.println("Skill Level : " + level);
    }
    
    
    public static void main(String[] args) {
        Sandbox sandboxOne = new Sandbox("First Java Sandbox");
        sandboxOne.setLevel(1);
        sandboxOne.printName();
        
        //More experimentation
        System.out.println("Now that THAT stuff is outta the way, let's do something cool");
        System.out.println("Are you a professional engineer of some sort?");
        
        // Fun with Loops
        int x = 1;
        
        //WHILE
        while (x <= 10) {
            System.out.println("x is: " + x);
            x++;
        }
        
        //FOR
        for(int y = 10; y <= 20; y++) {
            System.out.println("Value of y : " + y );
        }
        
        //DO WHILE
        int z = 2;
        do {
            System.out.println("Value of Z: " + z);
            z++;
        }while(z <= 10);
        
        //Enhanced For
        int [] numbers = {10, 20, 30, 40, 50};
        
        for (int q : numbers) {
            if (q == 30) {
                continue;
            }
            System.out.println(q);
        }
        
        
    }
    
}
