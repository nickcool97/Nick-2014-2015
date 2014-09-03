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
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startNumber;//Make startNumber a int
        int endNumber;//Make endNumber a int
        

        System.out.println("Enter the start Value");//Print out Enter the start Value
        startNumber = input.nextInt();//Get value of startNumber from user
        System.out.println("Enter the end Value");//Print out Enter the end Value
        endNumber = input.nextInt();//Get endNumber from user
        int finalNumber = randomNumber (startNumber, endNumber);//Random Number method
        System.out.println(finalNumber);//Print out the the randomNumber
        

    }

    public static int randomNumber(int startNumber, int endNumber) {//randomNumber method
        return (int) (Math.random() * (endNumber - startNumber + 1)) + startNumber;//Formla for randomNumber

    }
}
