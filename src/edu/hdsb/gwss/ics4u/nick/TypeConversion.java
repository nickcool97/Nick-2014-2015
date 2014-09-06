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
    private static String s;

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
        //int to char
        int e = 1;
        char f = (char) e;
        //int to long
        long g = (long) e;
        //int to double
        double h = (double) e;
        //int to String
        String i = String.valueOf(e);
        
        //long
        //long to char
        long j = 5000000;
        char k = (char) j;
        //long to int
        int l = (int) j;
        //long to double
        double m = (double) j;
        //long to string
        String n = String.valueOf(j);
        
        
       //string to double
       String o = "hello";
       double p = Double.parseDouble(o);
       //string to long
       long q = Long.parseLong(o);
       //string to int
       int r = Integer.parseInt(o);
       }
    
}
