/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import Clases.Clase_PSM;
import static frames.C_PSM.tablas1;
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
public class BD_PSM {
    
    Connection con;
    Statement sent;
    
    public void nuevoPSM(Clase_PSM mpsm)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea agregar un nuevo dato?");
    if(confirmar == JOptionPane.YES_OPTION){
        
    try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO PSM " + "VALUES (?,?,?,?)")){
    ps.setString(1, mpsm.getCodigo());
    ps.setString(2, mpsm.getDescripcion());
    ps.setString(3, mpsm.getDisponible());
    ps.setString(4, mpsm.getDisponible());
    if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "El registro se realizó con éxito", "Operación Exitosa. por favor actualice",
                JOptionPane.INFORMATION_MESSAGE);
           
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
    
    public void eliminarPSM(String tcodigoPSM)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar un dato?");
    if(confirmar == JOptionPane.YES_OPTION){
    try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from PSM where codigo = ?")){
            ps.setString(1, tcodigoPSM);
            if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "El registro se elimino con éxito, por favor actualice", "Operación Exitosa. ",
                JOptionPane.INFORMATION_MESSAGE);
                
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
    
    public void actualizarPSM(Clase_PSM mpsm)throws SQLException{ 
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea actualizar un registro?");
    if(confirmar == JOptionPane.YES_OPTION){
         try( Connection con = BD_MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE PSM Set descripcion=?,fisico=?,dif=? where codigo=?")){
          //"UPDATE from PSM where codigo = ?"
             ps.setString(1,mpsm.getDescripcion());
             ps.setString(2,mpsm.getDisponible());
             ps.setString(3,mpsm.getConteo());
             ps.setString(4,mpsm.getCodigo());
       if(ps.executeUpdate()> 0){
        
        JOptionPane.showMessageDialog(null, "El registro se modifico, por favor actualice", "Operación Exitosa. ",
                JOptionPane.INFORMATION_MESSAGE);
                
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
    
    public void mostrarPSM() {        
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = BD_MyConnection.getTabla("select codigo,descripcion,fisico, dif from PSM");
        modelo.setColumnIdentifiers(new Object[]{"CODIGO", "DESCRIPION","DISPONIBLE","CONTEO"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descripcion")
                , rs.getString("fisico"), rs.getString("dif")});
            }            
            // asigna el modelo a la tabla
            tablas1.setModel(modelo);
               
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    
}
