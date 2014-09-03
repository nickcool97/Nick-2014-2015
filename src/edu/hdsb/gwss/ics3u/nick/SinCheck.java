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
public class SinCheck {

    /**
     * @param args the command line arguments
     * */// @author Nicholas Dias //Date 11/04/2014
    //@Version 0.1 // Description:Find out if your Sin number is real
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Scanner 

        String sinNumber;//Make sinNumber a String
        int sumOne = 0;//Make sumOne a int and equal to zero
        int sumTwo = 0;//Make sumTwo a int and equal to zero
        int value = 0;//Make value a int and equal to zero
        int checkDigit = 0;//Make checkDigit a int and equal to zero
        int finalDigit = 0;//Make finalDigit  a int and equal to zero
        int nextTens = 0;//Make nextTens a int and equal to zero

        System.out.println("Sin Checker");//print out Sin Checker
        System.out.println("Please enter your socal secretary number");//print out Please enter your socal secretary number

        sinNumber = input.nextLine();//enter nextLine input varable

        
        for (int i = 0; i < sinNumber.length() - 2; i = i + 2) {

            value = Integer.parseInt("" + sinNumber.charAt(i));//get all odd number spaces
            sumOne = sumOne + value;//sumOne= sumOne + value 

            value = Integer.parseInt("" + sinNumber.charAt(i + 1));//get all even number spaces
            value = value * 2;//Value times 2
            sumTwo = sumTwo + (value % 10) + (value / 10);//get number to round to the nerest 10

        }

        checkDigit = sumOne + sumTwo;//make checkDigit equal to sumOne + sumTwo
        nextTens = ((checkDigit / 10) + 1) * 10;//make nextTens to the next 10 

        int lastNumber = Integer.parseInt("" + sinNumber.charAt(sinNumber.length() - 1));//last number in sin
        if (lastNumber == nextTens) {//if lastNumber = nextTens
            System.out.println("This is the correct SIN number");//print out This is the correct SIN number 
        } else {
            System.out.println("This is the incorrect SIN number"); //print out This is the incorrect SIN number
        }
    }

}
