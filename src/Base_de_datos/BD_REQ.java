/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;
import static Base_de_datos.BD_MyConnection.getConnection;
import Clases.Clase_REQ;
import static frames.F_requisicion.jTable1;
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
public class BD_REQ {
        public void nuevoREQ( Clase_REQ req ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null,
                        "¿Desea agregar un nuevo dato de requisicion?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "INSERT INTO REQUISICIONES " + "VALUES (?,?,?,?,?,?,?,?)" ) ) {
                                ps.setString( 1, req.getFecha() );
                                ps.setString( 2, req.getDpto() );
                                ps.setObject( 3, req.getDepartamento() );
                                ps.setString( 4, req.getReq() );
                                ps.setString( 5, req.getCantidad() );
                                ps.setObject( 6, req.getEstatus() );
                                ps.setString( 7, req.getCantidad() );
                                ps.setString( 8, req.getDescripcion() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null,
                                                "El registro de requisicion se realizó con éxito!!",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarREQ();
                                } else {
                                        JOptionPane.showMessageDialog( null,
                                                "No se ha podido realizar la operacion\n" +
                                                "Inténtelo nuevamente.", "Error en la operación",
                                                JOptionPane.ERROR_MESSAGE );
                                }
                        } catch ( SQLException e ) {
                                System.out.println( e.getMessage() );
                        }
                }
        }
        public void eliminarREQ( String req ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null, "¿esta seguro que desea eliminar un dato?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "delete from REQUISICIONES where Rreq = ?" ) ) {
                                ps.setString( 1, req );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null,
                                                "El registro se elimino con éxito",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarREQ();
                                } else {
                                        JOptionPane.showMessageDialog( null,
                                                "No se ha podido realizar la operacion\n" +
                                                "Inténtelo nuevamente.", "Error en la operación",
                                                JOptionPane.ERROR_MESSAGE );
                                }
                        } catch ( SQLException e ) {
                                System.out.println( e.getMessage() );
                        }
                }
        }
        public void mostrarREQ() {
                DefaultTableModel modelo = new DefaultTableModel();
                ResultSet rs = getTablaREQ( "select Rfecha,Rdpto,Rdepartamento,Rreq," +
                        "Rcan,Restatus,Runidad, Rdescripcion from REQUISICIONES" );
                modelo.setColumnIdentifiers( new Object[] {
                        "FECHA REQ",
                        "DPTO",
                        "DEPARTAMENTO",
                        "REQ",
                        "CAN",
                        "ESTATUS",
                        "U.M",
                        "DESCRIPCION"
                } );
                try {
                        while ( rs.next() ) {
                                // añade los resultado a al modelo de tabla
                                modelo.addRow( new Object[] {
                                        rs.getString( "Rfecha" ), rs.getString( "Rdpto" ), rs.getString(
                                                        "Rdepartamento" ), rs.getString( "Rreq" ),
                                                rs.getString( "Rcan" ), rs.getString(
                                                        "Restatus" ), rs.getString( "Runidad" ),
                                                rs.getString( "Rdescripcion" )
                                } );
                        }
                        // asigna el modelo a la tabla
                        jTable1.setModel( modelo );
                } catch ( Exception e ) {
                        System.out.println( e );
                }
        }
        public void actualizarREQ( Clase_REQ req ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null,
                        "¿Esta seguro que desea actualizar una Requisicion?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "UPDATE REQUISICIONES Set Rfecha=?,Rdpto=?,Rdepartamento=?,Rcan=?,Restatus=?,Runidad=?,Rdescripcion=? where Rreq=?"
                        ) ) {
                                //"UPDATE from PSM where codigo = ?"
                                ps.setString( 1, req.getFecha() );
                                ps.setString( 2, req.getDpto() );
                                ps.setObject( 3, req.getDepartamento() );
                                ps.setString( 4, req.getCantidad() );
                                ps.setObject( 5, req.getEstatus() );
                                ps.setString( 6, req.getUnidad() );
                                ps.setString( 7, req.getDescripcion() );
                                ps.setString( 8, req.getReq() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null,
                                                "El registro se modifico",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarREQ();
                                } else {
                                        JOptionPane.showMessageDialog( null,
                                                "No se ha podido realizar la operacion\n" +
                                                "Inténtelo nuevamente.", "Error en la operación",
                                                JOptionPane.ERROR_MESSAGE );
                                }
                        } catch ( SQLException e ) {
                                System.out.println( e.getMessage() );
                        }
                }
        }
        public static ResultSet getTablaREQ( String Consulta ) {
                Connection cn = getConnection();
                Statement st;
                ResultSet datos = null;
                try {
                        st = cn.createStatement();
                        datos = st.executeQuery( Consulta );
                } catch ( Exception e ) {
                        System.out.print( e.toString() );
                }
                return datos;
        }
}