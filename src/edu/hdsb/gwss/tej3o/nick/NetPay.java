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
public class NetPay {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 12/04/2014
    //@Version 0.1 // Description:Find the net pay 
    public static void main(String[] args) {
        double n;//Make n a double 
        int h;//Make h a int
        double w;//Make w a double
        double i;//Make i a double
        double t = .22;//Make t a douuble and equal to .22

        Scanner input = new Scanner(System.in);//scanner for inputs
        System.out.println("NetPay");//print out NetPay
        System.out.println("Enter number of hours worked");//print out Enter number of hours worked
        h = input.nextInt();//Get hours from user
        System.out.println("Enter the wage(hour)");//Print out Enter the wage(hour)
        w = input.nextDouble();//Get Wage from user
        System.out.println("Enter the cost of insurance");//Print out Enter the cost of insurance
        i = input.nextDouble();//Get insurance cost form user
        
         n=(h*w-i)-t*(h*w-i);//formula to get net pay
         System.out.print(n);//print out value of net pay
         
        
        

    }

}
