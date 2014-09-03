/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.tej3o.nick;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Carpet {

    /**
     * @param args the command line arguments
     * @author Nicholas Dias //Date 12/04/2014
    //@Version 0.1 // Description:Find the cost of Carpet
     */
    public static void main(String[] args) {
       double lengthOfRoom;//Make lengthOfRoom a double
       double widthOfRoom;//Make widthOfRoom a double
       double costOfCarpet;//Make costOfCarpat a double
       double subTotal;//Make subTotal a double
       double tax = .13;//Make tax a double and equal to .13
       double total;//Make total a double 
       
       Scanner input = new Scanner(System.in);//scanner for inputs
       System.out.println("Cost Of Carpet");//Print out Cost Of Carpet
       System.out.println("What is the length of the room");//Print out What is the length of the room
       lengthOfRoom = input.nextDouble();//Get lengtOfRoom from user
       System.out.println("What is the Width of the room");//print out What is the Width of the room
       widthOfRoom = input.nextDouble();//Get widthOfRoom from user
       System.out.println("What is Cost of Carpet per square foot");//Print out What is Cost of Carpet per square foot
       costOfCarpet = input.nextDouble();//Get the CostOfCarpet from user
       
       subTotal = lengthOfRoom * widthOfRoom * costOfCarpet;//formla for the subTotal
       System.out.println("Subtotal : " + subTotal);//Print out Subtotal
       tax = tax * subTotal;//Formla for tax
       System.out.println("Tax : " + tax);//Print out tax
       total = subTotal + tax;//Formla for total 
       System.out.println(total);//print out total
       
       
       
    }
    
}
