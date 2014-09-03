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
public class AreaofRectangle {

    /**
     * @param args the command line arguments
     *
     */// @author Nicholas Dias //Date 11/04/2014
    //@Version 0.1 // Description:Find the area of a square
    public static void main(String[] args) {
        double length;//Make length a double 
        double width;//Make width a double 
        double area;//Make area a double
        Scanner input = new Scanner(System.in);//Scanner for inputs 

        System.out.println("Area of a Rectangle");//Print out Area of Rectangle 
        System.out.println("Enter the length");//Print out Enter the length

        length = input.nextDouble();//Get length from user
        System.out.println("Enter the width");//Print out Enter the width
        width = input.nextDouble();//Get length from user

        area = length * width;//area is equal to length times width
        System.out.println("The area is");//Print out The area is 
        System.out.println(area);//Print out the area value
    }

}
