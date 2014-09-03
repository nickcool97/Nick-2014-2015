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
public class BillOfSale {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 11/04/2014
    //@Version 0.1 // Description:Bill for someting sold
    public static void main(String[] args) {
       double Cost;//Make Cost a double
       double change;//Make change a double
       double subTotal;//Make subTotal a double
       double tax = .13;//Make tax a double and equal to .13
       double total;//Make total a double 
       
       Scanner input = new Scanner(System.in);//scanner for inputs
       System.out.println("Bill of Sale");//Print out Bill of Sale
       System.out.println("What is the Cost of the purcuse");//Print out What is the Cost of the purcuse
       Cost = input.nextDouble();//Get Cost from user
       
       
       subTotal = Cost;//formla for the subTotal
       System.out.println("Subtotal : " + subTotal);//Print out Subtotal
       tax = tax * subTotal;//Formla for tax
       System.out.println("Tax : " + tax);//Print out tax
       total = subTotal + tax;//Formla for total 
       System.out.println(total);//print out total 
       System.out.println("What is the change given");//print out what is the change given
       change = input.nextDouble();//Get change from user
       total = total-change;//Formla for total
       System.out.print("The change is: ");//Print out the change is 
       System.out.print(total);//Print out value of total
    }
    
}
