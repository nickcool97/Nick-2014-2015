/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4u.nick;

/**
 *
 * @author Nick Sept 3/2014
 */
public class TypeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double
        //double to char
        double x = 10323.2;
        char a = (char) x;
        //double to string
        String b = Double.toString(x);
        //double to int
        int c = (int) x;
        //double to long
        long d = (long) x;
        
        //int
        //int to boolean
        int e = 1;
        
        
        
        
        
        //string to double
        String o = "Hi";
        double a = Double.parseDouble(o);
    }
    
}
