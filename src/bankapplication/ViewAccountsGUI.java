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
public class ViewAccountsGUI extends Frame implements ActionListener{
    public Label accounts;
    public Button home;
    
    /**
     * 
     * @param thisType determines if the accounts to be viewed should be savings or checking
     */
    public ViewAccountsGUI(int thisType){
        
        String account = "";
        for(int x = 0; x < BankApplication.LoA.accounts.size(); x++)
        {
            if(BankApplication.LoA.accounts.get(x).type == thisType){
                account += BankApplication.LoA.accounts.get(x).name;
                account += "  ";   
                account += BankApplication.LoA.accounts.get(x).ID;
                account += "    ";
            }
        }
        
        accounts = new Label(account);
        add(accounts);
        
        
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
        setTitle("Accounts");
        setSize(600, 200);
        setVisible(true);
    }
    
    /**
     * 
     * @param evt unused
     */
        public void actionPerformed(ActionEvent evt){}
    
}
