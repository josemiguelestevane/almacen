/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author appleapple
 */
public class FuncionesBD {
        public boolean backupBD( String fromFile, String toFile ) {
                File origin = new File( fromFile );
                File destination = new File( toFile );
                if ( origin.exists() ) {
                        try {
                                InputStream in = new FileInputStream( origin );
                                OutputStream out = new FileOutputStream( destination );
                                // se usa un buffer para la copia 
                                byte[] buf = new byte[ 1024 ];
                                int len;
                                while ( ( len = in .read( buf ) ) > 0 ) {
                                        out.write( buf, 0, len );
                                } in .close();
                                out.close();
                                return true;
                        } catch ( IOException ioe ) {
                                ioe.printStackTrace();
                                return false;
                        }
                } else {
                        return false;
                }
        }

     
            
     public static String Cifrado(String pass){
                
            MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<digested.length;i++){
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Error al encriptar MD5: "+ex.getMessage());
        }
        return null;
    }

        
}