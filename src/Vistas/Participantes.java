/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author carlt
 */
public class Participantes extends javax.swing.JFrame {
String nombre;//ACA SE ALMACENA NOMBRE DEL PARTICIPANTE
String apellido;//ACA SE ALMACENA APELLIDO DEL PARTICIPANTE
    /**
     * Creates new form Participantes
     */
                                             

    public Participantes() {
        initComponents();
        Icon iconoActivado = new ImageIcon("C:\\Users\\carlt\\Downloads\\Quiniela\\Quiniela\\src\\Imagenes\\ojo.png");
        Icon iconoDesactivado = new ImageIcon("C:\\Users\\carlt\\Downloads\\Quiniela\\Quiniela\\src\\Imagenes\\invisible.png");
        btnOjo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (btnOjo.isSelected()) {
                // Código a ejecutar cuando el botón está seleccionado
                btnOjo.setIcon(iconoActivado);
               txtPass.setEchoChar((char) 0);
            } else {
                // Código a ejecutar cuando el botón no está seleccionado
                btnOjo.setIcon(iconoDesactivado);
                txtPass.setEchoChar('\u2022');
            } 
    }  
    
    
        });
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtDPI = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnOjo = new javax.swing.JToggleButton();

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

        txtNombre.setBackground(new java.awt.Color(251, 252, 253));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setToolTipText("Nombre de Usuario");
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtNombre.setName(""); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
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

        txtApellidos.setBackground(new java.awt.Color(251, 252, 253));
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellidos.setToolTipText("Nombre de Usuario");
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtApellidos.setName(""); // NOI18N
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidosMouseClicked(evt);
            }
        });
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(251, 252, 253));
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setToolTipText("Nombre de Usuario");
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtTelefono.setName(""); // NOI18N
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(251, 252, 253));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        txtDPI.setBackground(new java.awt.Color(251, 252, 253));
        txtDPI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDPI.setToolTipText("Nombre de Usuario");
        txtDPI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtDPI.setName(""); // NOI18N
        txtDPI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDPIMouseClicked(evt);
            }
        });
        txtDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPIActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(251, 252, 253));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });

        btnOjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/invisible.png"))); // NOI18N
        btnOjo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(127, 219, 228)));

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtUsuario)
                    .addComponent(txtApellidos)
                    .addComponent(txtTelefono)
                    .addComponent(jLabel10)
                    .addComponent(txtDPI)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOjo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ModeloParticipantes mParticipantes = new ModeloParticipantes();
        mParticipantes.Guardar(1, txtNombre.getText(), txtApellidos.getText(), txtUsuario.getText(), txtPass.getText(), txtTelefono.getText(), txtDPI.getText());
       // public void Guardar(int id, String nombre, String apellidos, String usuario, String pass, String telefono, String dpi)
    }//GEN-LAST:event_btnIngresarActionPerformed
//        vQuiniela quin = new vQuiniela();//SE CREA EL OBJETO vQUINIELA y se ASIGNA A LA VARIABLE quin
//         nombre =this.txtNombre.getText(); //se obtiene el nombre del paticipante del txtnombre y se guarda en la variable nombre
//         apellido =this.txtApellidos.getText();//se obtiene el apellido del paticipante del txtApellidos y se guarda en la variable apellido
//        txtNombre.setText("");//limpia lo antes ingresado en las cajas de texto
//        txtApellidos.setText("");//limpia lo antes ingresado en las cajas de texto
//        this.txtDPI.setText("");//LIMPIA LO INGRESADO EN LA CAJA DE TEXTO txtDPI
//        this.txtTelefono.setText("");//LIMPIA LO INGRESADO EN LA CAJA DE TEXTO txtTelefono
//        quin.lblNombre.setText(nombre+" "+ apellido);// en el objeto quin.lblNombre se va setear y concatenar con lo que se haya almacenado en las variables en nombre y apellido


    private void txtApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosMouseClicked

    private void btnNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNacionalActionPerformed
        vQuiniela quin = new vQuiniela();// Esta línea crea un nuevo objeto de la clase,vQuiniela y lo asigna a la variable quin para trabajar con ella 
        quin.setVisible(true);//Esta línea establece que la ventana (quin, que es una instancia de vQuiniela) debe ser visible.
        quin.setLocationRelativeTo(null);//Esta línea coloca la ventana quin en el centro de la pantalla.
        quin.lblNombre.setText(nombre+" "+ apellido);//Esta línea establece el texto de la etiqueta quin.lblNombre concatenando nombre y apellido con un espacio entre ellos. 
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnNacionalActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtUsuario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario3MouseClicked

    private void txtUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario3ActionPerformed

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuario6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuario6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario6MouseClicked

    private void txtUsuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario6ActionPerformed

    private void txtDPIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDPIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPIMouseClicked

    private void txtDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPIActionPerformed

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        // TODO add your handling code here:
        txtPass.setText("");
    }//GEN-LAST:event_txtPassMouseClicked

                                                

    private void btnEspañolaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        vLigaEspa quin = new vLigaEspa();// Esta línea crea un nuevo objeto de la clase,vLigaEspa y lo asigna a la variable quin para trabajar con ella 
        quin.setVisible(true);//Esta línea establece que la ventana (quin, que es una instancia de vQuiniela) debe ser visible.
        quin.setLocationRelativeTo(null);//Esta línea coloca la ventana quin en el centro de la pantalla.
        quin.lblNombre.setText(nombre+" "+ apellido);//Esta línea establece el texto de la etiqueta quin.lblNombre concatenando nombre y apellido con un espacio entre ellos. 
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
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JToggleButton btnOjo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario3;
    private javax.swing.JTextField txtUsuario6;
    // End of variables declaration//GEN-END:variables
}
