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
public class ArrayREveiw {

    static int score = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] data = {
            {2, 0, 2, 2},
            {2, 0, 0, 2},
            {2, 0, 2, 2},
            {0, 0, 2, 2}};

        displayArray(data);

        collapseRight(data);
        displayArray(data);

        System.out.println("score " + score);
System.out.println("go " + gameOver(data));
    }

    public static boolean gameOver(int[][] data) {
        boolean gameOver = true;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data.length; col++) {

                if (data[row][col] == 0) {
                    gameOver = false;
                }
            }
        }

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data.length-1; col++) {

                if (data[row][col] == data[row][col+1]) {
                    gameOver = false;
                }
            }
        }

        
         for (int row = 0; row < data.length-1; row++) {
            for (int col = 0; col < data.length; col++) {

                if (data[row][col] == data[row+1][col]) {
                    gameOver = false;
                }
            }
        }
                return gameOver;
    }

    public static void displayArray(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            System.out.println(data[row][0] + " " + data[row][1] + " " + data[row][2] + " " + data[row][3]);
        }
        System.out.println();
    }
    public static void spawnRandomTwo( int[][] data ){
        boolean placed = false;
        do {
         int row = (int)( Math.random()*4);
         int col = (int) (Math.random()*4);
         if(data [row][col] == 0){
             data[row][col] = 2;
             placed = true;
         }
        }while (!placed);
    }
    public static void shiftLeft(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int pass = 0; pass < data.length; pass++) {
                for (int i = 1; i < data.length; i++) {
                    if (data[row][i - 1] == 0) {
                        data[row][i - 1] = data[row][i];
                        data[row][i] = 0;
                    }
                }
            }
        }
    }

    public static void shiftUp(int[][] data) {
        for (int col = 0; col < data.length; col++) {
            for (int pass = 0; pass < data.length; pass++) {
                for (int i = 1; i < data.length; i++) {
                    if (data[i - 1][col] == 0) {
                        data[i - 1][col] = data[i][col];
                        data[i][col] = 0;
                    }
                }
            }
        }
    }

    public static void collapseUp(int[][] data) {
        shiftUp(data);
        for (int col = 0; col < data.length; col++) {
            //for (int pass = 0; pass < data.length; pass++) {
                for (int i = 1; i < data.length; i++) {
                    if (data[i][col] == data[i - 1][col]) {
                        data[i - 1][col] = data[i - 1][col] * 2;
                        data[i][col] = 0;
                        score = score + data[i - 1][col];
                    }
                }
            //}
        }
        shiftUp(data);
    }

    public static void collapseLeft(int[][] data) {
        shiftLeft(data);
        for (int row = 0; row < data.length; row++) {
            //for (int pass = 0; pass < data.length; pass++) {
                for (int i = 1; i < data.length; i++) {
                    if (data[row][i] == data[row][i - 1]) {
                        data[row][i - 1] = data[row][i - 1] * 2;
                        data[row][i] = 0;
                        score = score + data[row][i - 1];
                    }
                }
            //}
        }
        shiftLeft(data);
    }

    public static void shiftRight(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int pass = 0; pass < data.length; pass++) {
                for (int i = 2; i >= 0; i--) {
                    if (data[row][i + 1] == 0) {
                        data[row][i + 1] = data[row][i];
                        data[row][i] = 0;
                    }
                }
            }
        }
    }

    public static void collapseRight(int[][] data) {
        shiftRight(data);
        for (int row = 0; row < data.length; row++) {
            //for (int pass = 0; pass < data.length; pass++) {
                for (int i = 2; i >= 0; i--) {
                    if (data[row][i] == data[row][i + 1]) {
                        data[row][i + 1] = data[row][i + 1] * 2;
                        data[row][i] = 0;
                        score = score + data[row][i + 1];
                    }
                }
            //}
        }
        shiftRight(data);
    }

    public static void collapseDown(int[][] data) {
        shiftDown(data);
        for (int col = 0; col < data.length; col++) {
            //for (int pass = 0; pass < data.length; pass++) {
                for (int i = 2; i >= 0; i--) {
                    if (data[i][col] == data[i + 1][col]) {
                        data[i + 1][col] = data[i + 1][col] * 2;
                        data[i][col] = 0;
                        score = score + data[i + 1][col];
                    }
                }
            //}
        }
        shiftDown(data);
    }

    public static void shiftDown(int[][] data) {
        for (int col = 0; col < data.length; col++) {
            for (int pass = 0; pass < data.length; pass++) {
                for (int i = 2; i >= 0; i--) {
                    if (data[i + 1][col] == 0) {
                        data[i + 1][col] = data[i][col];
                        data[i][col] = 0;
                    }
                }
            }
        }
    }
}
