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
public class Dicestreakdetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList ThrowStreak = Streak.ThrowStreak(20);
        System.out.print("Throwstreak :  ");
        for (int x = 1; x < ThrowStreak.size(); x++) {
            System.out.print(ThrowStreak.get(x) + " ");
        }
        System.out.println();
        System.out.print("EnclosedStreaks :  ");
        EncloseStreaks(ThrowStreak);
    }

    /**
     * Enclose the streaks with brackets while printing it
     *
     * @param ThrowStreak The streak where the brackets have to be placed
     */
    public static void EncloseStreaks(ArrayList ThrowStreak) {
        int x;
        for (x = 1; x < ThrowStreak.size() - 2; x++) {
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && x == 1) {
                System.out.print("( " + ThrowStreak.get(x - 1) + " ");
                System.out.print(ThrowStreak.get(x - 1) + " ");
            } else {
                if (x == 1) {
                    System.out.print(ThrowStreak.get(x - 1) + " ");
                    if (ThrowStreak.get(x) == ThrowStreak.get(x + 1)) {
                        System.out.print("( ");
                        System.out.print(ThrowStreak.get(x) + " ");
                    } else {
                        System.out.print(ThrowStreak.get(x) + " ");
                    }
                } else {
                    System.out.print(ThrowStreak.get(x) + " ");
                }
            }
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) {
                System.out.print(") ");
            }
            if (ThrowStreak.get(x + 1) == ThrowStreak.get(x + 2) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) {
                if (x == 1) {
                    System.out.print("( ");
                } else {
                    System.out.print("( ");
                }
            }
        }
        for (x = ThrowStreak.size() - 2; x < ThrowStreak.size() - 1; x++) {
            System.out.print(ThrowStreak.get(x) + " ");
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) {
                System.out.print(")");
            }
            System.out.print(ThrowStreak.get(x + 1) + " ");
            if (ThrowStreak.get(x) == ThrowStreak.get(x + 1)) {
                System.out.print(")");
            }
        }
    }
}
