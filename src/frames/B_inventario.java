
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author appleapple
 */
public class B_inventario extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    /**
     * Creates new form menu
     */
    public B_inventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo= (DefaultTableModel)jtablecodigos.getModel();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Copiar = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablecodigos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxlineas = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnregresar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Copiar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jtablecodigos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtablecodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Conteo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtablecodigos.setComponentPopupMenu(jPopupMenu1);
        jtablecodigos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                scanner(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtablecodigos);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2), "INVENTARIO CÍCLICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setName("nuevo"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Linea");

        jComboBoxlineas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxlineas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxlineas.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxlineas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 Aceites, grasas y combustibles", "02 Acero y brocas de barrenacion ", "03 Seguridad", "04 Baleros, chumaceras y otros", "05 Bandas industriales, automotrices y otras", "06 Bola y reactivo", "07 Empaquetadoras", "08", "09 Ferreteria", "10 Filtros", "11 Herramientas", "12 Llantas y camaras", "13", "14 Material electrico", "15 Material para construccion", "16 Material para laboratorio", "17", "18 Mangueras y conexiones", "19 Papeleria y articulos de oficina ", "20 Refacciones equipo diesel", "21 Refacciones automotrices", "22 Refacciones perforadoras", "23 Refacciones planta beneficio", "24 Refacciones lamparas mineras", "25 Refacciones compresores", "26 Refacciones maquina perforacion", "27 Refacciones para bombas", "28", "29 Soldura", "30 Tornilleria y otros", "31 Tuberias y conexiones", "32", "33", "34", "35 Cargos directos" }));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Fecha");

        btnlimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 153, 0));
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/refresh-button.png"))); // NOI18N
        btnlimpiar.setText("NUEVO");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Conteo físico:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Supervisó");

        txt1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txt1);

        txt2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(txt2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/007-export-file.png"))); // NOI18N
        jButton1.setText("REPORTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jComboBoxlineas, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxlineas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

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

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setForeground(new java.awt.Color(0, 204, 204));

        btnregresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/005-keyboard-left-arrow-button.png"))); // NOI18N
        btnregresar1.setBorderPainted(false);
        btnregresar1.setContentAreaFilled(false);
        btnregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar1)
                .addGap(24, 24, 24))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnregresar1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        codigo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        codigo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                codigoInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(codigo);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icn/tally-marks.png"))); // NOI18N
        jButton3.setText("AGREGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
          Object [] opciones = {"Aceptar", "Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(null,"Se perderan los datos, Desea continuar?", "ADVERTENCIA!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"aceptar");
            
            if(eleccion ==JOptionPane.YES_OPTION){         
          modelo.setRowCount(0);
          txt1.setText("");
          txt2.setText("");
            }
            
    }//GEN-LAST:event_btnlimpiarActionPerformed

    public int getIndextt(String search) {
    //DefaultTableModel modelo= (DefaultTableModel)jtablecodigos.getModel();
    
    int outIndex = -1;
    for (int i = 0; i < modelo.getRowCount(); i++) {
        String ss = (String) modelo.getValueAt(i, 0);
        
        
        if (ss.equals(search)) {
            outIndex = i;
        }
    }

    return outIndex;

}
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        String codigoletras=("PLMK0123456789");
        String codigoD=codigo.getText();
        
        String codigoL=("");
        int i,kk;
        char l,l2;
        
       
        for(i=0;i<codigoD.length();i++){
           l=codigoD.charAt(i);

           for(kk=0;kk<codigoletras.length();kk++){
               l2= codigoletras.charAt(kk);
               if(l==l2){
                   codigoL=codigoL+l;
                   break;
               }
               
           }
                  
        }
        
        
        
        
        if(codigoL.equals("")==false){
        
        boolean encontrado=false;
        
        if(true){
            
          int j = getIndextt(codigoL); 
          
          
          
          if(j == -1){
              char CI= codigoL.charAt(0);
               switch (CI){
                   case 'L':
                        String nombre;
                        nombre = JOptionPane.showInputDialog("¿Cual es la cantidad de litros?");
                  
                        double litros = Double.parseDouble(nombre);
                  
                        String cadena = String.valueOf(litros);
                  
                        modelo.addRow(new Object[]{codigoL,cadena});
                        encontrado=true; 
                       
                   break; 
                   
                   case 'K':
                        String strkilos;
                        strkilos = JOptionPane.showInputDialog("¿Cual es la cantidad de kilos?");
                  
                        double kilos = Double.parseDouble(strkilos);
                  
                        strkilos = String.valueOf(kilos);
                  
                        modelo.addRow(new Object[]{codigoL,strkilos});
                        encontrado=true; 
                       
                   break; 
                   
                   case 'M':
                        String strmetros;
                        strmetros = JOptionPane.showInputDialog("¿Cual es la cantidad de metros?");
                  
                        double metros = Double.parseDouble(strmetros);
                  
                        strmetros = String.valueOf(metros);
                  
                        modelo.addRow(new Object[]{codigoL,strmetros});
                        encontrado=true; 
                       
                   break;
                  
                   default:
                       modelo.addRow(new Object[]{codigoL,"1"});
                       encontrado=true;
                   break;
               
               }
              
               
          }else{
          
              String ss2 = (String) modelo.getValueAt(j, 1);
              String ss1 = (String) modelo.getValueAt(j, 0);
              
              char CII= ss1.charAt(0);
               switch (CII){
                     case 'L':
                        String nombre;
                        nombre = JOptionPane.showInputDialog("¿Cual es la cantidad de litros?");
                  
                        double litros = Double.parseDouble(nombre);
                        double litrosex = Double.parseDouble(ss2);
                        
                        litros=litros + litrosex;
                  
                        String strlitros = String.valueOf(litros);
                        modelo.setValueAt(strlitros, j, 1);
                  
                        encontrado=true;
                       
                         break; 
                     case 'K':
                        String strkilos;
                        strkilos = JOptionPane.showInputDialog("¿Cual es la cantidad de kilos?");
                  
                        double kilos = Double.parseDouble(strkilos);
                        double kilosex = Double.parseDouble(ss2);
                        
                        kilos=kilos + kilosex;
                  
                        strkilos = String.valueOf(kilos);
                        modelo.setValueAt(strkilos, j, 1);
                  
                        encontrado=true;
                       
                        break;
                     case 'M':
                        String strmetros;
                        strmetros = JOptionPane.showInputDialog("¿Cual es la cantidad de metros?");
                  
                        double metros = Double.parseDouble(strmetros);
                        double metrosex = Double.parseDouble(ss2);
                        
                        metros=metros + metrosex;
                  
                        strmetros = String.valueOf(metros);
                        modelo.setValueAt(strmetros, j, 1);
                  
                        encontrado=true;
                       
                        break; 
                        
                        
                     default:
                         int contador=Integer.parseInt(ss2);
                         
                         if(contador>= 5){
                             JOptionPane.showMessageDialog(null,"ADVERTENCIA!. SE HAN REGISTRADO MAS DE 5 CODIGOS");
                             String strcantidad=JOptionPane.showInputDialog("¿Cual es la cantidad total de articulos para este codigo?");
                             int cantidad=Integer.parseInt(strcantidad);
                             modelo.setValueAt(String.valueOf(cantidad), j, 1);
                             encontrado=true;
                         
                         }else{
          
                         contador++;
            
                        modelo.setValueAt(String.valueOf(contador), j, 1);
                       encontrado=true;
                       break;}

               
               }
         
              
          }
            
        }else {
            modelo.addRow(new Object[]{codigoL,"1"});
          }
        }
        codigo.setText(null);
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void codigoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_codigoInputMethodTextChanged
       //jTextArea1.setText(codigoL);  
    }//GEN-LAST:event_codigoInputMethodTextChanged

    private void scanner(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_scanner
     
    }//GEN-LAST:event_scanner

    private void btnregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnregresar1ActionPerformed

    private void codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyPressed
        //System.out.println(" ");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton3.doClick();
            codigo.setText(null);
        }
    }//GEN-LAST:event_codigoKeyPressed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        String stotal=(""),srenglon=("");
        
        for(int i=0;i<modelo.getRowCount();i++){
            for(int j=0;j<modelo.getColumnCount()-1;j++){
                srenglon=srenglon+modelo.getValueAt(i,j)+(char)9;
            }
           srenglon=srenglon+modelo.getValueAt(i,modelo.getColumnCount()-1);
           
           stotal=stotal+srenglon+(char)10;
           srenglon=("");
        }
        
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
       
        StringSelection texto = new StringSelection(stotal);
        cb.setContents(texto, texto); // TODO add your handling code here:
    }//GEN-LAST:event_CopiarActionPerformed

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
            java.util.logging.Logger.getLogger(B_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new B_inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregresar1;
    private javax.swing.JTextPane codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxlineas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtablecodigos;
    private javax.swing.JTextPane txt1;
    private javax.swing.JTextPane txt2;
    // End of variables declaration//GEN-END:variables
}
