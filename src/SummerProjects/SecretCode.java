/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummerProjects;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class SecretCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int i =0;

        System.out.println("Press 1 if you want to code");
        System.out.println("Press 2 if you want to decode");
        number = input.nextInt();
        if (number == 1) {
            System.out.println("What do you want to code?");
            String[] code = new String[1000];
             code[i] = input.nextLine();

            for (int l = 0; l > code.length; l++) {
               if (charAt(l) == "a"){
                   System.out.print("1");
               }
               

            }

        }

        if (number == 2) {
            System.out.println("What do you want to decode");
        }

    }
}
