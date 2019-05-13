/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Estevane
 */
public class MyConnection {
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            String url = "jdbc:sqlite:/Users/appleapple/Desktop/sql/spr.db";
            // crea la coneccion con la base de datos
            con = DriverManager.getConnection(url);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
