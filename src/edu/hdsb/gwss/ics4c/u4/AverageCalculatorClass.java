/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4c.u4;

/**
 *
 * @author Nick
 */
public class AverageCalculatorClass {
    public static double average( int[] marks){
        double sum =0;
       for(int i=0; i< marks.length; i++){
           sum = sum + marks[i];
       }
        return sum/marks.length;
    }
}
