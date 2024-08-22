package GUI;

import javax.swing.JOptionPane;

import Package_Sweet.DataBase;
import Package_Sweet.Email_Notification;
import Package_Sweet.SignUp;


public class SignUp_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private SignUp signUp;
    private Email_Notification emailNotification;

   public String email;




    public SignUp_GUI(DataBase dataBase) {

        this.dataBase = dataBase;
        this.signUp = new SignUp(dataBase);

        emailNotification = new Email_Notification();
        setEmailNotification(emailNotification);

        initComponents();
    }



    public void setEmailNotification(Email_Notification emailNotification) {
        this.emailNotification = emailNotification;
    }



    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        signUpButton = new javax.swing.JButton();
        supplierToggle = new javax.swing.JToggleButton();
        ownerToggle = new javax.swing.JToggleButton();
        userToggle = new javax.swing.JToggleButton();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        signUpButton.setBackground(new java.awt.Color(102, 255, 255));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 0, 0));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        supplierToggle.setBackground(new java.awt.Color(0, 0, 0));
        supplierToggle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        supplierToggle.setForeground(new java.awt.Color(255, 255, 255));
        supplierToggle.setText("Spplier");


        ownerToggle.setBackground(new java.awt.Color(0, 0, 0));
        ownerToggle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ownerToggle.setForeground(new java.awt.Color(255, 255, 255));
        ownerToggle.setText("Store Owner");


        userToggle.setBackground(new java.awt.Color(0, 0, 0));
        userToggle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        userToggle.setForeground(new java.awt.Color(255, 255, 255));
        userToggle.setText("User");


        // Add toggle buttons to the ButtonGroup
        buttonGroup1.add(userToggle);
        buttonGroup1.add(ownerToggle);
        buttonGroup1.add(supplierToggle);

        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 35)); // NOI18N
        jLabel1.setText("Sweet System Sign Up");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("UserName");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Password");

        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(112, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(userToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ownerToggle)
                                                .addGap(18, 18, 18)
                                                .addComponent(supplierToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(signUpButton)
                                                .addGap(230, 230, 230))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(cityField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                                .addComponent(usernameField)
                                                                .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(205, 205, 205))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(supplierToggle)
                                        .addComponent(ownerToggle)
                                        .addComponent(userToggle))
                                .addGap(33, 33, 33)
                                .addComponent(signUpButton)
                                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>




    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        email = emailField.getText();
        String city = cityField.getText();
        String role = getSelectedRole();

        if (role == null) {
            JOptionPane.showMessageDialog(this, "Please select a role.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = false;

        if (role.equals("User")) {
            success = signUp.signUpUser(username, password, email, city);
        } else if (role.equals("Store Owner")) {
            success = signUp.signUpOwner(username, password, email, city);
        } else if (role.equals("Supplier")) {
            success = signUp.signUpSupplier(username, password, email, city);
        }

        if (success) {

          //  if (emailNotification != null) {
                emailNotification.sendEmail(email, "Welcome to Sweet System", "Thank you for Signing UP!    (. ❛ ᴗ ❛.) ");
          //  }

            JOptionPane.showMessageDialog(this, "Success: " + signUp.getMessage(), "Success", JOptionPane.INFORMATION_MESSAGE);

            Login_GUI loginFrame = new Login_GUI(dataBase);
            loginFrame.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error: " + signUp.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    

    private String getSelectedRole() {
        if (userToggle.isSelected()) {
            return "User";
        } else if (ownerToggle.isSelected()) {
            return "Store Owner";
        } else if (supplierToggle.isSelected()) {
            return "Supplier";
        }
        return null;
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
            java.util.logging.Logger.getLogger(SignUp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_GUI(new DataBase()).setVisible(true);
            }
        });
    }



    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JTextField cityField;
    public javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToggleButton ownerToggle;
    public javax.swing.JPasswordField passwordField;
    public javax.swing.JButton signUpButton;
    private javax.swing.JToggleButton supplierToggle;
    private javax.swing.JToggleButton userToggle;
    public javax.swing.JTextField usernameField;
}
