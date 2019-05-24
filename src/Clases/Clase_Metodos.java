/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Base_de_datos.Clase_MyConnection;
import frames.E_ubuscar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estevane
 */
public class Clase_Metodos {
    Connection con;
    Statement sent;
    
    
     
    public void Nuevousuario(String nombre, String correo, Object departamento, String contrasena 
                      ) throws SQLException{

    int confirmar = JOptionPane.showConfirmDialog(null, "¿DESEA AGREGAR UN NUEVO USUARIO?");

    if(confirmar == JOptionPane.YES_OPTION){
   
    try( Connection con = Clase_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into usuarios (nombre, correo, departamento, contrasena)"+"values(?,?,?,?)")){
    
    ps.setString(1, nombre);
    ps.setString(2, correo);
    ps.setObject(3, departamento);
    ps.setString(4, contrasena);
   
    if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "SE HA REGISTRADO UN NUEVO USUARIO", "Operación Exitosa",
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
  
    
    public void buscarU(String nombre, String correo) throws SQLException{
        E_ubuscar u= new E_ubuscar();
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = Clase_MyConnection.getTabla("select nombre,correo, departamento from usuarios where nombre=="+nombre);
        modelo.setColumnIdentifiers(new Object[]{"NOMBRE","CORREO,DEPARTAMENTO"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("nombre"),rs.getString("correo"),rs.getString("departamento")});
            }            
            // asigna el modelo a la tabla
            u.tablabuscarU.setModel(modelo); 
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    

    
   
    
    
    
    
    
}
//"select * from usuarios where nombre = ?"