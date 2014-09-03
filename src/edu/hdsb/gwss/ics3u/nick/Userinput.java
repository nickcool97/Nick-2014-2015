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
public class Userinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);
        
        System.out.print(" Pease enter your name: ");
        String name;
        name = input.nextLine();
        
        System.out.print(" Hello " + name );
       
        
        System.out.print(" Pease enter your age: ");
        int age;
        age =input.nextInt();
        
        System.out.print("Are you really" + age + "?"); 
        
   
        
      
        
                
        // TODO code application logic here
    }
    
}
