
package frames.fcodigo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.spire.barcode.BarCodeGenerator;
import com.spire.barcode.BarCodeType;
import com.spire.barcode.BarcodeSettings;
import java.awt.Color;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author appleapple
 */
public class codigo extends javax.swing.JFrame {

    /**
     * Creates new form codigo
     */
    public codigo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnregresar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        btnexportar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        btngenerar = new javax.swing.JButton();
        tdescripcion = new javax.swing.JTextField();
        calmacen = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tlocalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cstatus = new javax.swing.JComboBox<String>();
        btnlimpiar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btnregresar.setBackground(new java.awt.Color(102, 102, 102));
        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/005-keyboard-left-arrow-button.png"))); // NOI18N
        btnregresar.setBorderPainted(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        btnregresar1.setBackground(new java.awt.Color(102, 102, 102));
        btnregresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/005-keyboard-left-arrow-button.png"))); // NOI18N
        btnregresar1.setBorderPainted(false);
        btnregresar1.setContentAreaFilled(false);
        btnregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar1)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setForeground(new java.awt.Color(255, 170, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnexportar.setBackground(new java.awt.Color(255, 255, 255));
        btnexportar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnexportar.setForeground(new java.awt.Color(255, 153, 0));
        btnexportar.setText("EXPORTAR");
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexportar)
                .addGap(79, 79, 79))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexportar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("GENERAR CODIGO");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Descipcion");

        tcodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btngenerar.setBackground(new java.awt.Color(255, 255, 255));
        btngenerar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngenerar.setForeground(new java.awt.Color(255, 170, 0));
        btngenerar.setText("GENERAR");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        tdescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        calmacen.setBackground(new java.awt.Color(255, 255, 255));
        calmacen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calmacen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Almacen");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Localidad");

        tlocalidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Status");

        cstatus.setBackground(new java.awt.Color(255, 255, 255));
        cstatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OBSOLETO", "LENTO MOVIMIENTO", "CONTINUO" }));
        cstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cstatusItemStateChanged(evt);
            }
        });
        cstatus.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cstatusCaretPositionChanged(evt);
            }
        });
        cstatus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cstatusPropertyChange(evt);
            }
        });
        cstatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cstatusKeyPressed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 153, 0));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btngenerar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(jLabel2)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresar1ActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        
                BarcodeSettings settings = new BarcodeSettings();
        String text = tcodigo.getText();
        int number = Integer.parseInt(text);
        String des = tdescripcion.getText();
        String loc = tlocalidad.getText();
        String alm = calmacen.getItemAt(calmacen.getSelectedIndex());
        
        //set barcode type
        settings.setType(BarCodeType.Code_128);      
        //set barcode data
        settings.setData2D("CODIGO "+text+"\n"+"DESCRIPCION:"+tdescripcion);
        //set the display text
        settings.setData(text);    
        //show text on bottom
        settings.setShowTextOnBottom(true);
        //set the border invisible
        settings.hasBorder(false);
        //create BarCodeGenerator object based on settings
        BarCodeGenerator barCodeGenerator = new BarCodeGenerator(settings);
        //generate image data and store in BufferedImage instance        
        BufferedImage bufferedImage = barCodeGenerator.generateImage();
        canvas1.getGraphics().clearRect(0, 0, canvas1.getWidth(), canvas1.getHeight());
        
        canvas1.getGraphics().drawImage(bufferedImage, 0, -19-6, rootPane);
        canvas1.getGraphics().drawString(des, 4, 10);
        canvas1.getGraphics().drawString("Almacen "+alm, 4, 110);
        canvas1.getGraphics().drawString("Localidad "+loc, 4, 140);        
        
    }//GEN-LAST:event_btngenerarActionPerformed

    private void cstatusCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cstatusCaretPositionChanged
    
    }//GEN-LAST:event_cstatusCaretPositionChanged

    private void cstatusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cstatusPropertyChange
    Color cc;
    
        if (cstatus.getSelectedIndex() == 0)
                {     
                cc = new Color(255, 170, 0); }
        else
        {if (cstatus.getSelectedIndex() == 1)
                {     
                cc = new Color(0, 255, 0); }
        else{cc = new Color(255, 255, 255);}
                        };
                        
        canvas1.setBackground(cc);    // TODO add your handling code here:
    }//GEN-LAST:event_cstatusPropertyChange

    private void cstatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cstatusKeyPressed
    Color cc;
    
        if (cstatus.getSelectedIndex() == 0)
                {     
                cc = new Color(255, 170, 0); }
        else
        {if (cstatus.getSelectedIndex() == 1)
                {     
                cc = new Color(0, 255, 0); }
        else{cc = new Color(255, 255, 255);}
                        };
                        
        canvas1.setBackground(cc);    // TODO add your handling code here:
    }//GEN-LAST:event_cstatusKeyPressed

    private void cstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cstatusItemStateChanged
    Color cc;
    java.awt.event.ActionEvent e1;
    
    
        if (cstatus.getSelectedIndex() == 0)
                {     
                cc = new Color(255, 170, 0); }
        else
        {if (cstatus.getSelectedIndex() == 1)
                {     
                cc = new Color(0, 255, 0); }
        else{cc = new Color(255, 255, 255);}
                        };
                        
        canvas1.setBackground(cc);
        
        
       
    }//GEN-LAST:event_cstatusItemStateChanged

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed
    try
 {
  String nombre="";
  JFileChooser file=new JFileChooser();
  file.showSaveDialog(this);
  File guarda =file.getSelectedFile();
 
  if(guarda !=null)
  {
   /*guardamos el archivo y le damos el formato directamente,
    * si queremos que se guarde en formato doc lo definimos como .doc*/
    FileWriter  save=new FileWriter(guarda+".txt");
    
    save.write("");
    save.close();
    JOptionPane.showMessageDialog(null,
         "El archivo se a guardado Exitosamente",
             "Información",JOptionPane.INFORMATION_MESSAGE);
    }
 }
  catch(IOException ex)
  {
   JOptionPane.showMessageDialog(null,
        "Su archivo no se ha guardado",
           "Advertencia",JOptionPane.WARNING_MESSAGE);
  }
 
    }//GEN-LAST:event_btnexportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(codigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new codigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexportar;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnregresar1;
    private javax.swing.JComboBox<String> calmacen;
    private java.awt.Canvas canvas1;
    private javax.swing.JComboBox<String> cstatus;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JTextField tdescripcion;
    private javax.swing.JTextField tlocalidad;
    // End of variables declaration//GEN-END:variables
}