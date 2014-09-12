/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Nick
 */
public class carData {

    final static int CAR_NAME_INDEX = 0;// set CAR_NAME_INDEX to an intger to 0 forever 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);//import scanner
        int number = 0;// set number to an intger and 0
        System.out.println("Car Data");// print out Car Data
        System.out.println("Version 0.1");//print out Version 0.1
        System.out.println("Nicholas Dias");//print out Nicholas Dias
        System.out.println("");//print out space
        System.out.println("Press 1 to display All");//print out Press 1 to display All
        System.out.println("Press 2 to display by Price");//print out Press 2 to display by Price
        System.out.println("Press 3 to display by Speed");//print out Press 3 to display by Speed
        System.out.println("Press 4 to display by 0-100km");//print out Press 4 to display by 0-100km
        System.out.println("Press 5 to Search Car");//print out Press 5 to Search Car
        System.out.println("Press 6 to Exit");// print out Press 6 to Exit

        int[][] intData = new int[10][4];//crate a int array 10 by 4
        String[][] stringData = new String[10][4];//crate a string array 10 by 4
        double[][] doubleData = new double[10][4];//crate a double array 10 by 4
        readFile(intData, stringData, doubleData);//readFile method 

        number = input.nextInt();//get number value from user
        String keyWord;//set keyword to a string

        if (number == 1) {//if number is 1 
            displayAll(intData, stringData, doubleData);//displayAll method
        }

        if (number == 2) {//if number is 2
            int number2 = 0;// set number2 to an int and equal to 0
            
            System.out.println("Press 1 for unfittered");//print out Press 1 for unfittered price 
            System.out.println("Press 2 for fittered by 1,000,000");//print out Press 2 for fittered by 1,000,000 
            System.out.println("Press 3 for Avarge");//print out Press 3 for Avarge
            number2 = input.nextInt();//get input number2 from user
            if (number2 == 1) {//if number2 
                Sort(intData, stringData, doubleData, 1);//Sort all arrays 
                displayBuyPrice(intData, stringData);//display all arrays buy price
            }

            if (number2 == 2) {//if number2 equal 2

                Sort(intData, stringData, doubleData, 1);//Sort all arrays
                displayAllfittered(intData, stringData, doubleData);//display all by over 1,000,000

            }
            if (number2 == 3) {//if number2 equal to 3
                Sort(intData, stringData, doubleData, 1);//Sort all arrays
                displayPriceAvarge(intData,stringData);//display the avarge of all the cars
                
                
                
            }
        }

