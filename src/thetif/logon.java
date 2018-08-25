package thetif;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class logon {
    public void logged(String user, String password)
    {
        if(user.contentEquals("user") && password.contentEquals("pass")) 
        {
            JOptionPane.showMessageDialog(null,"Logged On");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Failed");
        }
    }
}
