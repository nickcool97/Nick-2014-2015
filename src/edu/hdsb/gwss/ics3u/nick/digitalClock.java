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
public class digitalClock {

    final static int length = 100;
    final static int width = 10;
    final static int gap = 5;
    

    static Console c = new Console();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        for (int value = 0; value < 10; value++) {

            //top 
            if (!(value == 4 || value == 1)) {
                c.fillRect(0, 0, length, width);
            } else {
                c.drawRect(0, 0, length, width);
            }
            //top left
            if (!(value == 1 || value == 2 || value == 3 || value == 7)) {
                c.fillRect(0, gap + width, width, length);
            } else {
                c.drawRect(0, gap + width, width, length);

            }
            //top right
            if (!(value == 5 || value == 6)) {
                c.fillRect(length - width, gap + width, width, length);
            } else {
                c.drawRect(length - width, gap + width, width, length);
            }
            //med 
            if (!(value == 0 || value == 1 || value == 7)) {
                c.fillRect(0, length + 4 * gap, length, width);
            } else {
                c.drawRect(0, length + 4 * gap, length, width);
            }
            //bottom left
            if (value == 0 || value == 2 || value == 6 || value == 8) {
                c.fillRect(0, gap * 3 + width * 2 + length, width, length);
            } else {
                c.drawRect(0, gap * 3 + width * 2 + length, width, length);
            }
            //bottom right
            if (value == 2) {
                c.drawRect(length - width, gap * 3 + width * 2 + length, width, length);
            } else {
                c.fillRect(length - width, gap * 3 + width * 2 + length, width, length);
            }
            //bottom
            if (!(value == 1 || value == 4 || value == 7)) {
                c.fillRect(0, gap * 4 + width * 2 + length * 2, length, width);
            } else {
                c.drawRect(0, gap * 4 + width * 2 + length * 2, length, width);
            }
            Thread.sleep(1000);    // one second
            System.out.println(value);

            c.setColor(Color.white);
            c.fillRect(0, 0, 1000, 1000);

        }

    }

}
