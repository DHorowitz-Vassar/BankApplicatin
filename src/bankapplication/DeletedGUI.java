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
public class DeletedGUI extends Frame implements ActionListener{
    public Label deleted;
    public Button home;
    
    /**
     * 
     * @param account Account to be deleted
     */
    public DeletedGUI(Account account){
        BankApplication.LoA.deleteAccount(account.ID);
        
        
        deleted = new Label("Account Deleted.");
        add(deleted);
        
        home = new Button("Return Home");
        add(home);
        home.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new HomepageGUI();
                    setVisible(false);
                }
            });
        
        setLayout(new FlowLayout());
        setTitle("Balance");
        setSize(500, 200);
        setVisible(true);
    }
    
    /**
     * 
     * @param evt unused
     */
        public void actionPerformed(ActionEvent evt){}
    
}
