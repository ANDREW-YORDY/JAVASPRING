package com.adr.springgui;

import com.adr.persistence.DBAdminConn;
import com.adr.springsecurity.services.AuthService;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {

    private AuthService authService;

    // Constructor alternativo para inicializar y personalizar componentes
    public LoginGUI(AuthService authService) {
        initComponents(); // Llama al método generado por NetBeans para inicializar componentes
        this.authService = authService; // Asigna el servicio de autenticación
        //customizeComponents(); // Llama a un método para personalizar componentes
    }

//    // Método para personalizar componentes después de la inicialización
//    private void customizeComponents() {
//        //jTextField_USERNAME = new RoundJTextField(15); // Inicializa jTextField_USERNAME como RoundJTextField
//        //jPasswordField_PASSWORD = new JPasswordField(); // Inicializa jTextField_PASSWORD como JPasswordField
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel_CONTENT = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_CONT_LOGCOMPONENT = new javax.swing.JPanel();
        jButton_LOGIN = new javax.swing.JButton();
        jTextField_USERNAME = new javax.swing.JTextField();
        jLabel_USERNAME = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField_PASSWORD = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CONTENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel_CONTENT.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 525;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 1, 0, 1);
        jPanel_CONTENT.add(jLabel1, gridBagConstraints);

        jPanel_CONT_LOGCOMPONENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton_LOGIN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_LOGIN.setText("INGRESAR");
        jButton_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LOGINActionPerformed(evt);
            }
        });

        jTextField_USERNAME.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField_USERNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel_USERNAME.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_USERNAME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_USERNAME.setText("INGRESE SU USUARIO");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESE SU CONTRASEÑA");

        jPasswordField_PASSWORD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField_PASSWORD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_PASSWORD.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel_CONT_LOGCOMPONENTLayout = new javax.swing.GroupLayout(jPanel_CONT_LOGCOMPONENT);
        jPanel_CONT_LOGCOMPONENT.setLayout(jPanel_CONT_LOGCOMPONENTLayout);
        jPanel_CONT_LOGCOMPONENTLayout.setHorizontalGroup(
            jPanel_CONT_LOGCOMPONENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField_USERNAME)
            .addComponent(jLabel_USERNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
            .addComponent(jPasswordField_PASSWORD)
        );
        jPanel_CONT_LOGCOMPONENTLayout.setVerticalGroup(
            jPanel_CONT_LOGCOMPONENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONT_LOGCOMPONENTLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 121;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 107, 82, 0);
        jPanel_CONTENT.add(jPanel_CONT_LOGCOMPONENT, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LOGINActionPerformed
      String username = jTextField_USERNAME.getText();
        char[] password = jPasswordField_PASSWORD.getPassword();

        if (authService == null) {
            JOptionPane.showMessageDialog(this, "El servicio de autenticación no está disponible.");
            return;
        }

        if (!authService.validateUsername(username)) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un nombre de usuario válido.");
            return;
        }

        if (!authService.validatePassword(new String(password))) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una contraseña válida (mínimo 6 caracteres).");
            return;
        }

        try {
            boolean isAuthenticated = authService.authenticate(username, new String(password));

            if (isAuthenticated) {
                JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!");
            } else {
                JOptionPane.showMessageDialog(this, "Inicio de sesión fallido. Por favor verifique sus credenciales.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            java.util.Arrays.fill(password, '0');
        }
    }//GEN-LAST:event_jButton_LOGINActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                // Crear instancia de AuthService pasando la conexión a la base de datos
        DBAdminConn dbconn = new DBAdminConn();
        AuthService authService = new AuthService(dbconn.DBGoToConnection());
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI(authService).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_USERNAME;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JPanel jPanel_CONT_LOGCOMPONENT;
    private javax.swing.JPasswordField jPasswordField_PASSWORD;
    private javax.swing.JTextField jTextField_USERNAME;
    // End of variables declaration//GEN-END:variables
}
