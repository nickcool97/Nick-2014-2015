/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import java.util.Scanner;
import static sun.awt.geom.Curve.next;

/**
 *
 * @author Nick
 */
public class acidRain {

    /**
     * @author Nicholas Dias //Date 27/02/2014
     * @Version 0.1 // Description: Test pH is water to see if it is NEUTRAL or
     * ACIDIC or ALKALINE
     * @param args the command line arguments //
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Acid Rain ");
        System.out.println(" Acid Rian is an environmental problem");
        System.out.println(" This program determines if the pH level in water is safe for fish. ");
        System.out.println(" Pease enter the pH ");

        double pH;      //Make pH a double
        pH = input.nextDouble(); // Input the pH of the water
        if (pH < 0) {
            System.out.print("Invaid Input Try again"); // If the pH is less then 0 there is a error
        } else if (pH > 14) {
            System.out.print("Invaid Input Try again"); // If the pH is greaater then 14 there is an error
        } else if (pH < 6.4) {
            System.out.print("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE."); // If pH is between 0-6.4 water is too acidic
        } else if (pH <= 7.6) {
            System.out.print("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE."); //If pH is between 6.4- 7.6 water is neutral
        } else if (pH <= 14) {
            System.out.print("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE."); //If pH is between 7.7-14 then water is too alkaline
        }
    }

}
