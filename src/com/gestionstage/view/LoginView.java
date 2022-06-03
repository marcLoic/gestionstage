package com.gestionstage.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	
	JButton loginButton;  
	
    JPanel mainPanel, usernamePanel, passwordPanel, submitPanel;  
    JLabel usernameLabel, passwordLabel, label1, label2; 
    JTextField  usernameTextField, passwordTextfield;  
    
    public LoginView()  
    {     
    	setSize(1000, 600);
        setLocationRelativeTo(null);
        
        usernameLabel = new JLabel();  
        usernameLabel.setText("Username");
          
        usernameTextField = new JTextField(15); 
  
        passwordLabel = new JLabel();  
        passwordLabel.setText("Password");
        
        label1 = new JLabel();
        label2 = new JLabel();
        
        passwordTextfield = new JPasswordField(15);
          
        loginButton = new JButton("SUBMIT");
        
        mainPanel = new JPanel(new GridLayout(3, 1));  
        usernamePanel = new JPanel();
        passwordPanel = new JPanel();
        submitPanel = new JPanel();
        
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameTextField);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordTextfield);
        submitPanel.add(loginButton, new GridBagConstraints());
        
        mainPanel.add(usernamePanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(submitPanel);
        
        mainPanel.setLayout(new GridLayout(3, 1));
        setLayout(new GridBagLayout());
        add(mainPanel, new GridBagConstraints());  
          
        loginButton.addActionListener(this); 
        setTitle("Gestion de stage");
    }
    
    public void actionPerformed(ActionEvent ae)
    {  
        String userValue = usernameTextField.getText();
        String passValue = passwordTextfield.getText();
          
        if (userValue.equals("test") && passValue.equals("test")) {
              
            HomeView homeView = new HomeView();
            homeView.setLocationRelativeTo(null);
            homeView.setVisible(true);
            
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            
        }  
        else{  
            JOptionPane.showMessageDialog(this, "Invalid username or password !", "Error", JOptionPane.ERROR_MESSAGE);
            usernameTextField.setText("");
            passwordTextfield.setText("");
        }  
    }  
}
