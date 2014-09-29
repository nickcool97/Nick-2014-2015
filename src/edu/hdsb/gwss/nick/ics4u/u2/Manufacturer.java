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
public class Manufacturer {
    
    public static final int COUNTRY_UNKOWN = 0;
    public static final int COUNTRY_CANADA = 1;
    public static final int COUNTRY_USA = 2;
    public static final int COUNTRY_Italy = 3;
    private String name;
    private int countriesID;
    private int companyValue;
    private boolean active;

    public Manufacturer() {
    }

    public Manufacturer(String name) {
        this.name = name;
    }

    
    
    public Manufacturer(String name, int countriesID, int companyValue, boolean active) {
        this.name = name;
        this.countriesID = countriesID;
        this.companyValue = companyValue;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "countriesID=" + countriesID + ", companyValue=" + companyValue + ", active=" + active + '}';
    }

    
    
}
