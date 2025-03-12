package Kuis;

import javax.swing.*;
import java.awt.*;

class Login extends JFrame{
    
        private JTextField usernameField, passwordField;
        
    public Login(){
        setLayout(new GridLayout(6,2));
        setTitle("Login Bang");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new JLabel("Username: "));
        usernameField = new JTextField();
        add(usernameField);
        
        
        add(new JLabel("Password: "));
        passwordField = new JTextField();
        add(passwordField);
        
        
        JButton loginButton = new JButton("Login");
        add(loginButton);
        
        setVisible(true);
   
        */if(usernameField = "arya" || passwordField = "196"){   
        loginButton.addActionListener(e -> new PlayerSatu("Login", this));*/
        }
            }
    
    
        }
    
