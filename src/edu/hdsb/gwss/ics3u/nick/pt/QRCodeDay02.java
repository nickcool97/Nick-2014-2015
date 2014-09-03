/*
 * Garth Webb Secondary School
 * Performance Task 2014 - Semester 2
 * Day 02
 *
 * Garth Webb QR Code
 */
package edu.hdsb.gwss.ics3u.nick.pt;

import hsa.Console;

/**
 * Garth Webb QR Code
 *
 * @author Mr. Muir
 * @author YOU
 */
public class QRCodeDay02 {

    static final int SQUARE_DOT_WIDTH = 10;
    static final int LETTER_WIDTH = SQUARE_DOT_WIDTH * 3;

    // HSA Console
    static Console c = new Console();

    /**
     * QR Code Main
     *
     * Starting point for the QR Code Reader & Generator
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // QR Location
        int xLoc = 100;
        int yLoc = 100;

        // Convert 'a' to a QR Code (single code) (3x3)
        String binaryString = Integer.toBinaryString((int) 'a');
        drawBox("10101100", false, xLoc, yLoc);

    }

    /**
     * This method draws a 3x3 QR code for a single character that is
     * represented by the binary string.
     *
     * @param code ASCII Character encoded as an 8-Bit Binary String
     * @param parity parity bit; true, character is included / false, character
     * is excluded
     * @param xLoc the screen location (column) to draw the box
     * @param yLoc the screen location (row) to draw the box
     */
    public static void drawBox(String code, boolean parity, int xLoc, int yLoc) {

        if (parity == true) {
            c.fillRect(xLoc, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }

        if (code.charAt(0) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(1) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(2) == '1') {
            c.fillRect(xLoc, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(3) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(4) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc + SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(5) == '1') {
            c.fillRect(xLoc, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(6) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }
        if (code.charAt(7) == '1') {
            c.fillRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        } else {
            c.drawRect(xLoc + SQUARE_DOT_WIDTH * 2, yLoc + SQUARE_DOT_WIDTH * 2, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
        }

    }

        // Implement Method
}
