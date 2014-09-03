/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import hsa.Console;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author Nick
 */
public class Game2048 extends Console {

int[][] data;
    
    public Game2048() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game2048 g = new Game2048();
        g.data = new int[4][4];
        ArrayREveiw.spawnRandomTwo(g.data);
        ArrayREveiw.spawnRandomTwo(g.data);
        g.displayArray(g.data);
    }
    public void displayArray(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            this.println(data[row][0] + " " + data[row][1] + " " + data[row][2] + " " + data[row][3]);
        }
        
    }

    // TODO code application logic here
    public void keyPressed(KeyEvent e) {
        int keyPressed = e.getKeyCode();
        switch (keyPressed) {
            case KeyEvent.VK_UP:
                System.out.println("UP");
                ArrayREveiw.collapseUp(data);
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("DOWN");
               ArrayREveiw.collapseDown(data);
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("LEFT");
                ArrayREveiw.collapseLeft(data);
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("RIGHT");
                ArrayREveiw.collapseRight(data);
            
                break;
        }
        this.clear();
        if(!ArrayREveiw.gameOver(data)){
            ArrayREveiw.spawnRandomTwo(data);
        }
        displayArray(data);
        

    }

    

}
