/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Estevane
 */
public class conector {
        public static void connect() {
            
        Connection conn = null;
        try {
            // ruta de la bd
            String url = "jdbc:sqlite:/Users/Estevane/Desktop/sql/spr.db";
            // crea la coneccion con la base de datos
            conn = DriverManager.getConnection(url);
                 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    
    }
    
    public static void main(String[] args) {
        connect();
    }
    
}


       


