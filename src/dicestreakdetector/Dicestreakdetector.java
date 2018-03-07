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
        System.out.print(DiceThrow + "-");
        return DiceThrow;
    }
    // Print method for ArrayList
    public static void printStuff(ArrayList dobbels){{
    int x;
        for (x = 1; x < dobbels.size()-2; x++){
      
        if (dobbels.get(x-1) == dobbels.get(x) && x == 1){
            System.out.println();
            System.out.print("( " + dobbels.get(x-1) + " ");
            System.out.print(dobbels.get(x-1) + " ");
        }
        else {
            if (x==1){
                System.out.println();
                System.out.print(dobbels.get(x-1) + " ");
               if (dobbels.get(x) == dobbels.get(x+1)){
                   System.out.print("( ");
                   System.out.print(dobbels.get(x) + " ");
               } else {
                   System.out.print(dobbels.get(x) + " ");
               }
                
            } else {
                 System.out.print(dobbels.get(x)+ " ");
            }
        }
        
          
            
           
            
       
      if (dobbels.get(x-1) == dobbels.get(x) && dobbels.get(x) != dobbels.get(x+1)) {
            System.out.print(") ");
            
            
        }
        
      if (dobbels.get(x+1) == dobbels.get(x+2) && dobbels.get(x) != dobbels.get(x+1)) {
          if (x==1) { 
          System.out.print("( ");
         } else {
              System.out.print("( ");
          }
      }
      
      }
    for (x = dobbels.size()-2; x < dobbels.size()-1; x++){
       
        System.out.print(dobbels.get(x) + " ");
        if (dobbels.get(x-1) == dobbels.get(x) && dobbels.get(x) != dobbels.get(x+1)) {
            System.out.print(")");
        }
        
        System.out.print(dobbels.get(x+1) + " ");
        if (dobbels.get(x) == dobbels.get(x+1)){
            System.out.print(")");
        }else {
            
        }
    }
    
      }
    }
    }
    
    
    

    