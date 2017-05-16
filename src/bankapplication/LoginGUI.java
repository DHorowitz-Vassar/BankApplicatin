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
public class LoginGUI extends Frame implements ActionListener{
    Label instruct;
    Label invalid;
    TextField id;
    Button login;
    Button home;

    public LoginGUI(){
        setLayout(new FlowLayout());
        
        invalid = new Label("Invalid Login");
        
        instruct = new Label("Please enter your ID.");
        add(instruct);
        
        id = new TextField(50);
        id.setEditable(true);
        add(id);
        
        login = new Button("Log In");
        add(login);
        login.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(BankApplication.LoA.accountExists(Integer.parseInt(id.getText())) == true){ 
                        new AccountGUI(BankApplication.LoA.findAccount(Integer.parseInt(id.getText())));
                        setVisible(false);
                    }
                }
            });        
        
        home = new Button("Back to Home page");
        add(home);
        home.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new HomepageGUI();
                    setVisible(false);
                }
            });
        
        setTitle("Log In Page");
        setSize(500, 200);
        setVisible(true);
        
    }
    
    /**
     * 
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){}    
}
