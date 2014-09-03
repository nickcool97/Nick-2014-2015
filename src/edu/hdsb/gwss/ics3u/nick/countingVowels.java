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
public class countingVowels {

    /**
     * @param args the command line arguments
     * * @param args the command line arguments
     */// @author Nicholas Dias //Date 03/04/2014
    //@Version 0.1 // Description: Ciunt Number of vowels in a sentence
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String sentence;//Make a string called sentence
        int numberOfVowels = 0;//Make numberOfVowels eual to 0

        System.out.println("Counting Vowels");//print out Counting Vowels 
        System.out.println("This program counts the number of vowels in a sentnce");//print out This program counts the number of vowels in a sentnce
        System.out.println("Enter a Sentence : ");//print out Enter a Sentence : 

        sentence = input.nextLine();//get input sentence from user

        for (int i = 0; i < sentence.length(); i++) {//go though all charters 
            switch (sentence.toLowerCase().charAt(i)) {

                case 'a'://if find "a" 

                case 'e'://if find "e"

                case 'i'://if find "i"

                case 'o'://if find "o"

                case 'u'://if find "u"
                    numberOfVowels++;//increse value of numberOfVowels by one
                    break;

            }
        }
        System.out.println("There are " + numberOfVowels + " Vowels");//print out numberOfVowels

    }
}
