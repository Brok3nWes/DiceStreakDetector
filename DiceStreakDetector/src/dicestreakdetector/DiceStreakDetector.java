/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicestreakdetector;
import java.util.Random;

/**
 *
 * @author Wessel
 */
public class DiceStreakDetector {

    /**
     * @param args the command line arguments
     */
    int amountOfThrows = 20;
    int numbers[];
    public static void main(String[] args) {
        for (int x = 0; x < amountOfThrows; x++){
            numbers[x] = ThrowDice();
        }
    }
    public static int ThrowDice(){
        int DiceThrow = new Random().nextInt(6);
        return DiceThrow;
    }
    
}