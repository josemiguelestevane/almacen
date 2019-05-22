/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author appleapple
 */
public class FuncionesBD {
    private static String archivo;
    
    
    public FuncionesBD(String archSql){
        
        archivo = archSql;
    }
    
    public static boolean backupDB() {
        File file = new File(archivo);
        String path = file.getPath();
        if (!path.contains(".sql")) {
            file = new File(path + ".sql");
        }
        String executeCmd = "sqlite3 sample.db .dump > Respaldo.bak" + file.getPath();
        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Respaldo de la Base de Datos exitoso.","Respaldo",JOptionPane.INFORMATION_MESSAGE);
                runtimeProcess.destroy();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error: revise contraseña, base de datos, usuario o la conexión al servidor.","Respaldo",JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException | InterruptedException | HeadlessException ex) {
            System.err.println("Error respaldo: "+ex.getMessage());
        }

        return false;
    }
}
