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
public class wordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String word;
        
        System.out.println("Word Square");
        System.out.println("Enter a Word : ");
        word = input.nextLine(); 
        
        for (int i=0;i < word.length();i++){
        
        System.out.print(word.substring(i));
        System.out.println(word.substring(0, i));
        
        }
        
    }
    
}
