
package MenuPrincipal;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LoginJframe extends javax.swing.JFrame {
    int xmouse,ymouse;

  private static final String FILE_NAME = "userdata.txt"; 
  
    public LoginJframe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpanel = new javax.swing.JPanel();
        Derpanel = new javax.swing.JPanel();
        iniciar = new javax.swing.JButton();
        Pass = new javax.swing.JLabel();
        nombreusario = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        Iniciar_sesion = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JButton();
        Izqpanel = new javax.swing.JPanel();
        neme_emp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        bgpanel.setBackground(new java.awt.Color(255, 255, 255));
        bgpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Derpanel.setBackground(new java.awt.Color(24, 113, 203));
        Derpanel.setForeground(new java.awt.Color(255, 255, 255));

        iniciar.setBackground(new java.awt.Color(255, 255, 255));
        iniciar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        iniciar.setForeground(new java.awt.Color(24, 113, 203));
        iniciar.setText("Login");
        iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        Pass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setText("Password");

        nombreusario.setBackground(new java.awt.Color(24, 113, 203));
        nombreusario.setText("Ingrese el nombre de usuario ");
        nombreusario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        nombreusario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreusarioActionPerformed(evt);
            }
        });

        UserName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User name");

        Iniciar_sesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar_sesion.setText("INICIAR SESION");

        Password.setBackground(new java.awt.Color(24, 113, 203));
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Ingrese   ");
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(24, 113, 203));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerpanelLayout = new javax.swing.GroupLayout(Derpanel);
        Derpanel.setLayout(DerpanelLayout);
        DerpanelLayout.setHorizontalGroup(
            DerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(DerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DerpanelLayout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreusario)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(DerpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DerpanelLayout.setVerticalGroup(
            DerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerpanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Iniciar_sesion)
                .addGap(30, 30, 30)
                .addComponent(UserName)
                .addGap(18, 18, 18)
                .addComponent(nombreusario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar)
                    .addComponent(ExitButton))
                .addGap(118, 118, 118))
        );

        bgpanel.add(Derpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 410, 450));

        Izqpanel.setBackground(new java.awt.Color(255, 255, 255));

        neme_emp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        neme_emp.setForeground(new java.awt.Color(0, 0, 0));
        neme_emp.setText("SISTEMA DE CONTABILIDAD");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout IzqpanelLayout = new javax.swing.GroupLayout(Izqpanel);
        Izqpanel.setLayout(IzqpanelLayout);
        IzqpanelLayout.setHorizontalGroup(
            IzqpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzqpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(neme_emp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(IzqpanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        IzqpanelLayout.setVerticalGroup(
            IzqpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IzqpanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(neme_emp)
                .addGap(112, 112, 112))
        );

        bgpanel.add(Izqpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        String password = new String(Password.getPassword());

        if (!password.isEmpty()) {
            try {
                String PASSWORD_FILE_NAME = null;
                FileWriter writer = new FileWriter(PASSWORD_FILE_NAME, true);
                writer.write(password + System.lineSeparator());
                writer.close();
                JOptionPane.showMessageDialog(this, "Password saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Password field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PasswordActionPerformed

    private void nombreusarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreusarioActionPerformed
        String username = nombreusario.getText();

        if (!username.isEmpty()) {
            // Agregar la siguiente línea para imprimir la ruta del directorio de trabajo
            System.out.println(System.getProperty("user.dir"));

            try {
                FileWriter writer = new FileWriter(FILE_NAME, true);
                writer.write(username + System.lineSeparator());
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving username!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_nombreusarioActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
         String username = nombreusario.getText();
    String password = new String(Password.getPassword());

    // Verificar si el nombre de usuario y la contraseña son válidos
    if (isValidCredentials(username, password)) {
        // Aquí puedes realizar cualquier lógica adicional que desees ejecutar cuando el inicio de sesión sea exitoso
        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Invalid username or password! create account", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    

// Método para verificar las credenciales válidas
 private boolean isValidCredentials(String username, String password) {
    try {
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");

            if (data.length == 4) {
                String storedUsername = data[0];
                String storedPassword = data[3]; // Aquí usamos el último campo como contraseña

                if (storedUsername.equals(username) && storedPassword.equals(password)) {
                    bufferedReader.close();
                    return true; // Credenciales válidas
                }
            }
        }

        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }



        return false; // Credenciales inválidas
    
    }//GEN-LAST:event_iniciarActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new LoginJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Derpanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Iniciar_sesion;
    private javax.swing.JPanel Izqpanel;
    private javax.swing.JLabel Pass;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel UserName;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JButton iniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel neme_emp;
    private javax.swing.JTextField nombreusario;
    // End of variables declaration//GEN-END:variables
}
