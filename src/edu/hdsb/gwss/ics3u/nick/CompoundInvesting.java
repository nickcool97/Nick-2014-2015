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
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     *
     */// @author Nicholas Dias //Date 23/03/2014
    //@Version 0.1 // Description:Find out how much you can mak in a investment
    public static void main(String[] args) {
        // TODO code application logic here
        double investment;//make investment a double value
        double intersetRate;//make intersetRate a double value
        int years;//make years a int value 
        double interest;//make interest a double value
        double total;//make total a double value

        Scanner input = new Scanner(System.in);//Scanner that way you can enter varables
        System.out.println("Compound Investing");//print out Compound investment
        System.out.println("This progarm will print out a table that will display amount of a");//print out This progarm will print out a table that will display amount of a
        System.out.println("yearly investment a perond of up to 15 years.");//print out yearly investment a perond of up to 15 years.
        System.out.println();//skip line
        System.out.println("Enter the yearly investment($) : ");//print out Enter the yearly investment($) : 
        investment = input.nextDouble();//Get value of investment 
        System.out.println("Enter the interest rate(%) : ");//Enter the interest rate(%) : 
        intersetRate = input.nextDouble();//Get value of interestRate
        System.out.println("Enter the number of years : ");//print out Enter the number of years : 
        years = input.nextInt();//Get value of years
        System.out.println();//skip line

        total = investment;//total is equail to investment
        System.out.format("%-7s %19s %10s %10s \n", "Years", "Amount in Account", "Interest", "Total");// print out Years Amount in Account Interest Total
        for (int year = 1; year <= years; year++) {//count from 1 to 15

            interest = total * intersetRate / 100;//calculate interest

            System.out.format("%-7s %19s %10s %10s \n", year, total, interest, total + interest);//print out the values of year, total, interest, total + interest
            total = total + intersetRate + investment;//calculate total

        }
    }

}
