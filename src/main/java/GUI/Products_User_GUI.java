package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Dessert;
import Package_Sweet.Owner;
import Package_Sweet.Product;

import Package_Sweet.Supplier;
import Package_Sweet.User;

import javax.swing.*;


public class Products_User_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private User user;


    public Products_User_GUI(DataBase dataBase, User user) {
        this.dataBase = dataBase;
        this.user = user;
        initComponents();
    }




    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        recipesButton = new javax.swing.JButton();
        postsButton = new javax.swing.JButton();
        addFeedbackProductButton = new javax.swing.JButton();
        addFeedbackRecipeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        allergicRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText(" Products & Recipes Page");

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        recipesButton.setBackground(new java.awt.Color(0, 0, 0));
        recipesButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        recipesButton.setForeground(new java.awt.Color(255, 255, 255));
        recipesButton.setText("Show Recipes");
        recipesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipesButtonActionPerformed(evt);
            }
        });

        postsButton.setBackground(new java.awt.Color(0, 0, 0));
        postsButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        postsButton.setForeground(new java.awt.Color(255, 255, 255));
        postsButton.setText("Show Posts");
        postsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postsButtonActionPerformed(evt);
            }
        });

        addFeedbackProductButton.setBackground(new java.awt.Color(0, 0, 0));
        addFeedbackProductButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addFeedbackProductButton.setForeground(new java.awt.Color(255, 255, 255));
        addFeedbackProductButton.setText("Add product Feedback");
        addFeedbackProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeedbackProductButtonActionPerformed(evt);
            }
        });

        addFeedbackRecipeButton.setBackground(new java.awt.Color(0, 0, 0));
        addFeedbackRecipeButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addFeedbackRecipeButton.setForeground(new java.awt.Color(255, 255, 255));
        addFeedbackRecipeButton.setText("Add Recipes Feedback");
        addFeedbackRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeedbackRecipeButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        allergicRadioButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        allergicRadioButton.setSelected(true);
        allergicRadioButton.setText("Allergic ?");
        allergicRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergicRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(backButton)
                                                        .addComponent(postsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(recipesButton)
                                                        .addComponent(allergicRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(addFeedbackRecipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(addFeedbackProductButton))
                                                        .addComponent(jScrollPane1))))
                                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(postsButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(recipesButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(allergicRadioButton)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addFeedbackProductButton)
                                        .addComponent(addFeedbackRecipeButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>





    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dataBase.updateUser(user);
        new User_GUI(dataBase, user).setVisible(true);
        this.dispose();
    }

    public void postsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder postsInfo = new StringBuilder();

        boolean hasPosts = false;

        // Iterate through signed owners and display their products as posts
        for (Owner owner : dataBase.signedStoreOwners) {
            for (Product product : owner.getList()) {
                hasPosts = true;
                postsInfo.append("Owner: ").append(owner.getName())
                        .append(", Product Name: ").append(product.getName())
                        .append(", Price: ").append(product.getPrice())
                        .append(", Allergic: ").append(product.isAllergic() ? "Yes" : "No")
                        .append(", Feedbacks: ").append(String.join(", ", product.getFeedBacks()))
                        .append("\n");
            }
        }

        if (!hasPosts) {
            postsInfo.append("No posts available.");
        }

        // Display the posts in the text area
        jTextArea1.setText(postsInfo.toString());
    }

    public void recipesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder recipesInfo = new StringBuilder();

        boolean hasRecipes = false;
        boolean filterAllergic = allergicRadioButton.isSelected(); // Check if the allergic radio button is selected

        // Iterate through signed users and display their recipes
        for (User user : dataBase.signedUsers) {
            for (Dessert dessert : user.getRecipe()) {
                if (!filterAllergic || !dessert.isAllergic()) { // Filter based on allergic status
                    hasRecipes = true;
                    recipesInfo.append("User: ").append(user.getName())
                            .append(", Recipe Name: ").append(dessert.getName())
                            .append(", Recipe: ").append(dessert.getRecipe())
                            .append(", Allergic: ").append(dessert.isAllergic() ? "Yes" : "No")
                            .append(", Feedbacks: ").append(String.join(", ", dessert.getFeedBacks()))
                            .append("\n");
                }
            }
        }

        // Iterate through signed owners and display their recipes
        for (Owner owner : dataBase.signedStoreOwners) {
            for (Dessert dessert : owner.getRecipe()) {
                if (!filterAllergic || !dessert.isAllergic()) { // Filter based on allergic status
                    hasRecipes = true;
                    recipesInfo.append("Owner: ").append(owner.getName())
                            .append(", Recipe Name: ").append(dessert.getName())
                            .append(", Recipe: ").append(dessert.getRecipe())
                            .append(", Allergic: ").append(dessert.isAllergic() ? "Yes" : "No")
                            .append(", Feedbacks: ").append(String.join(", ", dessert.getFeedBacks()))
                            .append("\n");
                }
            }
        }

        if (!hasRecipes) {
            recipesInfo.append("No desserts available.");
        }

        // Display the recipes in the text area
        jTextArea1.setText(recipesInfo.toString());
    }


    public void allergicRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Optional: Refresh the displayed products or recipes when the allergic filter is toggled
        postsButtonActionPerformed(evt);
        recipesButtonActionPerformed(evt);
    }

    public void addFeedbackProductButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = JOptionPane.showInputDialog(this, "Enter the username of the supplier or owner:");
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username.");
            return;
        }

        String productName = JOptionPane.showInputDialog(this, "Enter the product name:");
        if (productName == null || productName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the product name.");
            return;
        }

        String feedback = JOptionPane.showInputDialog(this, "Enter your feedback:");
        if (feedback == null || feedback.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your feedback.");
            return;
        }

        boolean feedbackAdded = false;

        // Try to add feedback to owner's products
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equals(username)) {
                for (Product product : owner.getList()) {
                    if (product.getName().equalsIgnoreCase(productName)) {
                        product.getFeedBacks().add(dataBase.logedUser.getName() + ": " + feedback);
                        feedbackAdded = true;
                        break;
                    }
                }
            }
            if (feedbackAdded) break;
        }

        // Try to add feedback to supplier's products if not found in owner
        if (!feedbackAdded) {
            for (Supplier supplier : dataBase.signedSuppliers) {
                if (supplier.getName().equals(username)) {
                    for (Product product : supplier.getList()) {
                        if (product.getName().equalsIgnoreCase(productName)) {
                            product.getFeedBacks().add(dataBase.logedUser.getName() + ": " + feedback);
                            feedbackAdded = true;
                            break;
                        }
                    }
                }
                if (feedbackAdded) break;
            }
        }

        if (feedbackAdded) {
            JOptionPane.showMessageDialog(this, "Feedback added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Supplier/Owner or product not found.");
        }
    }


    public void addFeedbackRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Prompt the user to enter the username
        String username = JOptionPane.showInputDialog(this, "Enter the username:");
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username.");
            return;
        }

        // Prompt the user to enter the recipe name
        String recipeName = JOptionPane.showInputDialog(this, "Enter the recipe name:");
        if (recipeName == null || recipeName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the recipe name.");
            return;
        }

        // Prompt the user to enter the feedback
        String feedback = JOptionPane.showInputDialog(this, "Enter your feedback:");
        if (feedback == null || feedback.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your feedback.");
            return;
        }

        // Search for the user in the signed users list
        User targetUser = null;
        for (User user : dataBase.signedUsers) {
            if (user.getName().equals(username)) {
                targetUser = user;
                break;
            }
        }

        // If user is not found
        if (targetUser == null) {
            JOptionPane.showMessageDialog(this, "User not found.");
            return;
        }

        // Search for the recipe in the user's recipe list
        Dessert targetDessert = null;
        for (Dessert dessert : targetUser.getRecipe()) {
            if (dessert.getName().equalsIgnoreCase(recipeName)) {
                targetDessert = dessert;
                break;
            }
        }

        // If recipe is not found
        if (targetDessert == null) {
            JOptionPane.showMessageDialog(this, "Recipe not found.");
            return;
        }

        // Add the feedback in the format "user that wrote the feedback, feedback"
        String formattedFeedback = user.getName() + ": " + feedback;
        targetDessert.getFeedBacks().add(formattedFeedback);

        // Confirm the update in the DataBase class
        dataBase.updateUser(targetUser); // Hypothetical method to update user data
        //dataBase.save(); // Hypothetical method to persist the database

        // Show success message
        JOptionPane.showMessageDialog(this, "Feedback added and database updated successfully!");
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
            java.util.logging.Logger.getLogger(Products_User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products_User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products_User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products_User_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products_User_GUI(new DataBase(), new User("UserName", "password", "email", "city")).setVisible(true);
            }
        });
    }




    private javax.swing.JButton addFeedbackProductButton;
    private javax.swing.JButton addFeedbackRecipeButton;
    private javax.swing.JRadioButton allergicRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton postsButton;
    private javax.swing.JButton recipesButton;
}
