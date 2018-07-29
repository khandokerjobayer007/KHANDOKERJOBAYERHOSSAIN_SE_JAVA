/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayonsapp;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
/**
 *
 * @author jobayer007
 */
public class DatabaseHelper{
    private Connection conn;
    public Connection start(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
        System.out.println("Database Connected");
    }catch(Exception e){
    //JOptionPane.showMessageDialog(this, e);
    }
    return conn;
    }public void stop(){
        try{
            conn.close();
        }catch(Exception e){
    }
}
}
