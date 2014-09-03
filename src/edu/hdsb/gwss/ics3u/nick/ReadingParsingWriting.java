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
import java.util.StringTokenizer;

/**
 *
 * @author Nick
 */
public class ReadingParsingWriting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        int[] intData = new int[4];
        String[] stringData = new String[3];
        double[] doubleData = new double[3];
        readFile(intData, stringData, doubleData);
        writeFile (intData, stringData, doubleData);
        
    }

    public static void readFile(int[] intData, String[] stringData, double[] doubleData) throws FileNotFoundException {
        File file = new File("textFile.txt");
        Scanner input = new Scanner(file);
        String textFile;

        int row = 0;
        textFile = input.nextLine();
        StringTokenizer st = new StringTokenizer(textFile, ",");
        while (st.hasMoreElements()) {
            intData[row] = Integer.parseInt(st.nextToken().trim());
            row++;
        }

        row = 0;
        textFile = input.nextLine();
        st = new StringTokenizer(textFile, ",");
        while (st.hasMoreElements()) {
            stringData[row] = st.nextToken().trim();
            row++;
        }

        row = 0;
        textFile = input.nextLine();
        st = new StringTokenizer(textFile, ",");
        while (st.hasMoreElements()) {
            doubleData[row] = Double.parseDouble(st.nextToken().trim());
            row++;
        }

        //close file
        input.close();

    }

    public static void writeFile(int[] intData, String[] stringData, double[] doubleData) throws FileNotFoundException {

        PrintWriter output = new PrintWriter("textFile.txt");
        for (int i = 0; i < intData.length; i--) {
            output.print(intData[i]);

        }

        for (int i = 0; i < stringData.length; i--) {
            output.print(stringData[i]);

        }

        for (int i = 0; i < doubleData.length; i--) {
            output.print(doubleData[i]);

        }

        output.close();
    }

}
