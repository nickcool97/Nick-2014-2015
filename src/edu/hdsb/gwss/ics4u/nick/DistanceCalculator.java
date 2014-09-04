/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.nick;

import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double long1;
        double lat1;
        double long2;
        double lat2;
        double distance;
        
        System.out.println("This program gives the distance between two coordinates");
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter the longitude for place 1");
        long1 = input.nextDouble();
        System.out.println("Please enter the latitude for place 1");
        lat1 = input.nextDouble();
        System.out.println("-------------------------------------------------------");
        System.out.println("Please enter the longitude for place 2");
        long2 = input.nextDouble();
        System.out.println("Please enter the latitude for place 1");
        lat2 = input.nextDouble();
        
        distance = 6378.8 * acos(sin(lat1) * sin(lat2) + cos(lat1) * cos(lat2) * cos(long2 - long1));
        
        System.out.println(distance  + "km");

    }

}
