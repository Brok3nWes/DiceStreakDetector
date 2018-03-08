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
        for (x = 1; x < ThrowStreak.size() - 2; x++) { // for everything 1 > TS.size-2 
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && x == 1) { // if throw-1 == throw1 and x == 1 open bracket
                System.out.print("( " + ThrowStreak.get(x - 1) + " ");
                System.out.print(ThrowStreak.get(x - 1) + " ");
            } else {
                if (x == 1) {
                    System.out.print(ThrowStreak.get(x - 1) + " ");
                    if (ThrowStreak.get(x) == ThrowStreak.get(x + 1)) { // if throw1 == throw2 : open bracket
                        System.out.print("( ");
                        System.out.print(ThrowStreak.get(x) + " ");
                    } else { // next throw
                        System.out.print(ThrowStreak.get(x) + " ");
                    }
                } else { // next throw
                    System.out.print(ThrowStreak.get(x) + " ");
                }
            }
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) { // if throw1 == throw2 and throw1 != throw2 : closing bracket
                System.out.print(") ");
            }
            if (ThrowStreak.get(x + 1) == ThrowStreak.get(x + 2) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) {// if throw2 == throw3 and throw1 != throw2 : open bracket
                System.out.print("( ");
            }
        }
        for (x = ThrowStreak.size() - 2; x < ThrowStreak.size() - 1; x++) { //for the last throws (so it closes the brackets properly)
            System.out.print(ThrowStreak.get(x) + " ");
            if (ThrowStreak.get(x - 1) == ThrowStreak.get(x) && ThrowStreak.get(x) != ThrowStreak.get(x + 1)) { // if throw-1 == throw1 and throw1 != throw2 : closing bracket
                System.out.print(") ");
            }
            System.out.print(ThrowStreak.get(x + 1) + " ");
            if (ThrowStreak.get(x) == ThrowStreak.get(x + 1)) { // if throw1 == throw2 : closing bracket
                System.out.print(")");
            }
        }
    }
}
