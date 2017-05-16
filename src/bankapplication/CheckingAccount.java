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
public class CheckingAccount extends Account{
    
    /**
     * 
     * @param aname name of person who the account belongs to
     * @param abalance amount of money in account
     * @param id  Account ID
     */
    public CheckingAccount(String aname, double abalance, int id){
        super(aname, abalance, id);
        type = 2;
    }
    
    double fee = .1;
    
    
}
