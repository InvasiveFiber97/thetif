/*package thetif;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class logon 
{
    public boolean logged(String u, String p) throws SQLException
    {   
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root", "1234");
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement("insert into logon (user,password) values (?,?)");
            ps.setString(2, u);
            ps.setString(3, p);
            ps.executeUpdate();
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
        
        
        if(u.contentEquals("user") && p.contentEquals("pass")) 
        {
            JOptionPane.showMessageDialog(null,"Logged On");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Failed");
            return false;
        }
    }
}
