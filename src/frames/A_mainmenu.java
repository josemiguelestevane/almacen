/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import Base_de_datos.BD_REQ;
import Codigo.D_codigo;

/**
 *
 * @author appleapple
 */
public class A_mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form mainmenu
     */
    public A_mainmenu() {
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

        jPanel1 = new javax.swing.JPanel();
        btnminimizar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btninventario = new javax.swing.JButton();
        btncuenta = new javax.swing.JButton();
        btnseguridad = new javax.swing.JButton();
        btnrequi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btncodigo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBD = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("framemenu"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnminimizar.setBackground(new java.awt.Color(102, 102, 102));
        btnminimizar.setForeground(new java.awt.Color(51, 51, 51));
        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/004-minimize.png"))); // NOI18N
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btnminimizar.setFocusPainted(false);
        btnminimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminimizarActionPerformed(evt);
            }
        });

        btncerrar.setBackground(new java.awt.Color(102, 102, 102));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/003-cross-symbol.png"))); // NOI18N
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setFocusPainted(false);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnminimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnminimizar)
                    .addComponent(btncerrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btninventario.setBackground(new java.awt.Color(255, 255, 255));
        btninventario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninventario.setForeground(new java.awt.Color(255, 170, 0));
        btninventario.setText("INVENTARIO");
        btninventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninventarioActionPerformed(evt);
            }
        });

        btncuenta.setBackground(new java.awt.Color(255, 255, 255));
        btncuenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncuenta.setForeground(new java.awt.Color(255, 170, 0));
        btncuenta.setText("CUENTAS");
        btncuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuentaActionPerformed(evt);
            }
        });

        btnseguridad.setBackground(new java.awt.Color(255, 255, 255));
        btnseguridad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnseguridad.setForeground(new java.awt.Color(255, 170, 0));
        btnseguridad.setText("SEGURIDAD");
        btnseguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseguridadActionPerformed(evt);
            }
        });

        btnrequi.setBackground(new java.awt.Color(255, 255, 255));
        btnrequi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnrequi.setForeground(new java.awt.Color(255, 153, 0));
        btnrequi.setText("REQUISICIONES");
        btnrequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequiActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/001-factory-stock-house.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/002-helmet.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/user (1).png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/barcode.png"))); // NOI18N

        btncodigo.setBackground(new java.awt.Color(255, 255, 255));
        btncodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncodigo.setForeground(new java.awt.Color(255, 170, 0));
        btncodigo.setText("CODIGOS");
        btncodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncodigoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/file.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/data-storage-device.png"))); // NOI18N

        btnBD.setBackground(new java.awt.Color(255, 255, 255));
        btnBD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBD.setForeground(new java.awt.Color(255, 153, 0));
        btnBD.setText("BASE DE DATOS");
        btnBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBDActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninventario)
                    .addComponent(jLabel4)
                    .addComponent(btncodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseguridad)
                    .addComponent(jLabel5)
                    .addComponent(btnrequi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(btnBD))
                .addGap(62, 62, 62))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrequi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnseguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseguridadActionPerformed
        C_empresas e=new C_empresas();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnseguridadActionPerformed

    private void btninventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninventarioActionPerformed
        B_inventario i = new B_inventario();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btninventarioActionPerformed

    private void btncuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuentaActionPerformed
        E_umenu um= new E_umenu();
        um.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncuentaActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnminimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminimizarActionPerformed
        
        this.setExtendedState(1);
    }//GEN-LAST:event_btnminimizarActionPerformed

    private void btncodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncodigoActionPerformed
        D_codigo c= new D_codigo();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncodigoActionPerformed

    private void btnrequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequiActionPerformed
        
        F_requisicion r=new F_requisicion();
        r.setVisible(true);
        this.dispose();
        BD_REQ m =new BD_REQ();
        m.mostrarREQ();
        
    }//GEN-LAST:event_btnrequiActionPerformed

    private void btnBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBDActionPerformed
        
        G_db b=new G_db();
        this.dispose();
        b.setVisible(true);
        
    }//GEN-LAST:event_btnBDActionPerformed
    
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
            java.util.logging.Logger.getLogger(A_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBD;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncodigo;
    private javax.swing.JButton btncuenta;
    private javax.swing.JButton btninventario;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnrequi;
    private javax.swing.JButton btnseguridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
