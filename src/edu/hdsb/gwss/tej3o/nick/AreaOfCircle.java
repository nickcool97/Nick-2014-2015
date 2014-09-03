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
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     * */// @author Nicholas Dias //Date 11/04/2014
    //@Version 0.1 // Description:Area of a Circle
    public static void main(String[] args) {
        double radius;//Make radius a double 
        double area;//Make area a double
        double PI = Math.PI;//Make PI a double and eqqual to PI

        Scanner input = new Scanner(System.in);//scanner for inputs 

        System.out.println("Area of a Circle");//print out Area of a Circle
        System.out.println("Enter the radius");//print out Enter the radius

        radius = input.nextDouble();//Get radius from user

        area = PI * (radius * radius);// PI times radius sqaured
        System.out.println(area);//print out area

    }

}
