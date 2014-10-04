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
public class Car {

 
    private Manufacturer manufacturere;
    public static final int COUNTRY_UNKOWN = 0;
    public static final int COUNTRY_CANADA = 1;
    public static final int COUNTRY_USA = 2;
    public static final int COUNTRY_Italy = 3;
    private String name;
    private int countriesID;
    private int companyValue;
    private boolean active;
    private int serialNumber;

    public Manufacturer getManufacturere() {
        return manufacturere;
    }

    public void setManufacturere(Manufacturer manufacturere) {
        this.manufacturere = manufacturere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountriesID() {
        return countriesID;
    }

    

    public int getCompanyValue() {
        return companyValue;
    }

    public void setCompanyValue(int companyValue) {
        this.companyValue = companyValue;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public boolean isValid() {
        boolean isValid = true;
        if (name == null||serialNumber <= 0) {
            isValid = false;
        }
                    else if(isValid = true){
                    System.out.println("Car is vaild");
                    }
        return isValid;
    }
    
    
}
