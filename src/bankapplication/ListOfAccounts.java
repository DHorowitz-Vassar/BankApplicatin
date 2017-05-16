/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.ArrayList;


/**
 *
 * @author dyhorowitz
 * @version 1.0
 */
public class ListOfAccounts {
    
    public ListOfAccounts(){
        accounts = new ArrayList<Account>();
    }
    
    /**
     * @param name name of person creating account
     * @return Account object created
     */
    public Account addSavingsAccount(String name){
        accounts.add(new SavingsAccount(name, 0, ids));
        Account temp = new Account(name, 0, ids);
        ids++;
        return temp;
    }
    
    /**
     * @param name name of person creating account
     * @return Account object created
     */
    public Account addCheckingAccount(String name){
        accounts.add(new CheckingAccount(name, 0, ids));
        Account temp = new Account(name, 0, ids);
        ids++;
        return temp;
    }
    
    /**
     * @param id ID number of the account being searched for
     * @return returns the account being searched for if found. Otherwise, returns null
     */
    public Account findAccount(int id){
        for(int x = 0; x < accounts.size(); x++){
            if(accounts.get(x).ID == id)
                return accounts.get(x);
        }
        return null;
    }
    
    /**
     * @param id ID number of the account that is going to be deleted
     */
    public void deleteAccount(int id){
        for(int x = 0; x < accounts.size(); x++){
            if(accounts.get(x).ID == id)
                accounts.remove(x);
        }
    }
    
    /**
     * @param id ID of account being searched for
     * @return if the account with said ID exists, return true. Otherwise, return false
     */
    public boolean accountExists(int id){
        for(int x = 0; x < accounts.size(); x++){
            if(accounts.get(x).ID == id)
                return true;
        }
        return false;
    }
    
    
    
    ArrayList<Account> accounts;
    int ids = 01;
    
}
