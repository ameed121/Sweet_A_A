package GUI;

import java.util.List;

import javax.swing.JOptionPane;

import Package_Sweet.DataBase;
import Package_Sweet.Dessert;
import Package_Sweet.Owner;
import Package_Sweet.Product;
import Package_Sweet.Supplier;
import Package_Sweet.User;

/**
 * UserFrame class for managing user interactions.
 */
public class User_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private User user;

    public User_GUI(DataBase dataBase, User user) {
        this.dataBase = dataBase;
        this.user = user;
        initComponents();
      //  jLabel1.setText("Welcome, " + user.getName());
    }




    @SuppressWarnings("unchecked")





    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel0 = new javax.swing.JLabel();
        signUpButton3 = new javax.swing.JButton();
        productsButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        notificationsButton = new javax.swing.JButton();
        recipesButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();
        communicationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel0.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel0.setText("User Name Page");

        signUpButton3.setBackground(new java.awt.Color(255, 102, 102));
        signUpButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        signUpButton3.setForeground(new java.awt.Color(0, 0, 0));
        signUpButton3.setText("← Back");
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

        recipesButton.setBackground(new java.awt.Color(0, 0, 0));
        recipesButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        recipesButton.setForeground(new java.awt.Color(255, 255, 255));
        recipesButton.setText("Recipes");
        recipesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipesButtonActionPerformed(evt);
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
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(signUpButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(notificationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manageButton)
                                        .addComponent(communicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(productsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(recipesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(manageButton)
                                        .addComponent(productsButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(communicationButton)
                                        .addComponent(recipesButton))
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
        User_Manage_Acc_GUI manageUserAccountFrame = new User_Manage_Acc_GUI(dataBase, user);
        manageUserAccountFrame.setVisible(true);
        this.setVisible(false);
    }

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String ownerOrSupplierName = JOptionPane.showInputDialog(this, "Enter the name of the owner or supplier:");
        if (ownerOrSupplierName == null || ownerOrSupplierName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name.");
            return;
        }

        String productName = JOptionPane.showInputDialog(this, "Enter the product name:");
        if (productName == null || productName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the product name.");
            return;
        }

        boolean orderPlaced = false;

        // Search for the product in owners' lists
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equals(ownerOrSupplierName)) {
                for (Product product : owner.getList()) {
                    if (product.getName().equalsIgnoreCase(productName)) {
                        // Increment the sold count
                        product.setSold(product.getSold() + 1);

                        // Add the order to the user's orders list
                        dataBase.logedUser.orders.add(product);

                        // Add the order to the owner's orders list
                        owner.getOrders().add(dataBase.logedUser.getName() + ", " + product.getName());

                        // Update the database
                        dataBase.updateOwner(owner);

                        orderPlaced = true;
                        break;
                    }
                }
            }
            if (orderPlaced) break;
        }

        // If not found in owners, search for the product in suppliers' lists
        if (!orderPlaced) {
            for (Supplier supplier : dataBase.signedSuppliers) {
                if (supplier.getName().equals(ownerOrSupplierName)) {
                    for (Product product : supplier.getList()) {
                        if (product.getName().equalsIgnoreCase(productName)) {
                            // Increment the sold count
                            product.setSold(product.getSold() + 1);

                            // Add the order to the user's orders list
                            dataBase.logedUser.orders.add(product);

                            // Add the order to the supplier's orders list
                            supplier.getOrders().add(dataBase.logedUser.getName() + ", " + product.getName());

                            // Update the database
                            dataBase.updateSupplier(supplier);

                            orderPlaced = true;
                            break;
                        }
                    }
                }
                if (orderPlaced) break;
            }
        }

        if (orderPlaced) {
            JOptionPane.showMessageDialog(this, "Order placed successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Owner/Supplier or product not found.");
        }
    }


    private void productsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Create an instance of ProductsUserFrame and pass the necessary parameters
        Products_User_GUI productsUserFrame = new Products_User_GUI(dataBase, user);
        productsUserFrame.setVisible(true);
        this.setVisible(false);  // Hide the current frame
    }


    private void signUpButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        dataBase.updateUser(user);  // Update user information in the database before logging out
        Login_GUI loginFrame = new Login_GUI(dataBase);
        loginFrame.setVisible(true);
        this.dispose();
    }

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> notifications = user.getNotifications();

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

    public void communicationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String recipientUsername = JOptionPane.showInputDialog(this, "Enter the username of the owner or supplier:");
        if (recipientUsername == null || recipientUsername.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username.");
            return;
        }

        String message = JOptionPane.showInputDialog(this, "Enter your message:");
        if (message == null || message.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a message.");
            return;
        }

        boolean messageSent = false;

        // Search for the recipient in owners
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equals(recipientUsername)) {
                // Add the message to the owner's notifications list
                owner.getNotifications().add(dataBase.logedUser.getName() + ": " + message);

                // Update the owner in the database
                dataBase.updateOwner(owner);

                messageSent = true;
                break;
            }
        }

        // If not found in owners, search for the recipient in suppliers
        if (!messageSent) {
            for (Supplier supplier : dataBase.signedSuppliers) {
                if (supplier.getName().equals(recipientUsername)) {
                    // Add the message to the supplier's notifications list
                    supplier.getNotifications().add(dataBase.logedUser.getName() + ": " + message);

                    // Update the supplier in the database
                    dataBase.updateSupplier(supplier);

                    messageSent = true;
                    break;
                }
            }
        }

        if (messageSent) {
            JOptionPane.showMessageDialog(this, "Message sent successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Owner or supplier not found.");
        }
    }


    private void recipesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Prompt user for dessert name
        String dessertName = JOptionPane.showInputDialog(this, "Enter the dessert name:");
        if (dessertName == null || dessertName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid dessert name.");
            return;
        }

        // Prompt user for allergic information (Yes or No)
        String allergicInput = JOptionPane.showInputDialog(this, "Is the dessert allergic? (Yes or No):");
        if (allergicInput == null || allergicInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please specify if the dessert is allergic.");
            return;
        }

        boolean isAllergic = allergicInput.equalsIgnoreCase("yes");

        // Prompt user for the recipe
        String recipe = JOptionPane.showInputDialog(this, "Enter the recipe:");
        if (recipe == null || recipe.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the recipe.");
            return;
        }

        // Create a new Dessert object
        Dessert newDessert = new Dessert(dessertName, isAllergic, recipe);

        // Add the dessert to the logged-in user's recipe list
        dataBase.logedUser.getRecipe().add(newDessert);

        // Update the user in the database
        dataBase.updateUser(dataBase.logedUser);

        // Confirm addition to the user
        JOptionPane.showMessageDialog(this, "Dessert added successfully!");
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
            java.util.logging.Logger.getLogger(User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_GUI(new DataBase(), new User("username", "password", "email", "city")).setVisible(true);
            }
        });
    }



    private javax.swing.JButton communicationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JButton manageButton;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JButton ordersButton;
    private javax.swing.JButton productsButton;
    private javax.swing.JButton recipesButton;
    private javax.swing.JButton signUpButton3;


//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JSeparator jSeparator1;
//    private javax.swing.JButton communicationButton;
//    private javax.swing.JButton manageButton;
//    private javax.swing.JButton notificationsButton;
//    private javax.swing.JButton ordersButton;
//    private javax.swing.JButton productsButton;
//    private javax.swing.JButton recipesButton;
//    private javax.swing.JButton signUpButton3;


}
