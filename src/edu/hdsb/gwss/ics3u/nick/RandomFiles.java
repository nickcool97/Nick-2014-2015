/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class RandomFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Random Files");
        
        File file = new File( "randomnumbers.txt" );
        PrintWriter output = new PrintWriter( file );

        // CREATE 1000 Random Numbers... in a file!
        int[] data = new int[1000];
        for (int i=0; i < data.length; i++) {
            output.println(  (int) (Math.random() * 100+1) );
        }
        
        // CLOSE THE FILE
        output.close();
        
        
        Scanner input = new Scanner( file );
        
        int index = 0;
        while( input.hasNext() ) {
            data[index] = input.nextInt();
            index++;
        }
        
        BubbleSort.bubbleSort(data);
        dispalyArray(data);

    }

    
        public static void dispalyArray(int[] data) {
        for (int row = 0; row < data.length; row++) {

            System.out.print(data[row] + ".");
            }
        }
    }
        
