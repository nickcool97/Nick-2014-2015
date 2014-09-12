/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u1;

/**
 *
 * @author Nick
 */
public class RollingDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables
        int[][] outcomes = new int[6][6];
        int[] sum = new int[11];
        int die1, die2;

        for (int roll = 0; roll < 36000; roll++) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;

            outcomes[die1 - 1][die2 - 1]++;
            sum[die1 + die2 - 2]++;
        }
        System.out.format("%-10s %-7s %-7s %-5s %-5s %-7s %-7s ", "", "1", "2", "3","4","5","6");
        System.out.println("");
        for (int row = 0; row < 6; row++) {
            System.out.format("%7d", row +1);
            for (int col = 0; col < 6; col++) {
                System.out.format("%7d", outcomes[row][col]);

            }
            System.out.print("\n");
        }

    }

}
