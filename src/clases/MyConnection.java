/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Estevane
 */
public class MyConnection {
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            String url = "jdbc:sqlite:/Users/Estevane/Desktop/sql/spr.db";
            // crea la coneccion con la base de datos
            con = DriverManager.getConnection(url);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
    public static ResultSet getTabla(String Consulta){
        Connection cn=getConnection();
        Statement st;
        ResultSet datos=null;
        try{
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return datos;
    } 
    
    public static ResultSet getUser(String Consulta){
        Connection cn=getConnection();
        Statement st;
        ResultSet usuarios=null;
        try{
            st=cn.createStatement();
            usuarios=st.executeQuery(Consulta);            
        }
        catch(Exception e){ System.out.print(e.toString());}
        return usuarios;
    }    
    
}
