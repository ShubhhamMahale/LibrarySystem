/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
      try{ 
        Class.forName("com.mysql.jdbc.Driver");
       c = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem", "root", "");
        s = c.createStatement();
        }
      catch(Exception e){
           e.printStackTrace();
      }
    }
}
