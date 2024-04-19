
package Vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class frmVistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmVistaPrincipal
     */
    public frmVistaPrincipal() {
        
        
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);//maximiza la ventana en la que se ejecuta este código, haciéndola ocupar todo el espacio disponible en la pantalla del usuario.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        VentanaPrin = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbarMenu = new javax.swing.JMenu();
        submnLiga = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrin.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout VentanaPrinLayout = new javax.swing.GroupLayout(VentanaPrin);
        VentanaPrin.setLayout(VentanaPrinLayout);
        VentanaPrinLayout.setHorizontalGroup(
            VentanaPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        VentanaPrinLayout.setVerticalGroup(
            VentanaPrinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        mbarMenu.setText("Menu");

        submnLiga.setText("Ligas");
        submnLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submnLigaActionPerformed(evt);
            }
        });
        mbarMenu.add(submnLiga);

        jMenuBar1.add(mbarMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Iniciar Sesion");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrin, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrin, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submnLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submnLigaActionPerformed
        // TODO add your handling code here:
        frmLigas VistaLigas = new frmLigas();// Esta línea crea una nueva instancia de la clase frmLigas y la asigna a la variable VistaLigas
        VistaLigas.setVisible(true);//Esta línea establece la visibilidad del formulario VistaLigas a true, lo que significa que el formulario se mostrará en la pantalla.
        //VistaLigas.setLocationRelativeTo(this);
        
        CentrarVentana(VistaLigas);//Esta línea llama a un método llamado CentrarVentana y pasa la instancia de VistaLigas como argumento. 
    }//GEN-LAST:event_submnLigaActionPerformed

        void CentrarVentana(JInternalFrame frame){
        VentanaPrin.add(frame);// Esta línea agrega la ventana interna (frame) al contenedor principal (VentanaPrin)
        Dimension dimension = VentanaPrin.getSize();// Esta línea obtiene las dimensiones del contenedor principal (VentanaPrin) y las almacena en un objeto de tipo Dimension llamado dimension.
        Dimension frameVentana = frame.getSize();//Esta línea tiene la intención de calcular las coordenadas de ubicación para centrar la ventana interna en el contenedor.
        frame.setLocation((dimension.width -frameVentana.height)/100, (dimension.height -frameVentana.width)/100);
        frame.show();//Esta línea muestra la ventana interna (frame) dentro del contenedor principal (VentanaPrin).
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
            java.util.logging.Logger.getLogger(frmVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrin;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mbarMenu;
    private javax.swing.JMenuItem submnLiga;
    // End of variables declaration//GEN-END:variables
}
