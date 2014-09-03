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
public class NumbertoWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ones;
        int tens;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("NumbertoWord");
        System.out.println("Enter Number");
        number = input.nextInt();

        if (number >= 10 && number < 20) {
            teens(number);
        } else {
            tens(number / 10);
            ones(number % 10);
        }

        //wordfromNum(number);
        // ones();
        // tens();
        // teens();
    }

    public static void tens(int value) {
        switch (value) {
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;

            case 4:
                System.out.print("Forthy");
                break;
            case 5:
                System.out.print("Fifty");
                break;
            case 6:
                System.out.print("Sixty");
                break;
            case 7:
                System.out.print("Seventy");
                break;
            case 8:
                System.out.print("Eigthy");
                break;
            case 9:
                System.out.print("Ninety");
                break;
        }
    }

    public static void ones(int value) {
        switch (value) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        
        
        }
    }
    
    public static void teens( int value ) {
        switch( value ) {
            case 10:
                    System.out.println("Ten");
                    break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twele");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("FourTeen");
                break;
            case 15:
                System.out.println("FifthTeen");
                break;
            case 16:
                System.out.println("SixTeen");
                break;
            case 17:
                System.out.println("SevenTeen");
                break;
            case 18:
                System.out.println("EightTeen");
                break;
            case 19:
                System.out.println("Nine teen");
                break;

        }
    }

}
