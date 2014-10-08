/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.nick.ics4u.u2;

import static edu.hdsb.gwss.nick.ics4u.u2.Pacman.RADIUS;
import java.awt.Color;

/**
 *
 * @author Nick
 */
public class Ghost extends PacmanCharacter{
     private static int ghostLength = 20;
     private static int ghostWidth = 20;

    public Ghost() {
        this.draw();
    }
     
    
    protected void draw() {
        c.setColor(Color.pink);
        c.fillArc(xLoc, yLoc,ghostLength ,ghostWidth, 0, 360);
        c.fillRect(xLoc, yLoc + 10 , 20, 20);
    }
    
    
}
