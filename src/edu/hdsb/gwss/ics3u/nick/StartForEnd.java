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
public class StartForEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int startValue;
        int endValue;

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter Start Value: ");
        startValue = input.nextInt();

        System.out.print(" Enter End Value: ");
        endValue = input.nextInt();

        System.out.println(" Output: ");

        for (int i = startValue; i <= endValue; i++) {
            System.out.println(i);

        }

    }

}
