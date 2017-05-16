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
public class AccountGUI extends Frame implements ActionListener{
    public Label welcome;
    public Button checkBalance;
    public Button withdraw;
    public Button deposit;
    public Button home;
    public Button deleteAccount;
    
    /**
     * 
     * @param mine Account currently being accessed
     */
    public AccountGUI(Account mine){
        welcome = new Label("Welcome back, " + mine.name + "!");
        add(welcome);
        
        
        checkBalance = new Button("Check Balance");
        add(checkBalance);
        checkBalance.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new CheckBalanceGUI(mine);
                }
            });        
        
        withdraw = new Button("Withdraw");
        add(withdraw);
        withdraw.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new WithdrawGUI(mine);
                    setVisible(false);
                }
            });        
        
        deposit = new Button("Deposit");
        add(deposit);
        deposit.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new DepositGUI(mine);
                    setVisible(false);
                }
            });        
        
        deleteAccount = new Button("Delete Account");
        add(deleteAccount);
        deleteAccount.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    new DeletedGUI(mine);
                }
            });        
        
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
        setTitle("Welcome Back!");
        setSize(500, 200);
        setVisible(true);
    }
    
    /**
     * 
     * @param evt unused
     */
    public void actionPerformed(ActionEvent evt){}
        
}
