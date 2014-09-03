/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

/**
 *
 * @author Nick
 */
public class OunceGrams {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 27/02/2014
    //@Version 0.1 // Description: Chart for Ounces to Grams
    public static void main(String[] args) {

        System.out.print("This program is a Conversion Chart for Ounces to Grams\n");//output: This program is a Conversion Chart for Ounces to Grams
        System.out.format("%-8s %6s \n", "Ounces", "Grams");//output: "Ounces" 8 spaces then "Grams" on next line
        for (int ounces = 1; ounces <= 15; ounces++) {//count from 1 to 15
            System.out.format("%-8s %6.2f \n", ounces, ounces * 28.35);//output: ounces * 28.35 to get grams

        }

    }

}
