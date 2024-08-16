package GUI;

import javax.swing.JOptionPane;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Supplier;


public class Supplier_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private Supplier supplier;


    public Supplier_GUI(DataBase dataBase, Supplier supplier) {
        this.dataBase = dataBase;
        this.supplier = supplier;
        initComponents();
        //jLabel1.setText("Welcome, supplier " + supplier.getName());
    }




    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel0 = new javax.swing.JLabel();
        signUpButton3 = new javax.swing.JButton();
        productsButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        notificationsButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();
        communicationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel0.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel0.setText("Supplier Page");

        signUpButton3.setBackground(new java.awt.Color(255, 102, 102));
        signUpButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        signUpButton3.setForeground(new java.awt.Color(0, 0, 0));
        signUpButton3.setText("Logout");
        signUpButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButton3ActionPerformed(evt);
            }
        });

        productsButton.setBackground(new java.awt.Color(0, 0, 0));
        productsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        productsButton.setForeground(new java.awt.Color(255, 255, 255));
        productsButton.setText("Products");
        productsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsButtonActionPerformed(evt);
            }
        });

        manageButton.setBackground(new java.awt.Color(0, 0, 0));
        manageButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        manageButton.setForeground(new java.awt.Color(255, 255, 255));
        manageButton.setText("Manage Account");
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });

        notificationsButton.setBackground(new java.awt.Color(0, 0, 0));
        notificationsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        notificationsButton.setForeground(new java.awt.Color(255, 255, 255));
        notificationsButton.setText("Notifications");
        notificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationsButtonActionPerformed(evt);
            }
        });

        ordersButton.setBackground(new java.awt.Color(0, 0, 0));
        ordersButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        ordersButton.setForeground(new java.awt.Color(255, 255, 255));
        ordersButton.setText("Orders");
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        communicationButton.setBackground(new java.awt.Color(0, 0, 0));
        communicationButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        communicationButton.setForeground(new java.awt.Color(255, 255, 255));
        communicationButton.setText("Communication");
        communicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communicationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(communicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(manageButton)
                                                .addGap(184, 184, 184))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(signUpButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(manageButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(communicationButton)
                                        .addComponent(productsButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(notificationsButton)
                                        .addComponent(ordersButton))
                                .addGap(48, 48, 48)
                                .addComponent(signUpButton3)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>






    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Manage_Supplier_Acc_GUI manageSupplierAccountFrame = new Manage_Supplier_Acc_GUI(dataBase, supplier);
        manageSupplierAccountFrame.setVisible(true);
        this.setVisible(false);
    }

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Check if the supplier has any orders
        if (supplier.getOrders().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No orders available.");
        } else {
            // Build a string to display all the orders
            StringBuilder ordersList = new StringBuilder("Orders:\n");
            for (String order : supplier.getOrders()) {
                ordersList.append(order).append("\n");
            }
            // Display the orders in a JOptionPane
            JOptionPane.showMessageDialog(this, ordersList.toString());
        }
    }


    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Products_Supplier_GUI productsSupplierFrame = new Products_Supplier_GUI(dataBase, supplier);
        productsSupplierFrame.setVisible(true);
        this.dispose();
    }

    private void signUpButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Update supplier information in the database before logging out
        dataBase.updateSupplier(supplier);
        // Redirect to the LoginFrame
        Login_GUI loginFrame = new Login_GUI(dataBase);
        loginFrame.setVisible(true);
        this.dispose();
    }

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Display notifications for the supplier
        if (supplier.getNotifications().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No notifications available.");
        } else {
            StringBuilder notificationsList = new StringBuilder("Notifications:\n");
            for (String notification : supplier.getNotifications()) {
                notificationsList.append(notification).append("\n");
            }
            JOptionPane.showMessageDialog(this, notificationsList.toString());
        }
    }

    private void communicationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Allow the supplier to send a message to an owner
        String ownerName = JOptionPane.showInputDialog(this, "Enter the owner's username:");
        String messageBody = JOptionPane.showInputDialog(this, "Enter your message:");

        if (ownerName == null || messageBody == null || ownerName.isEmpty() || messageBody.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide both owner's username and message.");
            return;
        }

        Owner owner = findOwnerByName(ownerName);

        if (owner == null) {
            JOptionPane.showMessageDialog(this, "Owner not found.");
        } else {
            String message = supplier.getName() + ": " + messageBody;
            owner.getNotifications().add(message);
            dataBase.updateOwner(owner); // Ensure the owner's notifications list is updated in the database
            JOptionPane.showMessageDialog(this, "Message sent successfully!");
        }
    }

    // Helper method to find an Owner by their username
    public Owner findOwnerByName(String ownerName) {
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equalsIgnoreCase(ownerName)) {
                return owner;
            }
        }
        return null; // Owner not found
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
            java.util.logging.Logger.getLogger(Supplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBase dataBase = new DataBase(); // Replace with actual database instance
                Supplier supplier = new Supplier("SupplierName", "password", "email", "city"); // Replace with actual supplier instance
                new Supplier_GUI(dataBase, supplier).setVisible(true);
            }
        });
    }




    private javax.swing.JButton communicationButton;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JButton manageButton;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JButton ordersButton;
    private javax.swing.JButton productsButton;
    private javax.swing.JButton signUpButton3;
}
