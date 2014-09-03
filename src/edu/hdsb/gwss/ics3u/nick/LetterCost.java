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
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int Number;//Make Number a Int value
        int MassofLetter;//Make Mass of Letter an Int value
        double Over100grams; //Make Over 100 grams a double value
        Scanner input = new Scanner(System.in); //Scaner For inputs
        System.out.println(" Letter Cost ");//Say Letter cost
        System.out.println("This program calculates the cost of sending a letter");
        System.out.println("depenting on the mass of the letter." );
        System.out.println("Hit 1 for First class");
        System.out.println("Hit 2 for Second class");//Have two options for First class and second class

        Number = input.nextInt();//User selects one or two 

        if (Number == 1) { //Number 1 selected
            System.out.println("Enter the mass of the letter (ingrams)");//Tell User to enter mass in grams
            MassofLetter = input.nextInt();//User Enter mass of letter
            if (MassofLetter < 0) {//Mass less than 0 
                System.out.println("Error Try Again");//Says Error
            } else if (MassofLetter <= 30) {//Between 1 and 30 is $.40
                System.out.println("The cost to mail this letter is $0.40");
            } else if (MassofLetter <= 50) {//Between 30 and 50 is $.60
                System.out.println("The cost to mail this letter is $0.60");
            } else if (MassofLetter <= 100) {//Between 50 and 100 is $.80
                System.out.println("The cost to mail this letter is $0.80");
            } else  {
                Over100grams = ((MassofLetter-100) / 50 + 1) * 0.29 + .80;
                System.out.println(Over100grams);
            }

        }

        if (Number == 2) {
            System.out.println("Enter the mass of the letter (ingrams)");
            MassofLetter = input.nextInt();
            if (MassofLetter < 0) {
                System.out.println("Error Try Again");
            } else if (MassofLetter <= 30) {
                System.out.println("The cost to mail this letter is $0.30");
            } else if (MassofLetter <= 50) {
                System.out.println("The cost to mail this letter is $0.50");
            } else if (MassofLetter <= 100) {
                System.out.println("The cost to mail this letter is $0.60");
            } else {
                Over100grams = ((MassofLetter-100) / 50 + 1) * 0.19 + .60;//Find the price if the letter over 100 grams
                System.out.println(Over100grams);//Tell user price if over 100 grams
            }
        }
    }

}
