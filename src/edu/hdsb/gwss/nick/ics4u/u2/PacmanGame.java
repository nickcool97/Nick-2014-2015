/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u2;

import hsa.Console;
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.pink;
import static java.awt.Color.red;

/**
 *
 * @author Nick
 */
public class PacmanGame {

    public static void main(String[] args) {
        Console c = new Console();
        PacmanCharacter.setConsole(c);

        // New Pacman
        Pacman pacman = new Pacman();
        pacman.moveRight();
        
        Ghost inky = new Ghost(Color.cyan,0,0);
        Ghost blinky = new Ghost(Color.red,25,25);
        Ghost pinky = new Ghost(Color.pink,50,50);
        Ghost clyde = new Ghost(Color.orange,75,75);
        

    }

}
