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
public class CheckBalanceGUI extends Frame implements ActionListener{
    public Button back;
    public Label balance;
    
    /**
     * 
     * @param account Account to check the balance of
     */
    public CheckBalanceGUI(Account account){
        balance = new Label("Current balance: " + account.balance + " ");
        add(balance);
        
        
        back= new Button("Back to Account");
        add(back);
        back.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new AccountGUI(account);
                    setVisible(false);
                }
            });
        
        setLayout(new FlowLayout());
        setTitle("Balance");
        setSize(300, 300);
        setVisible(true);    
    }
    /**
     * 
     * @param evt unused
     */
        public void actionPerformed(ActionEvent evt){}
    
}
