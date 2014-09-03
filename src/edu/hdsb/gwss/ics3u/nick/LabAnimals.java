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
public class LabAnimals {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 23/03/2014
    //@Version 0.1 // Description:Find out how long animals can survive with the amount of food they have
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner that way you can enter varables

        int initalPopulation;//make initalPopulation is a int value
        int foodSupply;//make foodSupply is a int value
        int foodPerHour;//make foodPerHour a int value
        int animalsAtEnd;//make animalsAtEnd a int value
        int foodAtEnd;//make foodAtEnd a int value
        int hours = 1;//make hours a int value and = 1

        System.out.println("Lab Animals");//print out Lab Animals

        System.out.print("Enter the Inital Population (X) : ");//print out Enter the Inital Population (X) : 
        initalPopulation = input.nextInt();//Get value of initalPopulation
        System.out.print("Enter the Food Supply (Y) : ");//print out Enter the Food Supply (Y) : 
        foodSupply = input.nextInt();//Get value of foodSupply
        System.out.print("Enter the Food to Add Each Hour : ");//print out Enter the Food to Add Each Hour : 
        foodPerHour = input.nextInt();//Get value foodPerHour

        if (initalPopulation <= 0) {//if initalPopulation less than 0
            System.out.println("Error, Enter Animals Again ");//print out Error, Enter Animals Again
        }
        if (initalPopulation > foodSupply) {//if initalPopulation is gearter than foodSupply
            System.out.println("Error, Not Enough Food ");//print out Error, Not Enough Food
        } else {//if the initalPopulation is not less than 0 and if initalPopulation is not gearter than foodSupply run this
            System.out.format("%-7s %18s %14s %12s %15s \n", "Hours", "Animals at Start", "Food a Start", "Food at End", "Animals at End");//print out Hours Animals at Start Food a Start Food at End Animals at End
            while (foodSupply >= 0) {//while foodSupply is gerater than 0
                hours=hours+1;//count up by one untill foodSupply is less than or equal to 0
                    initalPopulation = initalPopulation * 2 / 2;//calculate initalPopulation
                    animalsAtEnd = initalPopulation * 2;//calculate animalsAtEnd
                    foodAtEnd = foodSupply - initalPopulation + foodPerHour;//calculate foodAtEnd
                    System.out.format("%-7s %18s %14s %12s %15s \n", hours, initalPopulation, foodSupply, foodAtEnd, animalsAtEnd);//print out the values of hours, initalPopulation, foodSupply, foodAtEnd, animalsAtEnd 
                    foodSupply = foodSupply + foodPerHour - initalPopulation;//calculate foodSupply
                    initalPopulation = initalPopulation * 2;//calculate initalPopulation

                

            }

        }
        hours = hours - 1;//calculate hours
        System.out.println("The Animals will survive " + hours + " hours");// print out The Animals will survive how ever many hours hours
    }

}
