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
public class TransactionGUI extends Frame implements ActionListener{
    public Label confirmation;
    public Label currentBalance;
    public Button returnHome;
    
    /**
     * 
     * @param account  account to be passed into AccountGUI
     */
    public TransactionGUI(Account account){
        
        confirmation = new Label("Your transaction has been completed!");
        add(confirmation);
        
        currentBalance = new Label("Current Balance: " + account.balance + "");
        add(currentBalance);
        
        returnHome = new Button("Back to Account Page.");
        add(returnHome);
        returnHome.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new AccountGUI(account);
                    setVisible(false);
                }
            });
        
        
        setLayout(new FlowLayout());
        setTitle("Transaction Confirmed.");
        setSize(500, 200);
        setVisible(true);
    }
    
/**
 * 
 * @param evt unused
 */
    public void actionPerformed(ActionEvent evt){}    
    
}
