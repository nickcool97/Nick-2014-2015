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
public class BankAccountClient {

    private String firstName;
    private String lastName; 
    private int SIN;

    public BankAccountClient(String firstName, String lastName, int SIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SIN = SIN;
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


