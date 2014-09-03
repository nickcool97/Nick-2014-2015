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
public class Triangle {

    /**
     * @author Nicholas Dias //Date 02/03/2014
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double side1;//Make side1 a double
        double side2;//Make side2 a double
        double side3;//Make side3 a double 

        System.out.println("Trangle");
        System.out.println("This program tells you if you have a triangle or not.");
        System.out.println("This program will also tell you if it is a right tiaangle.");
        System.out.println("Enter side 1");//Ask user for side 1
        side1 = input.nextInt();//User inputs side 1
        System.out.println("Enter side 2");//Ask user for side2
        side2 = input.nextInt();//User inputs for side 2
        System.out.println("Enter side 3");//Ask user for side3
        side3 = input.nextInt();//User inputs side 3

        // Sort
        if (side1 > side3) {//If side 1 is bigger than side 3 change them around
            double tmp = side1;
            side1 = side3;
            side3 = tmp;
        }
        if (side2 > side3) {//If side 2 is bigger than side 3 change them around
            double tmp = side2;
            side2 = side3;
            side3 = tmp;
        }

        if (side1 + side2 >= side3) {//If side 1 + side 2 is eqaul to or gerater than side three it is a triangle
            System.out.println("This is a trangle");

            if (side1 * side1 + side2 * side2 == side3 * side3) {//If side 1 times side 1  + side 2times  is eqaul to side three it is a right triangle
                System.out.println("This is a right trangle");

            }

        } else {
            System.out.println("This is not trangle");//If it is not a triangle than it is not a triangle
        }

    }
}
