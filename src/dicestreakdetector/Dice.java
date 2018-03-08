package dicestreakdetector;

import java.util.Random;

/**
 * @author Wessel and Bas
 */
public class Dice {

    final int maxAmountOfEyes;
    final int minAmountOfEyes;

    /**
     * sets the minimum and maximum amount of eyes of the dice
     */
    public Dice() {
        this.minAmountOfEyes = 1;
        this.maxAmountOfEyes = 6;
    }

    /**
     * ThrowDice Method for generating a number between 1 and 6
     *
     * @param minAmountOfEyes Minimum amount of eyes on the dice
     * @param maxAmountOfEyes Maximum amount of eyes on the dice
     * @return the randomly generated number between min and max amount of eyes
     */
    public static Integer ThrowDice(int minAmountOfEyes, int maxAmountOfEyes) {
        int DiceThrow = new Random().nextInt((maxAmountOfEyes - minAmountOfEyes) + 1) + minAmountOfEyes; // Generate a random number between 1 and 6
        // ((max - min) + 1(to make the number inclusive)) + min    
        return DiceThrow;
    }
}
