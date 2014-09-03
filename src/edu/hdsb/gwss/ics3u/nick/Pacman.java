/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.nick;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author Nick
 */
public class Pacman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console c = new Console("New Window");
        final int PACMAN_RADIUS = 80;
        int xLoc = 20;
        int yLoc = 20;
        int eyeXLoc = 60;
        int eyeYLoc = 30;

        //Pacman Head
        c.setColor(Color.yellow);
        c.fillArc(xLoc, yLoc, PACMAN_RADIUS, PACMAN_RADIUS, 30, 330);
        //pacman Eye
        c.setColor(Color.BLACK);
        c.fillArc(eyeXLoc, eyeYLoc, 10, 10, 360, 360);

        for (int i = 0; i < 20 ; i++ ) {
        //Pacman Head
        c.setColor(Color.yellow);
            c.fillArc(xLoc, yLoc, PACMAN_RADIUS, PACMAN_RADIUS, 30, 330);
            xLoc = xLoc + 20;
        }
    }
}


