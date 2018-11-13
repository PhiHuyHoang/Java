/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass7;

/**
 *
 * @author hallgato
 */
public class Account {
    
    private Person owner;
    private String accountNumber;
    public int balance;
    
    public Person getPerson(){return owner;}
    public String getAccountNumber(){return accountNumber;}
    
    public void deposit(int cash)
    {
        balance += cash;
    }
    
    public Account(Person owner, String accountNumber, int balance)
    {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
