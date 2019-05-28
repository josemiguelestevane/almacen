/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import Clases.Clase_Usuarios;
import static frames.E_ubuscar.tablabuscarU;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author appleapple
 */
public class BD_USUARIOS {
    Connection con;
    Statement sent;
    
    
     
    public void Nuevousuario(Clase_Usuarios u) throws SQLException{

    int confirmar = JOptionPane.showConfirmDialog(null, "¿DESEA AGREGAR UN NUEVO USUARIO?");

    if(confirmar == JOptionPane.YES_OPTION){
   
    try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into usuarios (id_NE,nombre, correo, departamento, contrasena)"+"values(?,?,?,?,?)")){
    
    ps.setString(1, u.getId());
    ps.setString(2, u.getNombre());
    ps.setString(3, u.getCorreo());
    ps.setObject(4, u.getDepartamento());
    ps.setString(5, u.getPass());
   
    if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "SE HA REGISTRADO UN NUEVO USUARIO", "Operación Exitosa",
                JOptionPane.INFORMATION_MESSAGE);
            BD_USUARIOS U= new BD_USUARIOS();
            U.mostrarusuarios();
    }else{
        
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
        
        }
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
    
    
        }
    
    }
    
       public void mostrarusuarios() { 
        
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = BD_MyConnection.getTabla("select id_NE,nombre,correo,departamento from usuarios");
        modelo.setColumnIdentifiers(new Object[]{"N.E","NOMBRE","CORREO","DEPARTAMENTO"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("id_NE"),rs.getString("nombre"),rs.getString("correo"),rs.getString("departamento")});
            }            
            // asigna el modelo a la tabla
            tablabuscarU.setModel(modelo);            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
       
       public void eliminarUsuario(String NE)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar un Usuario?");
    if(confirmar == JOptionPane.YES_OPTION){
    try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from usuarios where id_NE = ?")){
            ps.setString(1, NE);
            if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "El registro se elimino con éxito", "Operación Exitosa. ",
                JOptionPane.INFORMATION_MESSAGE);
                BD_USUARIOS U= new BD_USUARIOS();
                U.mostrarusuarios();
        }else{
        
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la operacion\n"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
        
        }
    }   catch(SQLException e){  
        System.out.println(e.getMessage());
            }
    
        }
    }
    
       
    public void actualizarUSUARIO(String CU1,String CU2,String CU3,Object CU4)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea actualizar un registro de usuario?");
    if(confirmar == JOptionPane.YES_OPTION){
         try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE usuarios Set nombre=?,correo=?,departamento=? where id_NE=?")){
          
             ps.setString(1,CU2);
             ps.setString(2,CU3);
             ps.setObject(3,CU4);
             ps.setString(4,CU1);
       if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "El registro se modifico", "Operación Exitosa. ",
                JOptionPane.INFORMATION_MESSAGE);
                BD_USUARIOS U= new BD_USUARIOS();
                U.mostrarusuarios();
        }else{
        
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la operacion\n"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
        
        }
            }   catch(SQLException e){  
        System.out.println(e.getMessage());
            }
    
        }

    }  
  public void actualizarContraseña(String id,String pass,String newpass)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea actualizar su contraseña?");
    if(confirmar == JOptionPane.YES_OPTION){
         try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE usuarios SET contrasena=? WHERE id_NE=?")){
          
             ps.setString(1,newpass);
             ps.setString(2,id);
             
       if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "La contraseña se actualizo", "Operación Exitosa. ",
                JOptionPane.INFORMATION_MESSAGE);
                BD_USUARIOS U= new BD_USUARIOS();
                U.mostrarusuarios();
        }else{
        
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la operacion\n"
                + "Inténtelo nuevamente.", "Error en la operación",
                JOptionPane.ERROR_MESSAGE);
        
        }
            }   catch(SQLException e){  
        System.out.println(e.getMessage());
            }
    
        }

    }  
}   
    //SET PASSWORD FOR user = PASSWORD('some password') | 
//OLD_PASSWORD('some password') | 'encrypted password'  

