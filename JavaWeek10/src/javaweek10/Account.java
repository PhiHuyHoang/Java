/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek10;

/**
 *
 * @author I352015
 */
public class Account {

    public Account(Person owner, String accountNumber, int balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    private Person owner;
    private String accountNumber;
    private int balance;
    
    public Person getOwner() {return owner;}
    public String getAccountNumber() {return accountNumber;}
    public int getBalance() {return balance;}
    
    public void deposit(int amount)
    {
        balance += amount;
    }
    
    
}
