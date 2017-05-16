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
public class HomepageGUI extends Frame implements ActionListener{
    public TextField tf;
    public Label welcome;
    public Label space;
    public Button login;
    public Button addBtn;
    public Button viewSavings;
    public Button viewChecking;
    
    public HomepageGUI(){
        setLayout(new FlowLayout());
        
        welcome = new Label("                     Welcome to the Bank of Bravos.");
        add(welcome);
        
       space = new Label("        ");
       add(space);
        
        login = new Button("Log In to your Account");
        add (login);
        login.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new LoginGUI();
                    setVisible(false);
                }
            });
        
        
        
        addBtn = new Button("Make a New Account");
        add(addBtn);
        addBtn.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new MakeAccountGUI();
                    setVisible(false);
                }
            });
        
        viewSavings = new Button("View all Savings Accounts");
        add(viewSavings);
        viewSavings.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new ViewAccountsGUI(1);
                    setVisible(false);
                }
            });
 
        viewChecking = new Button("View all Checking Accounts");
        add(viewChecking);
        viewChecking.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new ViewAccountsGUI(2);
                    setVisible(false);
                }
            });
        
        
        setTitle("Bank Account");
        setSize(500, 300);
        setVisible(true);
    }
    
    /**
     * 
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){}
    
}
