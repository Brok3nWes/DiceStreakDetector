/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicestreakdetector;

import java.util.ArrayList;

/**
 * @author Wessel and Bas
 */
public class Streak {

    /**
     * Generate the ArrayList of a ThrowStreak
     *
     * @param length The amount of Throws in the streak
     * @return the ArrayList of a ThrowStreak
     */
    public static ArrayList ThrowStreak(int length) {
        ArrayList<Integer> Throws = new ArrayList<>();
        for (int x = 0; x < length; x++) {
            Throws.add(Dice.ThrowDice(1, 6));
        }
        return Throws;
    }
}
