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
public class WithdrawGUI extends Frame implements ActionListener{
    public TextField withdraw;
    public Button submit;
    public Button cancel;
    public Label instruct;
    
    
    /**
     * @param account Account object from which a given amount will be withdrawn from the balance
     */
    public WithdrawGUI(Account account){
        
        instruct = new Label("Please enter amount to withdraw.");
        add(instruct);
        
        withdraw = new TextField(50);
        withdraw.setEditable(true);
        add(withdraw);      
        
        submit = new Button("Withdraw");
        add(submit);
        submit.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    account.balance -= Double.parseDouble(withdraw.getText());
                    new TransactionGUI(account);
                    setVisible(false);
                }
            });  
        
        cancel = new Button("Cancel");
        add(cancel);
        cancel.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new AccountGUI(account);
                    setVisible(false);
                }
            });
        
        setLayout(new FlowLayout());
        setTitle("Deposit");
        setSize(500, 200);
        setVisible(true);        
    }   
    
    /**
     * @param evt unused
     */  
    public void actionPerformed(ActionEvent evt){}
    
}
