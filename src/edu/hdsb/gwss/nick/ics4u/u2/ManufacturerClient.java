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
public class ManufacturerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manufacturer Ford = new Manufacturer();
        Car mustang = new Car();
        mustang.setName( "Mustang GTO");
        mustang.setSerialNumber(1234);
        
        

        // TEST CASE #1: ADD a valid car to the list.
        System.out.println("---------------------------");
        System.out.println("TEST CASE 1: valid car");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.add(mustang);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());

        // TEST CASE #2: ADD a invalid car to the list.
        System.out.println("---------------------------");
        System.out.println("TEST CASE #2: ADD a invalid car to the list.");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.add(null);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        
        //TEST CASE #3: ADD duplice data.
         System.out.println("---------------------------");
        System.out.println("TEST CASE 3: ADD duplice data");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.add(mustang);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        
        //TEST CASE #4: Removes Car from array list
        
        
        
        //TEST CASE #5: Get Car from list

    }
    
}
