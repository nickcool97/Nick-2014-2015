/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class slotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int wheel1;
        int wheel2;
        int wheel3;
        int numberOfCoins = 50;
        boolean keepPlaying  = true;

        while (numberOfCoins > 0 && keepPlaying ) {
            wheel1 = (int) (Math.random() * 3) + 1;
            wheel2 = (int) (Math.random() * 3) + 1;
            wheel3 = (int) (Math.random() * 3) + 1;

            System.out.println(wheel1);
            System.out.println(wheel2);
            System.out.println(wheel3);

            if (wheel1 == wheel2 && wheel2 == wheel3 && wheel3 == 1) {
                numberOfCoins = numberOfCoins + 4;
                System.out.println("You have " + numberOfCoins + "Coins");
            } else if (wheel1 == wheel2 && wheel2 == wheel3 && wheel3 == 2) {
                numberOfCoins = numberOfCoins + 6;
                System.out.println("You have " + numberOfCoins + "Coins");
            } else if (wheel1 == wheel2 && wheel2 == wheel3 && wheel3 == 3) {
                numberOfCoins = numberOfCoins + 8;
                System.out.println("You have " + numberOfCoins + "Coins");
            } else if (wheel1 == wheel2 && wheel2 == wheel3 && wheel3 == 4) {
                numberOfCoins = numberOfCoins + 10;
                System.out.println("You have " + numberOfCoins + "Coins");
            } else {
                numberOfCoins = numberOfCoins - 1;
                System.out.println("Spingain");
                System.out.println("You have " + numberOfCoins + " Coins");
            }
            
            // DO YOU WANT TO PLAY AGAIN?
            System.out.println("DO YOU WANT TO PLAY AGAIN?");
            System.out.println("If Yes type True if No type False");
            keepPlaying = input.nextBoolean();
            
            
        }
    }
}
