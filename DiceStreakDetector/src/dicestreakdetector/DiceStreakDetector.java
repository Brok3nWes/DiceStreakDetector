/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicestreakdetector;
import java.util.Random;

import java.util.Random;

/**
 *
 * @author Wessel
 */
public class DiceStreakDetector {
int randomdobbel;
int rnd;
int dobbels[];
int nr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
    int amountOfThrows = 20;
    int numbers[] = null;
    for (int x = 0; x < amountOfThrows; x++){
        numbers[x] = ThrowDice();
    }
    for (int x = 0; x < numbers.length - 1; x++){
        System.out.println(numbers[x]);
    }
    }
    public static int ThrowDice(){
        int DiceThrow = new Random().nextInt(6);
        return DiceThrow;
=======
        // TODO code application logic here
   
        
       
>>>>>>> 55a2af379874c1fc5a729f6f502c90ffc034470a
    }
     
}




/*
rnd = new Random().nextInt(6);
       dobbels[nr] = rnd;
*/