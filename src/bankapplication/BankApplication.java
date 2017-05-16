/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author dyhorowitz
 * @version 1.0
 */
public class BankApplication{
    public static ListOfAccounts LoA;
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HomepageGUI app = new HomepageGUI();
        
       LoA = new ListOfAccounts();
        
        LoA.addSavingsAccount("Jones");
        LoA.findAccount(01).deposit(0);
        
        LoA.addCheckingAccount("Jessica");
        LoA.findAccount(02).deposit(50);
        
        LoA.addSavingsAccount("Sophie");
        LoA.findAccount(03).deposit(100);
        
        LoA.addCheckingAccount("Isabel");
        LoA.findAccount(04).deposit(25);
        
        LoA.addSavingsAccount("Jacob");
        LoA.findAccount(05).deposit(40);
                
    }
    
    
}
