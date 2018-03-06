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
    int randomdobbel;
    int rnd;
    ArrayList<Integer> dobbels = new ArrayList<>();
    int nr;
    int length = 20;

    
    for (int x = 0; x < length; x++){
        dobbels.add(ThrowDice());
    }
    for (int x = 0; x < length; x++){
        System.out.print(dobbels.get(x)+ " ");
    }
    }
    public static int ThrowDice(){
        int DiceThrow = new Random().nextInt((6 - 1)+ 1 ) + 1;
        return DiceThrow;
    }

}