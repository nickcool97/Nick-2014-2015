/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.nick;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nick
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        
       while( count < 1000000 ) {
    count += 1;
    System.out.println(count); 
       
}  
        
    }
    
}
