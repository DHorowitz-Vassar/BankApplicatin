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
 * @version 1.1
 */
public class DepositGUI extends Frame implements ActionListener{
    public TextField deposit;
    public Label instruct;
    public Button submit;
    public Button cancel;
    
    /**
     * 
     * @param account Account to deposit money into
     */
    public DepositGUI(Account account){
        
        instruct = new Label("Please enter amount to deposit.");
        add(instruct);
        
        deposit = new TextField(50);
        deposit.setEditable(true);
        add(deposit);      
        
        submit = new Button("Deposit");
        add(submit);
        submit.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    account.balance += Double.parseDouble(deposit.getText());
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
     * 
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){}
    
}
