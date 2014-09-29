/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u2;

import java.util.ArrayList;
import java.util.Objects;

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
    private int serialNumber;
    private ArrayList<Car> cars;
    
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
        this.serialNumber = 0;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "countriesID=" + countriesID + ", companyValue=" + companyValue + ", active=" + active + ", serialNumber=" + serialNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manufacturer other = (Manufacturer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    public boolean isValid() {
        boolean isValid = true;
        if (name == null) {
            isValid = false;
            if (serialNumber <= 0) {
                System.out.print("invaild"); 
                isValid = false;

            }
        }
       return isValid;
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

    public void setCountriesID(int countriesID) {
        this.countriesID = countriesID;
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

    
}
