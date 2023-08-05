
package Mantenimientos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class UsuarioFrame extends javax.swing.JFrame {
    int xmouse,ymouse;
 private static final String FILE_NAME = "userdata.txt";
 
 ButtonGroup b=new ButtonGroup(); 
  private JRadioButton dummyButton = new JRadioButton();
     private boolean isNewUser = true;
 
    public UsuarioFrame() {
    initComponents();
       b.add(b1);
       b.add(b2);
       b.add(dummyButton);
        this.setVisible(true);
       
    login.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            loginActionPerformed(evt);
        }
    });
    estado.setText("Creating");
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        DerPanel = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        LevelLabel = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        PassLabel = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        NameLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        estado = new javax.swing.JLabel();
        Encabezadolabel = new javax.swing.JLabel();
        IzqPanel = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DerPanel.setBackground(new java.awt.Color(24, 113, 203));

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(24, 113, 203));
        Salir.setText("Exit");
        Salir.setToolTipText("");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        guardar.setForeground(new java.awt.Color(24, 113, 203));
        guardar.setText("Save");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        LevelLabel.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        LevelLabel.setForeground(new java.awt.Color(255, 255, 255));
        LevelLabel.setText("Level access");

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(24, 113, 203));
        limpiar.setText("Clean");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setText("Login");

        login.setBackground(new java.awt.Color(24, 113, 203));
        login.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        PassLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setText("Passeword:");

        contraseña.setBackground(new java.awt.Color(24, 113, 203));
        contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name user");

        nombre.setBackground(new java.awt.Color(24, 113, 203));
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        Apellido.setBackground(new java.awt.Color(24, 113, 203));
        Apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        LastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        LastNameLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setText("Last name:");

        email.setBackground(new java.awt.Color(24, 113, 203));
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        EmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        EmailLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email:");

        b1.setBackground(new java.awt.Color(24, 113, 203));
        b1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Normal");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(24, 113, 203));
        b2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Administrator");
        b2.setToolTipText("");

        estado.setBackground(new java.awt.Color(24, 113, 203));
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Encabezadolabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Encabezadolabel.setForeground(new java.awt.Color(255, 255, 255));
        Encabezadolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Encabezadolabel.setText("USUARIOS");

        javax.swing.GroupLayout DerPanelLayout = new javax.swing.GroupLayout(DerPanel);
        DerPanel.setLayout(DerPanelLayout);
        DerPanelLayout.setHorizontalGroup(
            DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(Encabezadolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(DerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerPanelLayout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiar)
                        .addGap(77, 77, 77)
                        .addComponent(Salir)
                        .addGap(21, 21, 21))
                    .addGroup(DerPanelLayout.createSequentialGroup()
                        .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(DerPanelLayout.createSequentialGroup()
                                .addComponent(NameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nombre))
                            .addGroup(DerPanelLayout.createSequentialGroup()
                                .addComponent(EmailLabel)
                                .addGap(57, 57, 57)
                                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                            .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DerPanelLayout.createSequentialGroup()
                                    .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(login))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DerPanelLayout.createSequentialGroup()
                                    .addComponent(PassLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(contraseña))
                                .addGroup(DerPanelLayout.createSequentialGroup()
                                    .addComponent(LevelLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b2)))
                            .addGroup(DerPanelLayout.createSequentialGroup()
                                .addComponent(LastNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(Apellido)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        DerPanelLayout.setVerticalGroup(
            DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Encabezadolabel)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(26, 26, 26)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(DerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        bg.add(DerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 0, 440, 460));

        IzqPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout IzqPanelLayout = new javax.swing.GroupLayout(IzqPanel);
        IzqPanel.setLayout(IzqPanelLayout);
        IzqPanelLayout.setHorizontalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        IzqPanelLayout.setVerticalGroup(
            IzqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        bg.add(IzqPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 460));

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

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        bg.add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
         String lastname = Apellido.getText();
         
    if (!lastname.isEmpty()) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            String lasname = null;
            writer.write(lasname + System.lineSeparator());
            writer.close();
            JOptionPane.showMessageDialog(this, "Name saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Name field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
    }
         
         
    }//GEN-LAST:event_ApellidoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
       
     String name = nombre.getText();

    if (!name.isEmpty()) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(name + System.lineSeparator());
            writer.close();
            JOptionPane.showMessageDialog(this, "Name saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Name field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_nombreActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
           String name = nombre.getText();
    String lastName = Apellido.getText();
    String email = this.email.getText();
    String password = new String(contraseña.getPassword());

    if (!name.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(name + "," + lastName + "," + email + "," + password + System.lineSeparator());
            writer.close();
            JOptionPane.showMessageDialog(this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_guardarActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
       String userPassword = new String(contraseña.getPassword());

    // Verificar si la contraseña no está vacía
    if (!userPassword.isEmpty()) {
        try {
            // Abrir el archivo para escritura y agregar la contraseña al final del archivo
            FileWriter writer = new FileWriter(FILE_NAME, true);
            writer.write(userPassword + System.lineSeparator());
            writer.close();
            JOptionPane.showMessageDialog(this, "Password saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Password field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
    }     
    }//GEN-LAST:event_contraseñaActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        String Email = email.getText();
         
    if (!Email.isEmpty()) {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            String lasname = null;
            writer.write(lasname + System.lineSeparator());
            writer.close();
            JOptionPane.showMessageDialog(this, "Name saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Name field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_emailActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
String loginText = login.getText();
    String password = new String(contraseña.getPassword());

    if (!loginText.isEmpty() && !password.isEmpty()) {
        try {
            // Verificar si el usuario ya existe en el archivo
            if (isUserExists(loginText)) {
                isNewUser = false; // No es un nuevo usuario
                estado.setText("Modifying");
            } else {
                isNewUser = true; // Es un nuevo usuario
                estado.setText("Creating");
            }

            // Solo guardar el login y contraseña en el archivo si es un nuevo usuario
            if (isNewUser) {
                FileWriter writer = new FileWriter(FILE_NAME, true);
                writer.write("Login: " + loginText + ", Password: " + password + System.lineSeparator());
                writer.close();
            }

            JOptionPane.showMessageDialog(this, "Login data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving login data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Login and Password fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private boolean isUserExists(String login) throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return false; // Si el archivo no existe, el usuario tampoco existe
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("Login: " + login)) {
                reader.close();
                return true; // El usuario existe en el archivo
            }
        }
        reader.close();
        return false; 
    }//GEN-LAST:event_loginActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    login.setText("");
    contraseña.setText("");
    nombre.setText("");
    Apellido.setText("");
    email.setText("");
    email.setEditable(false);
    b1.setSelected(false);
    b2.setSelected(false);
    b.clearSelection();
     isNewUser = true; // Set isNewUser to true when clean action is performed
    estado.setText("Creating");
    }//GEN-LAST:event_limpiarActionPerformed

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
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel DerPanel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel Encabezadolabel;
    private javax.swing.JPanel IzqPanel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JButton Salir;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JPanel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField email;
    private javax.swing.JLabel estado;
    private javax.swing.JButton guardar;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
