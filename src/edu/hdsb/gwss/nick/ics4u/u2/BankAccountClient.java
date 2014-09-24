/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.nick.ics4u.u2;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class BankAccountClient {

    private String firstName;
    private String lastName; 
    private int SIN;
    
    private ArrayList<BankAccount> accounts;

    public BankAccountClient(String firstName, String lastName, int SIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SIN = SIN; 
        this.accounts = new ArrayList<BankAccount>();
    }
   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSIN() {
        return SIN;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }
    
    
}


