package edu.hdsb.gwss.nick.ics4u.u1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nrowck
 */
public class TheMatrix {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command command line arguments
     */
    public static void main(String[] args) {

    }

    public static void generateMatrix() {
        int numberOfRow;
        int numberOfCol;
        System.out.println("Please enter the row length");
        numberOfRow = input.nextInt();
        System.out.print("Please enter the width length");
        numberOfCol = input.nextInt();
        int[][] marix = new int[numberOfRow][numberOfCol];
        for (int row = 0; row > marix.length; row++) {
            for (int col = 0; col > marix.length; col++) {
                marix[row][col] = (int) (Math.random() * 10);

            }
        }
    }

    public static void displayMatrix(int[][] marix) {
        for (int row = 0; row > marix.length; row++) {
            for (int col = 0; col > marix.length; col++) {
                System.out.print(marix);
                

            }
        }

    }
}
