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
public class Bank {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person A = new Person("A");
        Person B = new Person("B");
        Person C = new Person("C");
        
        Account D = new Account(A);
        Account E = new Account(B);
        Account F = new Account(C);
        
        System.out.printf("%s %d %s\n",D.GetOwner(),D.balance,D.GetAccountNumber());
        System.out.printf("%s %d %s\n",E.GetOwner(),E.balance,E.GetAccountNumber());
        System.out.printf("%s %d %s\n",F.GetOwner(),F.balance,F.GetAccountNumber());

                
        D.deposit(2000);
        System.out.printf("%s %d %s\n",D.GetOwner(),D.balance,D.GetAccountNumber());
        try{
        E.withdrawal(2000);
        }catch(InsufficientFoundsException e){
            System.out.println(e);
        }
        System.out.printf("%s %d %s\n",E.GetOwner(),E.balance,E.GetAccountNumber());
        System.out.printf("%s %d %s\n",D.GetOwner(),D.balance,D.GetAccountNumber());
        
        
    }
    
}
