package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Supplier;

import javax.swing.*;


public class Manage_Supplier_Acc_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private Supplier supplier;

    
    public Manage_Supplier_Acc_GUI(DataBase dataBase, Supplier supplier) {
        this.dataBase = dataBase;
        this.supplier = supplier;
        initComponents();
        // Populate fields with current supplier data
        loggedSupplierName.setText(supplier.getName());
        emailField.setText(supplier.getEmail());
        cityField.setText(supplier.getCity());
        passwordField.setText(supplier.getPassword());
    }


    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        cityField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loggedSupplierName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Manage Your Account Page");

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("City");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Password");

        loggedSupplierName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loggedSupplierName.setText("Supplier Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 73, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(loggedSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(loggedSupplierName)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(cityField))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(emailField))
                                                .addGap(30, 30, 30)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(submitButton)
                                .addGap(17, 17, 17)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>





    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Navigate back to the SupplierFrame
        dataBase.updateSupplier(supplier);
        new Supplier_GUI(dataBase, supplier).setVisible(true);
        this.dispose();
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Update supplier information with the new data
        supplier.setEmail(emailField.getText());
        supplier.setCity(cityField.getText());
        supplier.setPassword(new String(passwordField.getPassword()));

        // Show confirmation dialog
        JOptionPane.showMessageDialog(this, "Account details updated successfully.");

        // Optionally, go back to the SupplierFrame after saving
        new Supplier_GUI(dataBase, supplier).setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Manage_Supplier_Acc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier_Acc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier_Acc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Supplier_Acc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Supplier_Acc_GUI(new DataBase(), new Supplier("SupplierName", "password", "email", "city")).setVisible(true);
            }
        });
    }



    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loggedSupplierName;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton submitButton;

//    private javax.swing.JButton backButton;
//    private javax.swing.JTextField cityField;
//    private javax.swing.JTextField emailField;
//    private javax.swing.JButton submitButton;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel5;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JLabel loggedSupplierName;
//    private javax.swing.JPasswordField passwordField;

}
