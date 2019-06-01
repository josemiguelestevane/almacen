/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;
import static Base_de_datos.BD_MyConnection.getConnection;
import Clases.Clase_SMS;
import static frames.C_SMS.tablaSMS;
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
public class BD_SMS {
        Connection con;
        Statement sent;
        public void nuevoSMS( Clase_SMS mSMS ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null, "¿Desea agregar un nuevo dato?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "INSERT INTO SMS " + "VALUES (?,?,?,?,?)" ) ) {
                                ps.setString( 1, mSMS.getCodigo() );
                                ps.setString( 2, mSMS.getDescripcion() );
                                ps.setString( 3, mSMS.getDisponible() );
                                ps.setString( 4, mSMS.getDisponible() );
                                ps.setObject( 5, mSMS.getEstatus() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null, "El registro se realizó con éxito",
                                                "Operación Exitosa.", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarSMS();
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
        public void eliminarSMS( String tcodigoSMS ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null, "¿Esta seguro que desea eliminar un dato?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "delete from SMS where codigo = ?" ) ) {
                                ps.setString( 1, tcodigoSMS );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null,
                                                "El registro se elimino con éxito.",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarSMS();
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
        public void actualizarSMS( Clase_SMS mSMS ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null,
                        "¿Esta seguro que desea actualizar un registro?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "UPDATE SMS Set descripcion=?,fisico=?,dif=?, estatus=? where codigo=?"
                        ) ) {
                                //"UPDATE from PSM where codigo = ?"
                                ps.setString( 1, mSMS.getDescripcion() );
                                ps.setString( 2, mSMS.getDisponible() );
                                ps.setString( 3, mSMS.getConteo() );
                                ps.setObject( 4, mSMS.getEstatus() );
                                ps.setString( 5, mSMS.getCodigo() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null, "El registro se modifico",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarSMS();
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
        public void mostrarSMS() {
                DefaultTableModel modelo = new DefaultTableModel();
                ResultSet rs = getTablaSMS( "select codigo,descripcion,fisico,dif,estatus from SMS" );
                modelo.setColumnIdentifiers( new Object[] {
                        "CODIGO",
                        "DESCRIPION",
                        "DISPONIBLE",
                        "CONTEO",
                        "ESTATUS"
                } );
                try {
                        while ( rs.next() ) {
                                // añade los resultado a al modelo de tabla
                                modelo.addRow( new Object[] {
                                        rs.getString( "codigo" ), rs.getString( "descripcion" ),
                                                rs.getString( "fisico" ), rs.getString( "dif" ),
                                                rs.getString( "estatus" )
                                } );
                        }
                        // asigna el modelo a la tabla
                        tablaSMS.setModel( modelo );
                } catch ( Exception e ) {
                        System.out.println( e );
                }
        }
        public static ResultSet getTablaSMS( String Consulta ) {
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