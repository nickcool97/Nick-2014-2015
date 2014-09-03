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
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */// @author Nicholas Dias //Date 22/03/2014
    //@Version 0.1 // Description:Get very close to two with out getting to two
    
    public static void main(String[] args) {
        // TODO code application logic here
        double startValue = 0;//make startValue a double
        double plusOne = 1;//make plusOne a double and = 1

        System.out.println("Closer to Two");//print out Closer to Two

        
        while(startValue != 2){//repeat loop as long as startValue is not = 2
            startValue = startValue + 1 / plusOne;//startValue plus 1 / what plus one is equal to
        System.out.println(startValue);//print out the startValue
        
        plusOne = plusOne * 2;//plusOne times 2
        }//end of while loop
    }
}

        

    


