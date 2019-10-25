
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
public class server {
    Connection con;
    public Connection getCon()
    {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aayush","root","aayush17");
    } catch (SQLException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    catch (ClassNotFoundException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        } 
    return con;
    }

    
    
}
