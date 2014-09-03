/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.nick;

import static edu.hdsb.gwss.ics3u.nick.digitalClock.c;
import hsa.Console;

/**
 *
 * @author Nick
 */
public class ticcTacToe {
    static Console c = new Console();
    final static int length = 450;
    final static int width = 10;
    final static int gap = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        board();
        
    }
    public static void board (){
        c.fillRect(0, 150, length, width);
        c.fillRect(0, 300, length, width);
        c.fillRect(150,0, width, length);
        c.fillRect(300,0, width, length);
    }
    
}
