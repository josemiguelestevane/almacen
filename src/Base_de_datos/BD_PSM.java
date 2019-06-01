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
public class BD_PSM extends BD_MyConnection {
        public void nuevoPSM( Clase_PSM mpsm ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null, "¿Desea agregar un nuevo dato?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "INSERT INTO PSM " + "VALUES (?,?,?,?,?)" ) ) {
                                ps.setString( 1, mpsm.getCodigo() );
                                ps.setString( 2, mpsm.getDescripcion() );
                                ps.setString( 3, mpsm.getDisponible() );
                                ps.setString( 4, mpsm.getDisponible() );
                                ps.setObject( 5, mpsm.getEstatus() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null, "El registro se realizó con éxito",
                                                "Operación Exitosa.", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarPSM();
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
        public void eliminarPSM( String tcodigoPSM ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null, "¿Esta seguro que desea eliminar un dato?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "delete from PSM where codigo = ?" ) ) {
                                ps.setString( 1, tcodigoPSM );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null,
                                                "El registro se elimino con éxito.",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarPSM();
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
        public void actualizarPSM( Clase_PSM mpsm ) throws SQLException {
                int confirmar = JOptionPane.showConfirmDialog( null,
                        "¿Esta seguro que desea actualizar un registro?" );
                if ( confirmar == JOptionPane.YES_OPTION ) {
                        try ( Connection con = BD_MyConnection.getConnection(); PreparedStatement ps = con.prepareStatement(
                                "UPDATE PSM Set descripcion=?,fisico=?,dif=?,estatus=? where codigo=?" ) ) {
                                ps.setString( 1, mpsm.getDescripcion() );
                                ps.setString( 2, mpsm.getDisponible() );
                                ps.setString( 3, mpsm.getConteo() );
                                ps.setObject( 4, mpsm.getEstatus() );
                                ps.setString( 5, mpsm.getCodigo() );
                                if ( ps.executeUpdate() > 0 ) {
                                        JOptionPane.showMessageDialog( null, "El registro se modifico.",
                                                "Operación Exitosa. ", JOptionPane.INFORMATION_MESSAGE );
                                        mostrarPSM();
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
        public void mostrarPSM() {
                DefaultTableModel modelo = new DefaultTableModel();
                ResultSet rs = getTablaPSM( "select codigo,descripcion,fisico, dif, estatus from PSM" );
                modelo.setColumnIdentifiers( new Object[] {
                        "CODIGO",
                        "DESCRIPION",
                        "DISPONIBLE",
                        "CONTEO",
                        "ESTATUS"
                } );
                try {
                        while ( rs.next() ) {
                                modelo.addRow( new Object[] {
                                        rs.getString( "codigo" ), rs.getString( "descripcion" ),
                                                rs.getString( "fisico" ), rs.getString( "dif" ),
                                                rs.getString( "estatus" )
                                } );
                        }
                        tablas1.setModel( modelo );
                } catch ( Exception e ) {
                        System.out.println( e );
                }
        }
        public static ResultSet getTablaPSM( String Consulta ) {
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