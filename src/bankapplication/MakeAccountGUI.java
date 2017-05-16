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
public class MakeAccountGUI extends Frame implements ActionListener{
    Label instruct;
    TextField name;
    Button checking;
    Button savings;
    
    
        public MakeAccountGUI(){
        instruct = new Label("Please enter your name.");
        add(instruct);
        
        name = new TextField(50);
        name.setEditable(true);
        add(name);
            
        checking = new Button("Make Checking Account");
        add(checking);
        checking.addActionListener(            
                new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    Account temp = BankApplication.LoA.addCheckingAccount(name.getText());
                    new ConfirmationGUI(temp);
                    setVisible(false);
                }
            });
        
        savings = new Button("Make Savings Account");
        add(savings);
        savings.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    Account temp = BankApplication.LoA.addSavingsAccount(name.getText());
                    new ConfirmationGUI(temp);
                    setVisible(false);
                }
            });
        setLayout(new FlowLayout());
        setTitle("Create an Account");
        setSize(500, 200);
        setVisible(true);
        
        }      
        
    @Override
    /**
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){       
    }
} 

