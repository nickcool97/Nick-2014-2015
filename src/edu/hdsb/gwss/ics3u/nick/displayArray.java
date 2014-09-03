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
public class displayArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[][] data = {
           {1,2,3,4},
       };
       dispalyArray(data);
    }

    public static void dispalyArray(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
            System.out.println(data[row][col] + ".");
            }
        }
    }
}
