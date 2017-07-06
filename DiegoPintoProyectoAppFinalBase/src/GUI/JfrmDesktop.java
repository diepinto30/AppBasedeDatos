package GUI;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class JfrmDesktop extends javax.swing.JFrame {

    frmResgistrocita RegistroCitas = null;
    frmResgistodoctor RegistroDoctor = null;
    frmResgistopaciente RegistoPaciente = null;
    frmCitas Citas = null;
    
    public JfrmDesktop() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btDoctor = new javax.swing.JLabel();
        btRegistro = new javax.swing.JLabel();
        BTPaciente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuPacientes = new javax.swing.JMenuItem();
        jMenuDoctores = new javax.swing.JMenuItem();
        jMenuCitas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/e7935ee874fadc9c8358475f5149970a.png"))); // NOI18N
        btDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDoctorMouseClicked(evt);
            }
        });
        btDoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btDoctorKeyPressed(evt);
            }
        });

        btRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/diagnosis_prescription_report_doctor_consultation_document_medical_conclusion_flat_design_icon-512.png"))); // NOI18N
        btRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRegistroMouseClicked(evt);
            }
        });

        BTPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1428565137_avatar-01-2-512.png"))); // NOI18N
        BTPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTPacienteMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registro Doctores");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Citas Actuales");

        jLabel6.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro de Citas");

        jbtSalir.setFont(new java.awt.Font("OCR A Std", 0, 13)); // NOI18N
        jbtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/x-mark-hi.png"))); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Calendario-e-Relogio.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("OCR A Std", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro Paciente");

        jDesktopPane1.setLayer(btDoctor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BTPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbtSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btDoctor)
                .addGap(139, 139, 139)
                .addComponent(BTPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btRegistro)
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(234, 234, 234)
                        .addComponent(jbtSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(357, 357, 357))))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(344, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(310, 310, 310)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDoctor)
                    .addComponent(BTPaciente)
                    .addComponent(btRegistro))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSalir)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(jLabel7)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");

        JMenuPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        JMenuPacientes.setText("Resgistro Pacientes");
        JMenuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuPacientes);

        jMenuDoctores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuDoctores.setText("Resgistro Doctores");
        jMenuDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDoctoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDoctores);

        jMenuCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCitas.setText("Resgistro Citas");
        jMenuCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCitasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCitas);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Citas Actuales");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_MASK));
        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea realizar cerrar la aplicacion", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }
        
    private void jMenuCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCitasActionPerformed
        try {
            RegistroCitas = new frmResgistrocita();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroCitas.setVisible(true);
        RegistroCitas.pack();
        
    }//GEN-LAST:event_jMenuCitasActionPerformed

    private void JMenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuPacientesActionPerformed
        RegistoPaciente = new frmResgistopaciente();
        RegistoPaciente.setVisible(true);
        RegistoPaciente.pack();
        
        
    }//GEN-LAST:event_JMenuPacientesActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDoctoresActionPerformed
        try {
            // TODO add your handling code here:
            RegistroDoctor = new frmResgistodoctor();
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroDoctor.setVisible(true);
        RegistroDoctor.pack();
        
    }//GEN-LAST:event_jMenuDoctoresActionPerformed

    private void btDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDoctorMouseClicked
        try {
            // TODO add your handling code here:
            RegistroDoctor = new frmResgistodoctor();
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroDoctor.setVisible(true);
        RegistroDoctor.pack();
    }//GEN-LAST:event_btDoctorMouseClicked

    private void btDoctorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btDoctorKeyPressed
        try {
            // TODO add your handling code here:
            RegistroDoctor = new frmResgistodoctor();
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroDoctor.setVisible(true);
        RegistroDoctor.pack();
    }//GEN-LAST:event_btDoctorKeyPressed

    private void BTPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTPacienteMouseClicked
        // TODO add your handling code here:
        RegistoPaciente = new frmResgistopaciente();
        RegistoPaciente.setVisible(true);
        RegistoPaciente.pack();
    }//GEN-LAST:event_BTPacienteMouseClicked

    private void btRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistroMouseClicked
        try {
            // TODO add your handling code here:
            RegistroCitas = new frmResgistrocita();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroCitas.setVisible(true);
        RegistroCitas.pack();
    }//GEN-LAST:event_btRegistroMouseClicked

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        // TODO add your handling code here:
        cerrar();
        
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            // TODO add your handling code here:
            Citas = new frmCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        Citas.setVisible(true);
        Citas.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            // TODO add your handling code here:
            Citas = new frmCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfrmDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        Citas.setVisible(true);
        Citas.pack();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTPaciente;
    private javax.swing.JMenuItem JMenuPacientes;
    private javax.swing.JLabel btDoctor;
    private javax.swing.JLabel btRegistro;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCitas;
    private javax.swing.JMenuItem jMenuDoctores;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbtSalir;
    // End of variables declaration//GEN-END:variables
}