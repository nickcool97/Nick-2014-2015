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
        System.out.println("Welcome to the Marix!");
        System.out.println("Please select one of the following options:");
        System.out.println("1:The random marix");
        System.out.println("2:The Transpose Marix");
        System.out.println("3:Mutiply the Marix by a Constant");
        System.out.println("4:Mutiply Two Matrices");
        System.out.println("Your choice is");

        int choice = input.nextInt();
        int[][] marix = null;
        int[][] marix2 = null;
        int[][] multiplymarix = null;
        int[][] transposedMarix = null;

        if (choice == 1) {
            marix = generateMatrix();
            System.out.println("-----------------------------------");
            displayMatrix(marix);
        }

        if (choice == 2) {
            marix = generateMatrix();
            displayMatrix(marix);
            transposedMarix = generateTranspose(marix);
            System.out.println("-----------------------------------");
            displayMatrix(transposedMarix);
        }

        if (choice == 3) {
            marix = generateMatrix();
            displayMatrix(marix);
            multiplyMatrixByConstant(marix);
            System.out.println("-----------------------------------");
            displayMatrix(marix);
        }

        if (choice == 4) {
            marix = generateMatrix();
            displayMatrix(marix);
            marix2 = generateMatrix();
            transposedMarix = generateTranspose(marix2);
            System.out.println("-----------------------------------");
            displayMatrix(marix);
            System.out.println("-----------------------------------");
            displayMatrix(transposedMarix);
            multiplymarix = multiplyMatrix(marix, transposedMarix);
            System.out.println("-----------------------------------");
            displayMatrix(multiplymarix);
        } else if (choice > 4) {
            System.out.println("Error: Wrong number entered");
        }

    }

    public static int[][] generateMatrix() {
        int numberOfRow;
        int numberOfCol;
        System.out.println("Please enter the row length");
        numberOfRow = input.nextInt();
        System.out.print("Please enter the width length");
        numberOfCol = input.nextInt();
        int[][] marix = new int[numberOfRow][numberOfCol];
        for (int row = 0; row < marix.length; row++) {
            for (int col = 0; col < marix.length; col++) {
                marix[row][col] = (int) (Math.random() * 10);

            }
        }
        return marix;
    }

    public static void displayMatrix(int[][] marix) {
        for (int row = 0; row < marix.length; row++) {
            for (int col = 0; col < marix[row].length; col++) {
                System.out.print(marix[row][col]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }

    }

    public static int[][] generateTranspose(int[][] marix) {

        int[][] transposedMarix = new int[marix[0].length][marix.length];
        for (int row = 0; row < marix.length; row++) {
            for (int col = 0; col < marix.length; col++) {

                transposedMarix[col][row] = marix[row][col];

            }
        }
        return transposedMarix;
    }

    public static int[][] multiplyMatrixByConstant(int[][] marix) {
        int number = 0;
        System.out.println("Please enter a constant");
        number = input.nextInt();
        for (int row = 0; row < marix.length; row++) {
            for (int col = 0; col < marix.length; col++) {
                marix[row][col] = marix[row][col] * number;
            }
        }
        return marix;

    }

    public static int[][] multiplyMatrix(int[][] marix, int[][] transposedMarix ) {
        int[][] multiplymarix = new int[marix[0].length][marix.length];
        for (int row = 0; row < marix.length; row++) {
            for (int col = 0; col < marix.length; col++) {
                
                multiplymarix[row][col] = marix[row][col] * transposedMarix[col][row];

            }
        }
        return multiplymarix;
    }
}
