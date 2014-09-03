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
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hoursWorked;//Make hoursWorked a intger
        double wage;//Make wage a double 

        System.out.println("Enter number of hours worked");//Print out Enter number of hours worked 
        hoursWorked = input.nextInt();//Get hoursWorked from user
        System.out.println("Enter wage per hour");//Print out Enter wage per hour
        wage = input.nextDouble();//Get wage form user
        double earnings = calculateSalary(hoursWorked, wage);//Formla to fid earnings
        System.out.println(earnings);//Print out earings 

    }

    public static double calculateSalary(int hoursWorked, double wage) {//Method calculateSalary
        double salary;//Make salary a double
        if (hoursWorked > 40) {//if housrs worked is more than 40
            salary = 40 * wage + (wage * 1.5 * (hoursWorked - 40));//formla for salary 
        } else {
            salary = hoursWorked * wage;//formla for salary if less than 40 hours
        }

        return salary;//rerurn salary
    }
}