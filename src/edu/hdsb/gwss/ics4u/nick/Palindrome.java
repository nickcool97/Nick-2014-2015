/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.nick;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        boolean t = true;
        System.out.println("Plase enter a word");
        word = input.nextLine();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                t = false;
            }
            
        }

        if (t == true) {
            System.out.print("This is a palindrone");

        }
        if (t == false) {
            System.out.println("This is not a palindrone");
        }
    }

}
