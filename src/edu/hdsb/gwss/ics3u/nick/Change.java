/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

/**
 *
 * @author Nick
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 212;
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        System.out.println("Number of Quarters: " + (value / q));
        value = value - (value / q) * q;
        System.out.println("Number of Dimes: " + (value / d));
        value = value - (value / d) * d;
        System.out.println("Number of Nickles: " + (value / n));
        value = value - (value / n) * n;
                System.out.println("Number of pen: " + value);
    

        // TODO code application logic here
    }

}
