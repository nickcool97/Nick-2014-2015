/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.nick;

/**
 *
 * @author Nick
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean[] primes = new boolean[1000];
       
       for( int i = 0; i < primes.length; i++ ) {
           primes[i] = true;
       }
       
       primes[0] = false;
       primes[1] = false;
       for(int i =2; i < primes.length; i++ ){

           for( int p = i+i; p < primes.length; p = p + i ){ 

                   primes[p] = false;
               
               
           }
       }
       
       
    }

}
