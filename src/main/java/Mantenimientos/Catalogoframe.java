/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Mantenimientos;

/**
 *
 * @author Dalvi
 */
public class Catalogoframe extends javax.swing.JFrame {

    /**
     * Creates new form Catalologoframe
     */
    public Catalogoframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NumCuenta = new javax.swing.JLabel();
        Descrip = new javax.swing.JLabel();
        TipoCuento = new javax.swing.JLabel();
        LCuenta = new javax.swing.JLabel();
        CuentaPadre = new javax.swing.JLabel();
        GrupCuenta = new javax.swing.JLabel();
        DebAcum = new javax.swing.JLabel();
        CreditAcum = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Numero_Cuntatxt = new javax.swing.JTextField();
        Descriptxt = new javax.swing.JTextField();
        GeneralRadioButton_1 = new javax.swing.JRadioButton();
        DetaillRadioButton_2 = new javax.swing.JRadioButton();
        NivelCuentatxt = new javax.swing.JTextField();
        CuentaPadretxt = new javax.swing.JTextField();
        GrupCuentatxt = new javax.swing.JTextField();
        DebitAcumtxt = new javax.swing.JTextField();
        CreditAcumtxt = new javax.swing.JTextField();
        Balancetxt = new javax.swing.JTextField();
        AgregarButton_1 = new javax.swing.JButton();
        LimpiarButton_2 = new javax.swing.JButton();
        SalirButton_3 = new javax.swing.JButton();
        Cabecera = new javax.swing.JPanel();
        Encabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 113, 203));

        NumCuenta.setForeground(new java.awt.Color(255, 255, 255));
        NumCuenta.setText("Numero de Cuenta:");

        Descrip.setForeground(new java.awt.Color(255, 255, 255));
        Descrip.setText("Descripcion:");

        TipoCuento.setForeground(new java.awt.Color(255, 255, 255));
        TipoCuento.setText("Tipo de Cuenta");

        LCuenta.setForeground(new java.awt.Color(255, 255, 255));
        LCuenta.setText("Nivel de Cuenta");

        CuentaPadre.setForeground(new java.awt.Color(255, 255, 255));
        CuentaPadre.setText("Cuenta Padre");

        GrupCuenta.setForeground(new java.awt.Color(255, 255, 255));
        GrupCuenta.setText("Grupo de Cuenta");

        DebAcum.setForeground(new java.awt.Color(255, 255, 255));
        DebAcum.setText("Debito Acumlado");

        CreditAcum.setForeground(new java.awt.Color(255, 255, 255));
        CreditAcum.setText("Credito acumulado");

        Balance.setForeground(new java.awt.Color(255, 255, 255));
        Balance.setText("Balance");

        Numero_Cuntatxt.setBackground(new java.awt.Color(24, 113, 203));
        Numero_Cuntatxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Numero_Cuntatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero_CuntatxtActionPerformed(evt);
            }
        });

        Descriptxt.setBackground(new java.awt.Color(24, 113, 203));
        Descriptxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        GeneralRadioButton_1.setForeground(new java.awt.Color(255, 255, 255));
        GeneralRadioButton_1.setText("General");

        DetaillRadioButton_2.setForeground(new java.awt.Color(255, 255, 255));
        DetaillRadioButton_2.setText("Detallada");
        DetaillRadioButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetaillRadioButton_2ActionPerformed(evt);
            }
        });

        NivelCuentatxt.setBackground(new java.awt.Color(24, 113, 203));
        NivelCuentatxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        CuentaPadretxt.setBackground(new java.awt.Color(24, 113, 203));
        CuentaPadretxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        GrupCuentatxt.setBackground(new java.awt.Color(24, 113, 203));
        GrupCuentatxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        DebitAcumtxt.setBackground(new java.awt.Color(24, 113, 203));
        DebitAcumtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        CreditAcumtxt.setBackground(new java.awt.Color(24, 113, 203));
        CreditAcumtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        Balancetxt.setBackground(new java.awt.Color(24, 113, 203));
        Balancetxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        AgregarButton_1.setBackground(new java.awt.Color(255, 255, 255));
        AgregarButton_1.setForeground(new java.awt.Color(24, 113, 203));
        AgregarButton_1.setText("Agregar");
        AgregarButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButton_1ActionPerformed(evt);
            }
        });

        LimpiarButton_2.setBackground(new java.awt.Color(255, 255, 255));
        LimpiarButton_2.setForeground(new java.awt.Color(24, 113, 203));
        LimpiarButton_2.setText("Limpiar");
        LimpiarButton_2.setToolTipText("");
        LimpiarButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarButton_2ActionPerformed(evt);
            }
        });

        SalirButton_3.setBackground(new java.awt.Color(255, 255, 255));
        SalirButton_3.setForeground(new java.awt.Color(24, 113, 203));
        SalirButton_3.setText("Salir");

        Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Cabecera.setForeground(new java.awt.Color(24, 113, 203));
        Cabecera.setToolTipText("");

        Encabezado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Encabezado.setForeground(new java.awt.Color(24, 113, 203));
        Encabezado.setText("Catàlogo de Cuenta");

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(Encabezado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Encabezado)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumCuenta)
                            .addComponent(Descrip))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Numero_Cuntatxt)
                            .addComponent(Descriptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarButton_1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TipoCuento)
                                .addComponent(LCuenta)
                                .addComponent(CuentaPadre)
                                .addComponent(GrupCuenta)
                                .addComponent(DebAcum)
                                .addComponent(CreditAcum)
                                .addComponent(Balance)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CreditAcumtxt)
                                    .addComponent(Balancetxt)
                                    .addComponent(DebitAcumtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(GrupCuentatxt)
                                    .addComponent(CuentaPadretxt)
                                    .addComponent(NivelCuentatxt)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(GeneralRadioButton_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                        .addComponent(DetaillRadioButton_2)
                                        .addGap(138, 138, 138))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LimpiarButton_2)
                                .addGap(130, 130, 130)
                                .addComponent(SalirButton_3)))))
                .addGap(198, 198, 198))
            .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumCuenta)
                    .addComponent(Numero_Cuntatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descrip)
                    .addComponent(Descriptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCuento)
                    .addComponent(GeneralRadioButton_1)
                    .addComponent(DetaillRadioButton_2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelCuentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CuentaPadretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuentaPadre))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrupCuentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GrupCuenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DebitAcumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DebAcum))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreditAcum)
                    .addComponent(CreditAcumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Balancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarButton_1)
                    .addComponent(LimpiarButton_2)
                    .addComponent(SalirButton_3))
                .addGap(23, 23, 23))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DetaillRadioButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetaillRadioButton_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetaillRadioButton_2ActionPerformed

    private void AgregarButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButton_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarButton_1ActionPerformed

    private void LimpiarButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarButton_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarButton_2ActionPerformed

    private void Numero_CuntatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero_CuntatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero_CuntatxtActionPerformed

    private void SalirButton_3ActionPerformed(java.awt.event.ActionEvent evt){
        System.exit(0);
    }
   
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
            java.util.logging.Logger.getLogger(Catalogoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogoframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogoframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton_1;
    private javax.swing.JLabel Balance;
    private javax.swing.JTextField Balancetxt;
    private javax.swing.JPanel Cabecera;
    private javax.swing.JLabel CreditAcum;
    private javax.swing.JTextField CreditAcumtxt;
    private javax.swing.JLabel CuentaPadre;
    private javax.swing.JTextField CuentaPadretxt;
    private javax.swing.JLabel DebAcum;
    private javax.swing.JTextField DebitAcumtxt;
    private javax.swing.JLabel Descrip;
    private javax.swing.JTextField Descriptxt;
    private javax.swing.JRadioButton DetaillRadioButton_2;
    private javax.swing.JLabel Encabezado;
    private javax.swing.JRadioButton GeneralRadioButton_1;
    private javax.swing.JLabel GrupCuenta;
    private javax.swing.JTextField GrupCuentatxt;
    private javax.swing.JLabel LCuenta;
    private javax.swing.JButton LimpiarButton_2;
    private javax.swing.JTextField NivelCuentatxt;
    private javax.swing.JLabel NumCuenta;
    private javax.swing.JTextField Numero_Cuntatxt;
    private javax.swing.JButton SalirButton_3;
    private javax.swing.JLabel TipoCuento;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
