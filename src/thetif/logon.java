package thetif;

import javax.swing.JOptionPane;

public class logon {
    public boolean logged(String user, String password)
    {
        if(user.contentEquals("username") && password.contentEquals("123456")) 
        {
            //JOptionPane.showMessageDialog(null,"Logged On");
            //return true;
            dashboard dsh = new dashboard();
            dsh.setVisible(true);
            Login lgn = new Login();
            lgn.setVisible(false);
            
            /*Login log = new Login();
            log.setVisible(false);
            log.dispose();*/
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Login Failed");
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
        return false;
    }
}