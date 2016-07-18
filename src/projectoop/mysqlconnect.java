package projectoop;


/**
 *
 * @author Lotfar Kaes
// */

/*
 * Developed at Kristianstad University with Combitech AB 
 * URL: http://www.hkr.se
 */

import java.sql.*;
import javax.swing.*;
public class mysqlconnect {
    Connection conn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visitor_info","root","root");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
