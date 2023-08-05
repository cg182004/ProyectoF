
package Mantenimientos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Documentoframe extends javax.swing.JFrame {
    int xmouse,ymouse;

    
    public Documentoframe() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Mainpanel = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        Encabezado = new javax.swing.JLabel();
        Codigolabel = new javax.swing.JLabel();
        DescripLabel = new javax.swing.JLabel();
        codigousuariotxt = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Estadolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mainpanel.setBackground(new java.awt.Color(24, 113, 203));
        Mainpanel.setToolTipText("");

        Cabecera.setBackground(new java.awt.Color(255, 255, 255));
        Cabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CabeceraMouseDragged(evt);
            }
        });
        Cabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CabeceraMousePressed(evt);
            }
        });

        Encabezado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Encabezado.setForeground(new java.awt.Color(24, 113, 203));
        Encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Encabezado.setText("Mantenimiento de Documentos");
        Encabezado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(Encabezado)
                .addGap(143, 143, 143))
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Encabezado)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Codigolabel.setBackground(new java.awt.Color(0, 153, 204));
        Codigolabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        Codigolabel.setForeground(new java.awt.Color(255, 255, 255));
        Codigolabel.setText("Codigo:");

        DescripLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        DescripLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescripLabel.setText("Descripcion:");

        codigousuariotxt.setBackground(new java.awt.Color(24, 113, 203));
        codigousuariotxt.setForeground(new java.awt.Color(255, 255, 255));
        codigousuariotxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        codigousuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigousuariotxtActionPerformed(evt);
            }
        });

        descripcion.setBackground(new java.awt.Color(24, 113, 203));
        descripcion.setForeground(new java.awt.Color(0, 0, 0));
        descripcion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setForeground(new java.awt.Color(24, 113, 203));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setForeground(new java.awt.Color(24, 113, 203));
        salir.setText("Salir");
        salir.setToolTipText("");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setForeground(new java.awt.Color(24, 113, 203));
        limpiar.setText("Limpiar");
        limpiar.setToolTipText("");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Estadolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Estadolabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Estadolabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MainpanelLayout = new javax.swing.GroupLayout(Mainpanel);
        Mainpanel.setLayout(MainpanelLayout);
        MainpanelLayout.setHorizontalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainpanelLayout.createSequentialGroup()
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(guardar)
                        .addGap(121, 121, 121)
                        .addComponent(limpiar))
                    .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(MainpanelLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(Codigolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(codigousuariotxt))
                        .addGroup(MainpanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(DescripLabel)
                            .addGap(18, 18, 18)
                            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainpanelLayout.createSequentialGroup()
                        .addComponent(salir)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainpanelLayout.createSequentialGroup()
                        .addComponent(Estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        MainpanelLayout.setVerticalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainpanelLayout.createSequentialGroup()
                        .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Codigolabel))
                            .addGroup(MainpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(codigousuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripLabel)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir)
                    .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardar)
                        .addComponent(limpiar)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        bg.add(Mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigousuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigousuariotxtActionPerformed
       String codigo = codigousuariotxt.getText();
    String desc = descripcion.getText();

    if (!codigo.isEmpty() && !desc.isEmpty()) {
        try {
            FileWriter fw = new FileWriter("mantenimiento_de_documento.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Código: " + codigo + ", Descripción: " + desc);
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Guardar", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el código y la descripción.", "Guardar", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_codigousuariotxtActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        String codigo = codigousuariotxt.getText();
    String desc = descripcion.getText();

    if (!codigo.isEmpty() && !desc.isEmpty()) {
        try {
            FileWriter fw = new FileWriter("mantenimiento_de_documento.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Código: " + codigo + ", Descripción: " + desc);
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Guardar", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el código y la descripción.", "Guardar", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_descripcionActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
           String codigo = codigousuariotxt.getText();
    String desc = descripcion.getText();

    if (!codigo.isEmpty() && !desc.isEmpty()) {
        try {
            FileWriter fw = new FileWriter("mantenimiento_de_documento.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Código: " + codigo + ", Descripción: " + desc);
            bw.newLine();
            bw.close();

            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.", "Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos.", "Guardar", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el código y la descripción.", "Guardar", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_guardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        codigousuariotxt.setText("");
    descripcion.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void CabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CabeceraMousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_CabeceraMousePressed

    private void CabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CabeceraMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_CabeceraMouseDragged

    
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documentoframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JLabel Codigolabel;
    private javax.swing.JLabel DescripLabel;
    private javax.swing.JLabel Encabezado;
    private javax.swing.JLabel Estadolabel;
    private javax.swing.JPanel Mainpanel;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField codigousuariotxt;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton guardar;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
