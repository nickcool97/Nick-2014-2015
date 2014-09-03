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
public class PacmanV2 extends Console {

    final int PACMAN_RADIUS = 80;
    int xLoc = 20;
    int yLoc = 200;
    int STEP_SIZE = 10;

    public PacmanV2() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PacmanV2 pacman = new PacmanV2();
        pacman.drawPacmanUp();
    }

    // TODO code application logic here
    public void keyPressed(KeyEvent e) {
        int keyPressed = e.getKeyCode();
        switch (keyPressed) {
            case KeyEvent.VK_UP:
                System.out.println("UP");
                erasePacman();
                yLoc = yLoc - STEP_SIZE;
                drawPacmanUp();
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("DOWN");
                erasePacman();
                yLoc = yLoc + STEP_SIZE;
                drawPacmanDown();
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("LEFT");
                erasePacman();
                xLoc = xLoc - STEP_SIZE;
                drawPacmanLeft();
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("RIGHT");
                erasePacman();
                xLoc = xLoc + STEP_SIZE;
                drawPacmanRight();
                break;
        }

    }

    public void drawPacmanRight() {
        setColor(Color.yellow);
        fillArc(xLoc, yLoc, 80, 80, 180, 145);
        fillArc(xLoc, yLoc, 80, 80, 35, 180);
        delay();
        fillArc(xLoc, yLoc, 80, 80, 0, 360);
        

    }

    public void drawPacmanUp() {
        setColor(Color.yellow);
        fillArc(xLoc, yLoc, 80, 80, 0, 55);
        fillArc(xLoc, yLoc, 80, 80, 125, 235);
        delay();
        fillArc(xLoc, yLoc, 80, 80, 0, 360);
        
    }

    public void drawPacmanDown() {
        setColor(Color.yellow);
        fillArc(xLoc, yLoc, 80, 80, 0, 235);
        fillArc(xLoc, yLoc, 80, 80, 305, 100);
        delay();
        fillArc(xLoc, yLoc, 80, 80, 0, 360);
    }

    public void drawPacmanLeft() {
        setColor(Color.yellow);
        fillArc(xLoc, yLoc, 80, 80, 0, 145);
        fillArc(xLoc, yLoc, 80, 80, 215, 145);
        delay();
        fillArc(xLoc, yLoc, 80, 80, 0, 360);

    }

    public void erasePacman() {
        setColor(Color.white);
        fillArc(xLoc, yLoc, 80, 80, 0, 360);
    }

    public void delay() {
        try {
            Thread.sleep(400);

        } catch (Exception e) {

        }
    }

}
