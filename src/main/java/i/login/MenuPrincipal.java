
package i.login;

import Mantenimientos.mantenimientodedocumento;
import Mantenimientos.mantimientodeUsuario;

public class MenuPrincipal extends javax.swing.JFrame {

 
    public MenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        manusuario = new javax.swing.JMenuItem();
        mancatalogoDecuenta = new javax.swing.JMenuItem();
        mantemientodoc = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("manetenimiento");

        manusuario.setText("Usuarios");
        manusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manusuarioActionPerformed(evt);
            }
        });
        jMenu3.add(manusuario);

        mancatalogoDecuenta.setText("Catalogo de cuenta");
        mancatalogoDecuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mancatalogoDecuentaActionPerformed(evt);
            }
        });
        jMenu3.add(mancatalogoDecuenta);

        mantemientodoc.setText("Documentos");
        mantemientodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantemientodocActionPerformed(evt);
            }
        });
        jMenu3.add(mantemientodoc);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("consultas");

        jMenuItem8.setText("Catalogo de cuenta");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Transcciones por fecha ");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Transacciones por rango de fechas");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Transacciones por Documento");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Transacciones por Tipo de Documento");
        jMenu1.add(jMenuItem12);

        jMenuItem13.setText("Balanza general (Activos , pasivo y capital");
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Balanza de comprobacion");
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Resumen de gastos generales");
        jMenu1.add(jMenuItem15);

        jMenuItem16.setText("Estado de ganacias y perdidas");
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("procesos");

        jMenuItem6.setText("Cierre de Diario por fechas");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Cierre de fin de año fiscal por fecha año fiscal");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("movimientos");

        jMenuItem5.setText("De transcciones");
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manusuarioActionPerformed
       mantimientodeUsuario usuarioForm = new mantimientodeUsuario(); 
       usuarioForm.setVisible(true); 
    }//GEN-LAST:event_manusuarioActionPerformed

    private void mantemientodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantemientodocActionPerformed
       mantenimientodedocumento usuarioForm = new mantenimientodedocumento(); 
       usuarioForm.setVisible(true);
    }//GEN-LAST:event_mantemientodocActionPerformed

    private void mancatalogoDecuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mancatalogoDecuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mancatalogoDecuentaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mancatalogoDecuenta;
    private javax.swing.JMenuItem mantemientodoc;
    private javax.swing.JMenuItem manusuario;
    // End of variables declaration//GEN-END:variables
}
