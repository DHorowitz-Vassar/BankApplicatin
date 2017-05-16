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
public class ConfirmationGUI extends Frame implements ActionListener{
    public Label created;
    public Label name;
    public Label id;
    public Label balance;
    public Button goHome;
    
    /**
     * 
     * @param made Account that has been created
     */
    public ConfirmationGUI(Account made){
        setLayout(new FlowLayout());
        
        created = new Label("Your account has successfully been created!");
        add(created);
        
        name = new Label(" Name: " + made.name + "");
        add(name);
        
        id = new Label(" ID: " + made.ID + "");
        add(id);
        
        balance = new Label(" Balance: " + made.balance + "");
        add(balance);
        
        goHome = new Button("Return to Home Screen.");
        add(goHome);
        goHome.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new HomepageGUI();
                    setVisible(false);
                }
            });
        
        setTitle("Account Confirmation");
        setSize(300, 300);
        setVisible(true);
        
    }
    /**
     * 
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){
    }
}
