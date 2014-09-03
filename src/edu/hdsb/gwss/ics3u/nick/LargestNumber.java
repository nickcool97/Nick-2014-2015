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
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double side1 = 5;
        double side2 = 100;
        double side3 = 10;

        if (side1 > side2 && side1 > side3) {
            System.out.println("a is the bigest " + side1);
            double tmp = side1;
            side1 = side3;
            side3 = tmp;
        } else if (side2 > side1 && side2 > side3) {
            System.out.println("b is the bigest " + side2);
            double tmp = side2;
            side2 = side3;
            side3 = tmp;
        } else if (side3 > side1 && side3 > side2) {
            System.out.println("c is the bigest " + side3);
            double tmp = side3;
            side3 = side1;
            side1 = tmp;
        } else if (side1 == side2) {
            System.out.println("a and b is the bigest " + side1 + " " + side2 + " " + side3);
        } else if (side2 == side3) {
            System.out.println("b and c is the bigest " + side2 + " " + side3 + " " + side1);
        } else if (side1 == side3) {
            System.out.println("a and c is the bigest " + side1 + " " + side3 + " " + side2);
        }
    }
}
