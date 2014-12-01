/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4c.u2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;

/**
 *
 * @author Nick
 */
public class SeachingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the animal name that you want to seach for");
        String animalName = input.nextLine();

        File file = new File("animals.xml");
        Builder builder = new Builder();
        Elements animals = null;
        Element animal = null;
        try {
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            animals = root.getChildElements();

            for (int i = 0; i < animals.size(); i++) {
                String name = (String) animals.get(i).getFirstChildElement("animalName").getValue();

                if (name.equalsIgnoreCase(animalName)) {

                    animal = animals.get(i);
                    i = animals.size();
                }
            }

            if (animal != null) {
                System.out.println("Animal: " + animal.getFirstChildElement("animalName").getValue());
                System.out.println("Animal Class: " + animal.getFirstChildElement("animalClass").getValue());
                System.out.println("Habiit: " + animal.getFirstChildElement("habitat").getValue());
                System.out.println("Diet: " + animal.getFirstChildElement("diet").getValue());
                System.out.println("Flying: " + animal.getFirstChildElement("flying").getValue());
            } else {
                System.out.println("Animal not found");
            }

        } catch (IOException e) {

        } catch (ParsingException e) {

        }

    }

}
