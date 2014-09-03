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
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner
        int numerator;//Make numerator a int 
        int denominator;//Make denominator a int

        System.out.println("Reduced Fraction");//Print out Reduced Fraction
        System.out.println("Enter numerator ");//Print out numerator
        numerator = input.nextInt();//Get numerator from user
        System.out.println("Enter denominator");//Print out Enter denominator
        denominator = input.nextInt();//Get denominator from user
        int GCD = GCD(numerator, denominator);//Make GCD a int and equal to the method

        if (denominator == 1) {//if denominator equal to one
            System.out.println(numerator);//Print out value of numerator
        } else {
            System.out.println(numerator + "/" + denominator);//Print value of numerator / value of denominator

        }

    }

    public static int GCD(int x1, int x2) {//method called GCD got this from online
        if (x2 == 0) {
            return x1;
        }
        return GCD(x2, x1 % x2);

    }
}
