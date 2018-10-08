package thetif;

import javax.swing.JOptionPane;

public class logon {
    public boolean logged(String user, String password)
    {
        if(user.contentEquals("user") && password.contentEquals("pass")) 
        {
            JOptionPane.showMessageDialog(null,"Logged On");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Failed");
            return false;
        }
        
        /*CREATE TABLE `users` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `username` varchar(255) NOT NULL,
        `password` varchar(255) NOT NULL,
        `email` varchar(255) NOT NULL,
        PRIMARY KEY (`id`),
        UNIQUE KEY `username` (`username`),
        UNIQUE KEY `email` (`email`)) */
    }
}