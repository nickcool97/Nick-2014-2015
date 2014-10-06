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
        Car tarus = new Car();
        mustang.setName( "Mustang GTO");
        mustang.setSerialNumber(1);
        tarus.setName("tarus");
        
        
        

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
        System.out.println("---------------------------");
        System.out.println("TEST CASE #4: Removes Car from array list.");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.remove(null);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        
        //TEST CASE #5: Removes Car from array list
        System.out.println("---------------------------");
        System.out.println("TEST CASE #5: Removes Car from array list.");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.remove(tarus);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        
        
        //TEST CASE #6: Remove car from list
        System.out.println("---------------------------");
        System.out.println("TEST CASE #5: Removes Car from array list.");
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());
        Ford.remove(mustang);
        System.out.println("Manfacture: " + Ford.getName() + " # of Cars: " + Ford.getNumberOfCars());

        
        //TEST CASE #7: Get Car 
        System.out.println("---------------------------");
        System.out.println("TEST CASE #7: Get Car ");
        mustang = Ford.get(1);
        
        
        //TEST CASE #8: Get Car that does not exict
        System.out.println("---------------------------");
        System.out.println("TEST CASE #7: Get Car ");
        mustang = Ford.get(2);
        
    }
    
}
