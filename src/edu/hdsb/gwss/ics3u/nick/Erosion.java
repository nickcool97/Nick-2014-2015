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
public class Erosion {

    /**
     * @param args the command line arguments
     *
     */// @author Nicholas Dias //Date 24/03/2014
    //@Version 0.1 // Description:find out how long it would take for topsoil to erosion enough to stop growing plants
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Scanner that way you can enter varables
        double amountOfSoil;//make amountOfSoil a double
        double soilGain = 0.005;//make soilGain a double value and = to 0.005
        double soilLoss = 0.01;//make soilLoss a double value and = to 0.01
        int years = 2014;//make years a int value and = to 2014

        System.out.println("Topsoil Erosion");//print out Topsoil Erosion
        System.out.println("Enter the amount of soil at the begin");//print out Enter the amount of soil at the begin
        amountOfSoil = input.nextDouble();//Get value of amountOfSoil 

        if (amountOfSoil <= 9) {//if amountOfSoil is less than 9 
            System.out.println("Plants can't grow here");//print out Plants can't grow here

        } else {
            System.out.format("%-7s %16s  \n", "Years", "Amount Of Soil");//print out Years Amount Of Soil

            while (amountOfSoil >= 9) {//while amountOfSoil greater than or = to 9 

                years = years + 1;//count up from 2014 by 1
                amountOfSoil = amountOfSoil - soilLoss;//the amountOfSoil is = to amountOfSoil - soilLoss
                amountOfSoil = amountOfSoil + soilGain;//the amountOfSoil is = to amountOfSoil + soilGain

                System.out.format("%-7s %5s  \n", years, amountOfSoil);//print out  years amountOfSoil
            }
            System.out.println("In the year " + years + " plants will not be able to grow in this area ");//print out In the year plants will not be able to grow in this area 
        }
    }
}
