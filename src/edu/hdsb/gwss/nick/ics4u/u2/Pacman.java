/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u2;

/**
 *
 * @author Nick
 */
public class Pacman extends PacmanCharacter {

    public static final int RADIUS = 40;
    
    private void draw() {
        c.fillArc(xLoc, yLoc, RADIUS, height, startAngle, arcAngle);
    }

}
