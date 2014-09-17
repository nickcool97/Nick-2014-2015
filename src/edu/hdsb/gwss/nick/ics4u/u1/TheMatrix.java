package edu.hdsb.gwss.nick.ics4u.u1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 * //version: 0.1
 * //Date : 17/09/14
 * 
 */
public class TheMatrix {

    static Scanner input = new Scanner(System.in);//Scanner for inputs

    /**
     * @param args the command command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Marix!");//Print out
        System.out.println("Please select one of the following options:");//print out Please select one of the following options:
        System.out.println("1:The random marix");//print out 1:The random marix
        System.out.println("2:The Transpose Marix");//print out 2:The Transpose Marix
        System.out.println("3:Mutiply the Marix by a Constant");//print out 3:Mutiply the Marix by a Constant
        System.out.println("4:Mutiply Two Matrices");//print out 4:Mutiply Two Matrices
        System.out.println("Your choice is");//print out Your choice is

        int choice = input.nextInt();//user input choice
        int[][] marix = null;//crate a 2d array called marix
        int[][] marix2 = null;//crate a 2d array called marix2
        int[][] multiplymarix = null;//crate a 2d array called multiplymarix
        int[][] transposedMarix = null;//crate a 2d array calledd transposedMarix

        if (choice == 1) {//if choice 1
            marix = generateMatrix();//crate a marix
            System.out.println("-----------------------------------");//spare line
            displayMatrix(marix);//display the marix
        }

        if (choice == 2) {//if choice 2 
            marix = generateMatrix();//crate a marix
            displayMatrix(marix);//display marix
            transposedMarix = generateTranspose(marix);//transpose the marix and call it transposed Marix
            System.out.println("-----------------------------------");//spare line
            displayMatrix(transposedMarix);//display the transposed marix
        }

        if (choice == 3) {//if choice 3
            marix = generateMatrix();//crate a marix
            displayMatrix(marix);//display a marix
            multiplyMatrixByConstant(marix);//multply the marix by const in multiplyMatrixByConstant method
            System.out.println("-----------------------------------");//spare line
            displayMatrix(marix);//display marix time consant
        }

        if (choice == 4) {//if choice 4
            marix = generateMatrix();//crate a marix
            displayMatrix(marix);//display marix
            marix2 = generateMatrix();//carte another marix
            transposedMarix = generateTranspose(marix2);// transepose marix2
            System.out.println("-----------------------------------");//spare line
            displayMatrix(marix);//display marix
            System.out.println("-----------------------------------");//spare line
            displayMatrix(transposedMarix);//diaplay transeposed marix
            multiplymarix = multiplyMatrix(marix, transposedMarix);//mutiply togther the two marix 
            System.out.println("-----------------------------------");//spare line
            displayMatrix(multiplymarix);//display the mutiplyed marix
        } else if (choice > 4) {//if choice over 4 
            System.out.println("Error: Wrong number entered");//print out Error: Wrong number entered
        }

    }

    public static int[][] generateMatrix() {//Method generateMatrix
        int numberOfRow;//crate int numberOfRow
        int numberOfCol;//crate int numberOfCol
        System.out.println("Please enter the row length");//print out Please enter the row length 
        numberOfRow = input.nextInt();//get user to input for the number of rows
        System.out.print("Please enter the width length");//print out Please enter the width length
        numberOfCol = input.nextInt();//get user input for numberOfCol
        int[][] marix = new int[numberOfRow][numberOfCol];//crate a marix the is the size that the user inputed 
        for (int row = 0; row < marix.length; row++) {//for every row
            for (int col = 0; col < marix.length; col++) {//for every col
                marix[row][col] = (int) (Math.random() * 10);//but random number into the col or row

            }
        }
        return marix;//return the marix to the main
    }

    public static void displayMatrix(int[][] marix) {//method displayMarix
        for (int row = 0; row < marix.length; row++) {//for every row in the marix
            for (int col = 0; col < marix[row].length; col++) {//for every col in the marix
                System.out.print(marix[row][col]);//print out the number
                System.out.print(" ");//space every number 

            }
            System.out.println(" ");//space every line
        }

    }

    public static int[][] generateTranspose(int[][] marix) {//method generateTranspose 

        int[][] transposedMarix = new int[marix[0].length][marix.length];//crate transposed Marix the size tht the user wants
        for (int row = 0; row < marix.length; row++) {//for every row
            for (int col = 0; col < marix.length; col++) {//for every col

                transposedMarix[col][row] = marix[row][col];//transpose the col and the rows

            }
        }
        return transposedMarix;//return the transposed marix
    }

    public static int[][] multiplyMatrixByConstant(int[][] marix) {//method multiplyMatrixByConstant
        int number = 0;//crate int called number
        System.out.println("Please enter a constant");//print out Please enter a constant
        number = input.nextInt();//user enters the number
        for (int row = 0; row < marix.length; row++) {//for every row 
            for (int col = 0; col < marix.length; col++) {//for everycol
                marix[row][col] = marix[row][col] * number;//mutiply the number by the marix
            }
        }
        return marix;//return the marix to the main

    }

    public static int[][] multiplyMatrix(int[][] marix, int[][] transposedMarix ) {//multiplyMatrix method
        int[][] multiplymarix = new int[marix[0].length][marix.length];//crate a array 
        for (int row = 0; row < marix.length; row++) {//for every row
            for (int col = 0; col < marix.length; col++) {//for every col
                
                multiplymarix[row][col] = marix[row][col] * transposedMarix[col][row];//mutiply the two marixs togther

            }
        }
        return multiplymarix;//return the to the main
    }
}
