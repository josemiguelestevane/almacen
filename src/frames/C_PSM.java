/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import Base_de_datos.BD_PSM;
import Clases.Clase_PSM;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Estevane
 */
public class C_PSM extends javax.swing.JFrame {
    private Object con;
    private TableRowSorter trsFiltro;
    /**
     * Creates new form seguridad
     */
    public C_PSM() {
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

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnmostar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnelimiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tconPSM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tdesPSM = new javax.swing.JTextField();
        tdisPSM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tcodigoPSM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtestatus = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/005-keyboard-left-arrow-button.png"))); // NOI18N
        btnregresar.setBorderPainted(false);
        btnregresar.setContentAreaFilled(false);
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tablas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        tablas1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "DISPONIBLE", "CONTEO", "ESTATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablas1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablas1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        btnmostar.setBackground(new java.awt.Color(255, 255, 255));
        btnmostar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmostar.setForeground(new java.awt.Color(255, 153, 0));
        btnmostar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/refresh-button.png"))); // NOI18N
        btnmostar.setText("ACTUALIZAR");
        btnmostar.setToolTipText("");
        btnmostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostarActionPerformed(evt);
            }
        });

        btnlimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnlimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnlimpar.setForeground(new java.awt.Color(255, 153, 0));
        btnlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/rubber.png"))); // NOI18N
        btnlimpar.setText("LIMPIAR");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 153, 0));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/001-add-button.png"))); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnelimiar.setBackground(new java.awt.Color(255, 255, 255));
        btnelimiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnelimiar.setForeground(new java.awt.Color(255, 153, 0));
        btnelimiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/002-recycle-bin.png"))); // NOI18N
        btnelimiar.setText("ELIMINAR");
        btnelimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimiarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/PSM.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DESCRIPCION");

        tdesPSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdesPSMActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CONTEO");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CODIGO");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DISPONIBLE");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ESTATUS");

        txtestatus.setBackground(new java.awt.Color(255, 255, 255));
        txtestatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "SIN STOCK" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tdesPSM, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tdisPSM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                                .addComponent(tconPSM, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(tcodigoPSM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tcodigoPSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tdesPSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tdisPSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tconPSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "BUSCAR POR:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 153, 0))); // NOI18N

        comboFiltro.setBackground(new java.awt.Color(255, 255, 255));
        comboFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboFiltro.setForeground(new java.awt.Color(102, 102, 102));
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "DESCRIPCION", "DISPONIBLE", "ESTATUS", " " }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        txtFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/003-magnifying-glass-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnactualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnactualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 153, 0));
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/001-reload.png"))); // NOI18N
        btnactualizar.setText("MODIFICAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnmostar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnelimiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnelimiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpar)
                    .addComponent(btnactualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnmostar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnmostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostarActionPerformed
       
        BD_PSM m =new BD_PSM();
        m.mostrarPSM();
    }//GEN-LAST:event_btnmostarActionPerformed

    private void btnelimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimiarActionPerformed
        BD_PSM m =new BD_PSM();
        Clase_PSM mpsm;
        try {
            //mpsm=new Clase_PSM();// Cuando es un valor solo hacemos esto 
            m.eliminarPSM(tcodigoPSM.getText());
        } catch (SQLException ex) {
            Logger.getLogger(C_PSM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnelimiarActionPerformed

    private void tablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablas1MouseClicked
        int seleccion =tablas1.rowAtPoint(evt.getPoint());
        tcodigoPSM.setText(String.valueOf(tablas1.getValueAt(seleccion,0)));
        tdesPSM.setText(String.valueOf(tablas1.getValueAt(seleccion,1)));
        tdisPSM.setText(String.valueOf(tablas1.getValueAt(seleccion,2)));
        
    }//GEN-LAST:event_tablas1MouseClicked

    private void tdesPSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdesPSMActionPerformed
       
    }//GEN-LAST:event_tdesPSMActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        BD_PSM m =new BD_PSM();
        Clase_PSM mpsm;
        try {
            mpsm=new Clase_PSM(tcodigoPSM.getText(),tdesPSM.getText(),tdisPSM.getText(),tconPSM.getText(),txtestatus.getSelectedItem());
 
            m.nuevoPSM(mpsm);
        } catch (SQLException ex) {
            Logger.getLogger(C_PSM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        tcodigoPSM.setText(null);
        tdesPSM.setText(null);
        tdisPSM.setText(null);
    }//GEN-LAST:event_btnlimparActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablas1.getModel());
        tablas1.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        BD_PSM m =new BD_PSM();
        Clase_PSM mpsm;
        try {
            mpsm=new Clase_PSM(tcodigoPSM.getText(),tdesPSM.getText(),tdisPSM.getText(),tconPSM.getText(),txtestatus.getSelectedItem());
 
            m.actualizarPSM(mpsm);
        } catch (SQLException ex) {
            Logger.getLogger(C_PSM.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnactualizarActionPerformed
    
   public void filtro() {
        int columnaABuscar = 0;
        if (comboFiltro.getSelectedItem() == "CODIGO") {
            columnaABuscar = 0;
        }
        if (comboFiltro.getSelectedItem().toString() == "DESCRIPCION") {
            columnaABuscar = 1;
        }
        if (comboFiltro.getSelectedItem() == "DISPONIBLE") {
            columnaABuscar = 2;
        }
        if (comboFiltro.getSelectedItem().toString() == "ESTATUS") {
            columnaABuscar = 4;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

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
            java.util.logging.Logger.getLogger(C_PSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_PSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_PSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_PSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_PSM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnelimiar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnmostar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablas1;
    public static javax.swing.JTextField tcodigoPSM;
    public static javax.swing.JTextField tconPSM;
    public static javax.swing.JTextField tdesPSM;
    public static javax.swing.JTextField tdisPSM;
    private javax.swing.JTextField txtFiltro;
    public static javax.swing.JComboBox<String> txtestatus;
    // End of variables declaration//GEN-END:variables
}
