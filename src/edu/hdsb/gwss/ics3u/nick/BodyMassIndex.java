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
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int Number;// Make Number a int value
        double BMI;// Make BMI a double value
        double Heightm;// Make Height Meters a double value
        double Heightin;// Make Height inches a double value 
        double Weightkg;// Make Weight Kilograms a double value
        double Weightibs;// Make Weight Pounds a double value

        System.out.println("Hit 1 for Weight in Kilograms and Height in in Meters");
        System.out.println("Hit 2 for Weight in Pounds and Height in in inches");// Two options for the use to pick metric or imperial

        Number = input.nextInt();// select one of the Two

        if (Number == 1) { // User picks number 1 to program use Kilograms and Meters
            System.out.println("Enter Weight in Kilograms");//Ask user for weight in Kilograms
            Weightkg = input.nextDouble();// User enters there weight in Kilograms
            System.out.println("Enter Height in Meters");//Ask user for Height in Meters
            Heightm = input.nextDouble();//User eneters there Heigt in Meters
            System.out.println(Weightkg / (Heightm * Heightm));//Show person Body Mass Index
            BMI = (Weightkg / (Heightm * Heightm));// Decrare Users Body Mass Index
            if (BMI < 15) {
                System.out.println("Starvation");// If under 15 show Starvation
            } else if (BMI < 20) {
                System.out.println("Underweight");// If 15 to 19.99 show Underweight
            } else if (BMI < 25) {
                System.out.println("Ideal");// If 20 to 24.99 show Ideal
            } else if (BMI < 30) {
                System.out.println("Overweight");// If 25 to 29.99 show Overweight
            } else if (BMI < 40) {
                System.out.println("Obese");//If 30 to 39.99 show Obese
            } else if (BMI > 40) {
                System.out.println("Morbidly Obese");// If Greater then 40 Show Morbidly Obese
            }
        } else if (Number == 2) {// User picks number 2 to program use Pounds and Inches
            System.out.println("Enter Weight in Pounds");//Ask user for weight in Pounds
            Weightibs = input.nextDouble();// User enters there weight in Pounds
            System.out.println("Enter Height in Inches");//Ask user for Height in Inches
            Heightin = input.nextDouble();//User eneters there Heigt in Inches
            System.out.println((Weightibs * 703) / (Heightin * Heightin));//Show person Body Mass Index
            BMI = ((Weightibs * 703) / (Heightin * Heightin));// Decrare Users Body Mass Index
            if (BMI < 15) {
                System.out.println("Starvation");// If under 15 show Starvation
            } else if (BMI < 20) {
                System.out.println("Underweight");// If 15 to 19.99 show Underweight
            } else if (BMI < 25) {
                System.out.println("Ideal");// If 20 to 24.99 show Ideal
            } else if (BMI < 30) {
                System.out.println("Overweight");// If 25 to 29.99 show Overweight
            } else if (BMI < 40) {
                System.out.println("Obese");//If 30 to 39.99 show Obese
            } else if (BMI > 41) {
                System.out.println("Morbidly Obese");// If Greater then 40 Show Morbidly Obese
            }

        }
    }
}
