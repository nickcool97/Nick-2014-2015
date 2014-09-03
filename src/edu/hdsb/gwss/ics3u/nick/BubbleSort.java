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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner that way you can enter varables

        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000);
        }
        displayArray(data);
        bubbleSort(data);
        displayArray(data);

    }

    public static void bubbleSort(int[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);

                }
            }
        }
    }

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }

}
