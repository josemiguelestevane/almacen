/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Frames.E_uregistro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Estevane
 */
public class Clase_Metodos {
   Connection con;
    Statement sent;
    public void Nuevo(String id,String nombre, String alias, String departamento, String contrasena 
                      ) throws SQLException{

    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea agregar un nuevo usuario?");

    if(confirmar == JOptionPane.YES_OPTION){
    
    String query = "insert into usuarios (id, nombre, alias, departamento, contrasena)"+"values(?,?,?,?,?)";
    try( Connection con = Clase_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query)){
   E_uregistro u =new E_uregistro();
    ps.setString(1, u.tid.getText());
    ps.setString(2, u.tnombre.getText());
    ps.setString(3, u.talias.getText());
    ps.setString(4, u.tdepa.getText());
    ps.setString(5, u.tcontra.getText());
    if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa",
                JOptionPane.INFORMATION_MESSAGE);
        
    }else{
        
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
        
    }
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
    
    
    
    
    
    
    }}
    public void guardar(){
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea agregar un nuevo usuario?");

    if(confirmar == JOptionPane.YES_OPTION){
       
    con = Clase_MyConnection.getConnection();
       try{
          String query = "insert into usuarios (id, nombre, alias, departamento, contrasena)"+"values(?,?,?,?)";
    PreparedStatement ps=con.prepareCall(query);
    E_uregistro u =new E_uregistro();
    ps.setString(1, u.tid.getText());
    ps.setString(1, u.tnombre.getText());
    ps.setString(2, u.talias.getText());
    ps.setString(3, u.tdepa.getText());
    ps.setString(4, u.tcontra.getText());   
       
       
       }    catch (SQLException ex) {
                Logger.getLogger(Clase_Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    
    
    }}
    
}
