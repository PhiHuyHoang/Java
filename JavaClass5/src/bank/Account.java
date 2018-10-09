/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.*;

/**
 *
 * @author hallgato
 */
public class Account {
    private String owner;

    public String GetOwner(){return owner;}
    private String accountNumber;
    public String GetAccountNumber(){return accountNumber;}
    int balance;
    static int accountNumbercounter = 0;
    
    /**
     *
     * @param person
     */
    public Account(Person person)
    {
        this.owner = person.GetName();
        this.balance = 0;
        this.accountNumber =  String.format("%05d",accountNumbercounter);
        this.accountNumbercounter += 1;
    }
    
    public void deposit(int amount)
    {
        this.balance += amount;
    }

    public void withdrawal(int amount) throws InsufficientFoundsException
    {
        if(amount <= this.balance)
        {
            this.balance -= amount;
        }
        else
        {
            throw new InsufficientFoundsException("Not enough money");
        }
    }
}
