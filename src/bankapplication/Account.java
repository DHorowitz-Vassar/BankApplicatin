/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author dyhorowitz
 * @version 1.0
 */
public class Account {
    
    /**
     * @param aname name of person the account belongs to
     * @param abalance amount of money in account
     * @param id account ID
     */
    public Account(String aname, double abalance, int id)
    {
        this.balance = abalance;
        this.name = aname;
        this.fee = 0;
        this.ID = id;
    }
    
    public void deposit(int depos){
        balance += depos;
    }
    
    public void withraw(int with){
        balance -= (with + fee);
    }
    
    
    double balance;
    String name;
    double fee;
    int ID;
    int type;
    
    
}
