/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author carlt
 */
public class Participantes extends javax.swing.JFrame {
String nombre;
String apellido;
    /**
     * Creates new form Participantes
     */
                                             

    public Participantes() {
        initComponents();
       Icon iconoActivado = new ImageIcon("C:\\Users\\carlt\\Downloads\\Quiniela\\Quiniela\\src\\Imagenes\\ojo.png");
Icon iconoDesactivado = new ImageIcon("C:\\Users\\carlt\\Downloads\\Quiniela\\Quiniela\\src\\Imagenes\\invisible.png");
jToggleButton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        if (jToggleButton1.isSelected()) {
            // Código a ejecutar cuando el botón está seleccionado
            jToggleButton1.setIcon(iconoActivado);
           txtContraseña.setEchoChar((char) 0);
        } else {
            // Código a ejecutar cuando el botón no está seleccionado
            jToggleButton1.setIcon(iconoDesactivado);
            txtContraseña.setEchoChar('*');
        } 
    }
});


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario3 = new javax.swing.JTextField();
        txtUsuario6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        txtUsuario4 = new javax.swing.JTextField();
        txtUsuario5 = new javax.swing.JTextField();
        txtUsuario7 = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();

        txtUsuario3.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario3.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario3.setText("Nombre de Usuario");
        txtUsuario3.setToolTipText("Nombre de Usuario");
        txtUsuario3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario3.setName(""); // NOI18N
        txtUsuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario3MouseClicked(evt);
            }
        });
        txtUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario3ActionPerformed(evt);
            }
        });

        txtUsuario6.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario6.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario6.setText("Nombre de Usuario");
        txtUsuario6.setToolTipText("Nombre de Usuario");
        txtUsuario6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario6.setName(""); // NOI18N
        txtUsuario6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario6MouseClicked(evt);
            }
        });
        txtUsuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Registro de Participantes");

        btnCancelar.setForeground(new java.awt.Color(0, 153, 153));
        btnCancelar.setText("Cancelar");

        btnIngresar.setForeground(new java.awt.Color(0, 153, 153));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setToolTipText("Nombre de Usuario");
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario.setName(""); // NOI18N
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("USUARIO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("APELLIDOS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CONTRASEÑA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("TELEFONO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("DPI");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("NOMBRE");

        txtUsuario1.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario1.setToolTipText("Nombre de Usuario");
        txtUsuario1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario1.setName(""); // NOI18N
        txtUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario1MouseClicked(evt);
            }
        });
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });

        txtUsuario4.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario4.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario4.setToolTipText("Nombre de Usuario");
        txtUsuario4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario4.setName(""); // NOI18N
        txtUsuario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario4MouseClicked(evt);
            }
        });
        txtUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario4ActionPerformed(evt);
            }
        });

        txtUsuario5.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario5.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario5.setToolTipText("Nombre de Usuario");
        txtUsuario5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario5.setName(""); // NOI18N
        txtUsuario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario5MouseClicked(evt);
            }
        });
        txtUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario5ActionPerformed(evt);
            }
        });

        txtUsuario7.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario7.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario7.setToolTipText("Nombre de Usuario");
        txtUsuario7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtUsuario7.setName(""); // NOI18N
        txtUsuario7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuario7MouseClicked(evt);
            }
        });
        txtUsuario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario7ActionPerformed(evt);
            }
        });

        txtContraseña.setBackground(new java.awt.Color(251, 252, 253));
        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });

        jToggleButton1.setForeground(new java.awt.Color(0, 0, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/invisible.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(412, 412, 412))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(txtUsuario)
                        .addComponent(jLabel9)
                        .addComponent(txtUsuario5)
                        .addComponent(txtUsuario1)
                        .addComponent(txtUsuario4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10)
                        .addComponent(txtUsuario7)))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1MouseClicked

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    private void txtUsuario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario3MouseClicked

    private void txtUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario3ActionPerformed

    private void txtUsuario4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario4MouseClicked

    private void txtUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario4ActionPerformed

    private void txtUsuario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario5MouseClicked

    private void txtUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario5ActionPerformed

    private void txtUsuario6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario6MouseClicked

    private void txtUsuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario6ActionPerformed

    private void txtUsuario7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario7MouseClicked

    private void txtUsuario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario7ActionPerformed

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Participantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario3;
    private javax.swing.JTextField txtUsuario4;
    private javax.swing.JTextField txtUsuario5;
    private javax.swing.JTextField txtUsuario6;
    private javax.swing.JTextField txtUsuario7;
    // End of variables declaration//GEN-END:variables
}
