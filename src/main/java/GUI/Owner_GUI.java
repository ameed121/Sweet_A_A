package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;

import javax.swing.JOptionPane;

import java.util.List;


public class Owner_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private Owner owner;


    public Owner_GUI(DataBase dataBase, Owner owner) {
        this.dataBase = dataBase;
        this.owner = owner;
        initComponents();
     //   jLabel0.setText("Welcome, Store Owner " + owner.getName());
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
        jLabel0.setText("Store Owner Page");

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
        Manage_My_Account_GUI manageMyAccountFrame = new Manage_My_Account_GUI(dataBase, owner);
        manageMyAccountFrame.setVisible(true);
        this.setVisible(false);
    }

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Orders_GUI ordersFrame = new Orders_GUI(dataBase,owner);
        ordersFrame.setVisible(true);
        this.setVisible(false);
    }

    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Products_GUI productsFrame = new Products_GUI(dataBase,owner);
        productsFrame.setVisible(true);
        this.setVisible(false);

    }

    private void signUpButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear the loggedOwner reference without removing the owner from the signedStoreOwners list
        dataBase.updateOwner(owner);  // Ensure the owner is updated in the database
        dataBase.logedOwner = null;  // Clear the logged owner

        // Redirect to the LoginFrame
        Login_GUI loginFrame = new Login_GUI(dataBase);
        loginFrame.setVisible(true);
        this.dispose();
    }


    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> notifications = owner.getNotifications();

        if (notifications == null || notifications.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No notifications available.");
        } else {
            StringBuilder notificationsMessage = new StringBuilder("Notifications:\n");
            for (String notification : notifications) {
                notificationsMessage.append(notification).append("\n");
            }
            JOptionPane.showMessageDialog(this, notificationsMessage.toString());
        }
    }


    private void communicationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Communication_Owner_GUI communicationOwnerFrame = new Communication_Owner_GUI(dataBase, owner);
        communicationOwnerFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // You would typically pass the actual owner and database here
                new Owner_GUI(new DataBase(), new Owner("OwnerName", "password", "email", "city")).setVisible(true);
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
