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
public class BankAccount {
    
    

    private double balance;
    private int accountNumber;
    private int branchNumber;
    private int pinNumber;
    private boolean accountActive;

    public BankAccount(int accountNumber, int branchNumber) {
        this.accountNumber = accountNumber;
        this.branchNumber = branchNumber;
        this.accountActive = true;
        this.balance = 0.0;
        
        
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public boolean isAccountactive() {
        return accountActive;
    }

    public void setAccountactive(boolean accountactive) {
        this.accountActive = accountactive;
    }

    public void deposit(double amount, int pinNumber) {
        if (this.isAccountActive()) {
            if (this.pinNumber == pinNumber) {
                this.balance = this.balance + amount;
            }
        }
    }
    
    public void withdraw(double amount, int pinNumber) {
        if (this.isAccountActive()) {
            if (this.pinNumber == pinNumber) {
                this.balance = this.balance - amount;
            }
        }
    }
    
}
