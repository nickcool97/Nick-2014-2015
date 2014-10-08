/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.nick.ics4u.u2;

import hsa.Console;

/**
 */
public class PacmanCharacter {

    // CLASS VARIABLES
    protected static Console c;
    
    // OBJECT VARIABLES
    private boolean alive;
    protected int xLoc;
    protected int yLoc;

    public PacmanCharacter() {
        if( c == null ) {
            System.out.println( "WARN: HSA Console NOT set." );
        }
    }
    
    public PacmanCharacter( Console hsaConsole ) {
        this();
        if( c == null ) {
            c = hsaConsole;
            System.out.println( "INFO: HSA Console set." );
        }
    }

    public PacmanCharacter( boolean alive, int xLoc, int yLoc ) {
        this.alive = alive;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }        
    
    public boolean isIsAlive() {
        return alive;
    }

    public void setIsAlive( boolean isAlive ) {
        this.alive = isAlive;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc( int xLoc ) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc( int yLoc ) {
        this.yLoc = yLoc;
    }
    
    public void moveLeft( ) {
        this.erase();
        this.xLoc = this.xLoc - 10;
        this.draw();
    }
    
    public void moveRight( ) {
        this.erase();
        this.xLoc = this.xLoc + 10;
        this.draw();
    }
    
    public void moveUp( ) {
        this.erase();
        this.yLoc = this.yLoc + 10;
        this.draw();
        
    }
    
    public void moveDown( ) {
        this.erase();
        this.yLoc = this.yLoc - 10;
        this.draw();
        
    }
    
    private void draw( ) {
        
    }
    
    private void erase( ) {
        
    }
   
    /**
     * The parent class, PacmanCharacter, must have reference to the HSA Console.
     * Set it ONCE.
     * @param hsaConsole 
     */
    public static void setConsole( Console hsaConsole ) {
        c = hsaConsole;
    }
    
}
