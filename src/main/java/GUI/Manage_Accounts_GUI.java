package GUI;

import javax.swing.JOptionPane;
import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Supplier;
import Package_Sweet.User;


public class Manage_Accounts_GUI extends javax.swing.JFrame {

    private DataBase dataBase;



    public Manage_Accounts_GUI(DataBase dataBase) {
        this.dataBase = dataBase;
        initComponents();
    }

    @SuppressWarnings("unchecked")



    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        okButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        cityField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        okButton.setBackground(new java.awt.Color(0, 0, 0));
        okButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Add , Update , Delete");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
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

        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Password");

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("UserName");



        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Add", "Edit", "Delete" }));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Store Owner", "Supplier" }));


        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("Manage Accounts Page");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("to Add: fill all fields");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("to Delete: just enter a UserName");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("to Update: Enter a UserName & then fill the fields to edit");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Note:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(usernameField)
                                                                .addComponent(cityField)
                                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                        .addComponent(okButton))))
                                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(okButton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(backButton)
                                        .addComponent(jLabel8))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>







    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String action = (String) jComboBox1.getSelectedItem();
        String role = (String) jComboBox2.getSelectedItem();

        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String email = emailField.getText();
        String city = cityField.getText();

        if (action.equals("Add")) {
            addAccount(role, username, password, email, city);
        } else if (action.equals("Edit")) {
            editAccount(role, username, password, email, city);
        } else if (action.equals("Delete")) {
            deleteAccount(role, username);
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin_GUI adminFrame = new Admin_GUI(dataBase);
        adminFrame.setVisible(true);
        this.dispose();
    }

    private void addAccount(String role, String username, String password, String email, String city) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled for adding a new account.");
            return;
        }

        if (role.equals("User")) {
            dataBase.signedUsers.add(new User(username, password, email, city));
            JOptionPane.showMessageDialog(this, "User account added successfully.");
        } else if (role.equals("Store Owner")) {
            dataBase.signedStoreOwners.add(new Owner(username, password, email, city));
            JOptionPane.showMessageDialog(this, "Store owner account added successfully.");
        } else if (role.equals("Supplier")) {
            dataBase.signedSuppliers.add(new Supplier(username, password, email, city));
            JOptionPane.showMessageDialog(this, "Supplier account added successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid role.");
        }
    }

    private void editAccount(String role, String username, String password, String email, String city) {
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username must be filled to edit an account.");
            return;
        }

        boolean found = false;
        if (role.equals("User")) {
            for (User user : dataBase.signedUsers) {
                if (user.getName().equals(username)) {
                    if (!password.isEmpty()) user.setPassword(password);
                    if (!email.isEmpty()) user.setEmail(email);
                    if (!city.isEmpty()) user.setCity(city);
                    JOptionPane.showMessageDialog(this, "User account updated successfully.");
                    found = true;
                    break;
                }
            }
        } else if (role.equals("Store Owner")) {
            for (Owner owner : dataBase.signedStoreOwners) {
                if (owner.getName().equals(username)) {
                    if (!password.isEmpty()) owner.setPassword(password);
                    if (!email.isEmpty()) owner.setEmail(email);
                    if (!city.isEmpty()) owner.setCity(city);
                    JOptionPane.showMessageDialog(this, "Store owner account updated successfully.");
                    found = true;
                    break;
                }
            }
        } else if (role.equals("Supplier")) {
            for (Supplier supplier : dataBase.signedSuppliers) {
                if (supplier.getName().equals(username)) {
                    if (!password.isEmpty()) supplier.setPassword(password);
                    if (!email.isEmpty()) supplier.setEmail(email);
                    if (!city.isEmpty()) supplier.setCity(city);
                    JOptionPane.showMessageDialog(this, "Supplier account updated successfully.");
                    found = true;
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid role.");
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Account not found.");
        }
    }

    private void deleteAccount(String role, String username) {
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username must be filled to delete an account.");
            return;
        }

        boolean found = false;
        if (role.equals("User")) {
            for (int i = 0; i < dataBase.signedUsers.size(); i++) {
                if (dataBase.signedUsers.get(i).getName().equals(username)) {
                    dataBase.signedUsers.remove(i);
                    JOptionPane.showMessageDialog(this, "User account deleted successfully.");
                    found = true;
                    break;
                }
            }
        } else if (role.equals("Store Owner")) {
            for (int i = 0; i < dataBase.signedStoreOwners.size(); i++) {
                if (dataBase.signedStoreOwners.get(i).getName().equals(username)) {
                    dataBase.signedStoreOwners.remove(i);
                    JOptionPane.showMessageDialog(this, "Store owner account deleted successfully.");
                    found = true;
                    break;
                }
            }
        } else if (role.equals("Supplier")) {
            for (int i = 0; i < dataBase.signedSuppliers.size(); i++) {
                if (dataBase.signedSuppliers.get(i).getName().equals(username)) {
                    dataBase.signedSuppliers.remove(i);
                    JOptionPane.showMessageDialog(this, "Supplier account deleted successfully.");
                    found = true;
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid role.");
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Account not found.");
        }
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
            java.util.logging.Logger.getLogger(Manage_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Accounts_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Accounts_GUI(new DataBase()).setVisible(true);
            }
        });
    }



    public javax.swing.JButton backButton;
    public javax.swing.JTextField cityField;
    public javax.swing.JTextField emailField;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton okButton;
    public javax.swing.JPasswordField passwordField;
    public javax.swing.JTextField usernameField;


}
