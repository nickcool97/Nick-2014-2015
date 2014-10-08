/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u2;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author Nick
 */
public class Pacman extends PacmanCharacter {
        int xLoc = 20;
        int yLoc = 20;

    public static final int RADIUS = 40;

    public Pacman() {
        this.draw();
    }

    public Pacman(Console hsaConsole) {
        super(hsaConsole);
    }

    public Pacman(boolean alive, int xLoc, int yLoc) {
        super(alive, xLoc, yLoc);
    }
    
    
    
    protected void draw() {
        c.setColor(Color.yellow);
        c.fillArc(xLoc, yLoc, RADIUS,RADIUS, 30, 330);
    }
    

}
