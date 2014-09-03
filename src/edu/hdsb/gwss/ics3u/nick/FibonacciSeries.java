/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.nick;

/**
 *
 * @author Nick
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 22/03/2014
    //@Version 0.1 // Description:Get very close to two with out getting to two
    
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 1; //make A a intger and =  1
        int B = 1; //make B a intger and = 1
        int C = 1; //make C a intger and = 1
        
        System.out.println("Fibonacci Series");//print out Fibonacci Series
        System.out.println(A);//Print out the value of A
        System.out.println(B);//Print out the value of B
        while(C !=6765 ){//while C is not = to 6765 then contuine with this
        C=A+B;//make C = A+ B
        A=B;// make A=B
        B=C;// make B=C
        System.out.println(C);}//print out the value of C
           
       
    }
    
}
