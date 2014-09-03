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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] grade = {80, 75, 50, 100};
        displayArray(grade);

    }

    public static void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
    }
}