        if (number == 3) {//if number equal to 3
            Sort(intData, stringData, doubleData, 2);//Sort all array
            displaySpeed(intData, stringData);////dispaly the speed

        }
        if (number == 4) {//if number equal 4
            Sortdouble(intData, stringData, doubleData, 0);//sort all doubleData
            display0to100(intData, stringData, doubleData);//diaplay 0 - 100 km/h

        }
        if (number == 5) {//if number equal 5
            System.out.println("Car name to search for...");//print out Car name to search for...
            keyWord = input.nextLine();//Get keyWord from user
            keyWord = input.nextLine();//Get keyWord from user
            int i = search(stringData, keyWord);//search method for keyWord
            if (i < 0) {//if i lessthan 0
                System.out.println("Car not found");//print out Car not found
            } else {//else
                displayCarInfo(intData, stringData, doubleData, i);//diaplay car info
            }
        }

    }

    public static void readFile(int[][] intData, String[][] stringData, double[][] doubleData) throws FileNotFoundException {//readFile method that throws file not founnd
//crate File and scanner file
        File file = new File("carData.txt");
        Scanner input = new Scanner(file);//Scan file

        //read file utill the end of file
        String carInfo;//String called car Infor
        int car = 0;// int called car set to 0
        while (input.hasNext()) {//while there are more inputs
            carInfo = input.nextLine();//user enters carInfo
            StringTokenizer st = new StringTokenizer(carInfo, ",");//seperable tokens by comma

            intData[car][0] = Integer.parseInt(st.nextToken().trim());//prse for year
            stringData[car][0] = st.nextToken().trim();//parse for car name
            intData[car][1] = Integer.parseInt(st.nextToken().trim());//parse car price
            intData[car][2] = Integer.parseInt(st.nextToken().trim());//parse car speed
            intData[car][3] = Integer.parseInt(st.nextToken().trim());//parse car horse power
            doubleData[car][0] = Double.parseDouble(st.nextToken().trim());// parse car 0 - 100

            car++;//increase car value by 1

        }
        //close file
        input.close();//close file

    }

    public static void displayAll(int[][] intData, String[][] stringData, double[][] doubleData) {//displayAll method
        System.out.format("%5s %-53s %-6s %-10s %-13s %-10s \n", "Year", "Name", "Price", "Speed", "Horse Power", "0-100km/h");//format car data

        for (int car = 0; car < intData.length; car++) {//go thought every car
            System.out.format("%5d %-52s $%-7s %-4s km/h %-4s hp       %-4s seconds \n", intData[car][0], stringData[car][0], intData[car][1], intData[car][2], intData[car][3], doubleData[car][0]);// get all data for each 
        }

    }

    public static void displayBuyPrice(int[][] intData, String[][] stringData) {//diaplayBuyPrice method
        System.out.format("%-53s %-6s \n", "Name", "Price");//format name and price

        for (int car = 0; car < intData.length; car++) {//go thought every car
            System.out.format(" %-52s $%-7s  \n", stringData[car][0], intData[car][1]);//get data for name and price
        }

    }

    public static void displaySpeed(int[][] intData, String[][] stringData) {//diaplay speed method
        System.out.format("%-53s %-10s  \n", "Name", "Speed");//format name and speed  

        for (int car = 0; car < intData.length; car++) {//go thought every car
            System.out.format("%-52s %-4s km/h   \n", stringData[car][0], intData[car][2]);//get data for name and speed
        }

    }

    public static void display0to100(int[][] intData, String[][] stringData, double[][] doubleData) {//diaplay0-100 mehod
        System.out.format("%-51s  %-10s \n", "Name", "0-100km/h");//format name and 0-100km/h

        for (int car = 0; car < intData.length; car++) {//go thought every car
            System.out.format("%-52s %-4s seconds \n", stringData[car][0], doubleData[car][0]);//data for name and 0 -100
        }

    }

    public static void Sort(int[][] intData, String[][] stringData, double[][] doubleData, int sortCol) {// sort method
        for (int pass = 0; pass < intData.length; pass++) {
            for (int i = 0; i < intData.length - 1; i++) {
                if (intData[i][sortCol] < intData[i + 1][sortCol]) {
                    swap(i, i + 1, intData, stringData, doubleData);

                }
            }
        }
    }

    public static void Sortdouble(int[][] intData, String[][] stringData, double[][] doubleData, int sortCol) {//sort doubles method
        for (int pass = 0; pass < intData.length; pass++) {
            for (int i = 0; i < intData.length - 1; i++) {
                if (doubleData[i][sortCol] > doubleData[i + 1][sortCol]) {
                    swap(i, i + 1, intData, stringData, doubleData);

                }
            }
        }
    }

    public static int search(String[][] stringData, String keyWord) {//serch metod

        int loc = -1;
        for (int i = 0; i < stringData.length; i++) {

            if (stringData[i][CAR_NAME_INDEX].indexOf(keyWord) >= 0) {

                return i;
            }
        }
        return loc;
    }

    public static void swap(int i, int j, int[][] intData, String[][] stringData, double[][] doubleData) {//swap method
        int[] tmpInt = intData[i];
        intData[i] = intData[j];
        intData[j] = tmpInt;

        String[] tmpString = stringData[i];
        stringData[i] = stringData[j];
        stringData[j] = tmpString;

        double[] tmpDouble = doubleData[i];
        doubleData[i] = doubleData[j];
        doubleData[j] = tmpDouble;
    }

    public static void displayCarInfo(int[][] intData, String[][] stringData, double[][] doubleData, int car) {//display carinfo 

        System.out.format("%5s %-53s %-6s %-10s %-13s %-10s \n", "Year", "Name", "Price", "Speed", "Horse Power", "0-100km/h");//format all
        System.out.format("%5d %-52s $%-7s %-4s km/h %-4s hp       %-4s seconds \n", intData[car][0], stringData[car][0], intData[car][1], intData[car][2], intData[car][3], doubleData[car][0]);//data from all
    }

    public static void displayAllfittered(int[][] intData, String[][] stringData, double[][] doubleData) {//fitter method 
        System.out.format("%5s %-53s %-6s %-10s %-13s %-10s \n", "Year", "Name", "Price", "Speed", "Horse Power", "0-100km/h");//farmat all

        for (int car = 0; car < intData.length; car++) {
            if (intData[car][1] > 1000000) {//fitter by a milion
                System.out.format("%5d %-52s $%-7s %-4s km/h %-4s hp       %-4s seconds \n", intData[car][0], stringData[car][0], intData[car][1], intData[car][2], intData[car][3], doubleData[car][0]);//data from all
            }
        }

    }
    public static void displayPriceAvarge(int[][] intData, String[][] stringData) {//displaypriceavarge method
        System.out.format("%-53s %-6s \n", "Name", "Price");//format name and price
        int sum =0;

        for (int car = 0; car < intData.length; car++) {
            System.out.format(" %-52s $%-7s  \n", stringData[car][0], intData[car][1]); 
            sum =sum + intData[car][1];//add every car price
            
     
        }
sum = sum /intData.length; //price of every car togther didved by length
System.out.println("The average is $" + sum);//print out the sum
    }
    
}

