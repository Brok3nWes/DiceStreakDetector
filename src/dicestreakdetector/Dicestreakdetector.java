/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicestreakdetector;
import java.util.ArrayList;
import java.util.Random;

import java.util.Random;

/**
 *
 * @author Wessel
 */
public class Dicestreakdetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Integer> Throws = new ArrayList<>();
    int length = 20;

    // Generate the ArrayList Throws of {lenth} long
    for (int x = 0; x < length; x++){
        Throws.add(ThrowDice());
        }
    printStuff(Throws); // Print ArrayList for DebuggingPurposes 
    }
    // ThrowDice Method for generating a number between 1 and 6
    public static int ThrowDice(){
        int DiceThrow = new Random().nextInt((6 - 1)+ 1 ) + 1;
        return DiceThrow;
    }
    // Print method for ArrayList
    public static void printStuff(ArrayList dobbels){{
    for (int x = 0; x < dobbels.size(); x++){
        if (dobbels.get(x+1) == dobbels.get(x+2)) {
            System.out.print("(");
            System.out.print(dobbels.get(x)+ " ");
            System.out.println("SHIT1");
        }
        
        else if (dobbels.get(x-1) == dobbels.get(x) && dobbels.get(x) != dobbels.get(x+1)) {
            System.out.print(") ");
            System.out.print(dobbels.get(x)+ " ");
            System.out.println("SHIT");
        }
        System.out.print("SHIT3");
        
        
    }
    
    }}

}