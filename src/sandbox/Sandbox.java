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
    }
    
}
