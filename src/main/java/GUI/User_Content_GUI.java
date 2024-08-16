package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Product;
import Package_Sweet.User;
import Package_Sweet.Dessert;

import javax.swing.*;

/**
 * UserContentFrame class for viewing posts, recipes, and adding feedback.
 */
public class User_Content_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private User currentUser;



    public User_Content_GUI(DataBase dataBase, User user) {
        this.dataBase = dataBase;
        this.currentUser = user;
        initComponents();
    }





    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel0 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        postsButton = new javax.swing.JButton();
        addFeedbackButton = new javax.swing.JButton();
        recipesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel0.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel0.setText("View Content & Add Feedback");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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

        addFeedbackButton.setBackground(new java.awt.Color(0, 0, 0));
        addFeedbackButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        addFeedbackButton.setForeground(new java.awt.Color(255, 255, 255));
        addFeedbackButton.setText("Add Feedback");
        addFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeedbackButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(addFeedbackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(recipesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(postsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(postsButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(recipesButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(addFeedbackButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backButton)
                                                .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>





    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        User_GUI userFrame = new User_GUI(dataBase, currentUser);
        userFrame.setVisible(true);
        this.dispose();
    }

    private void postsButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void recipesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder recipesInfo = new StringBuilder();

        boolean hasRecipes = false;

        // Iterate through signed users and display their recipes
        for (User user : dataBase.signedUsers) {
            for (Dessert dessert : user.getRecipe()) {
                hasRecipes = true;
                recipesInfo.append("User: ").append(user.getName())
                        .append(", Recipe Name: ").append(dessert.getName())
                        .append(", Recipe: ").append(dessert.getRecipe())
                        .append(", Allergic: ").append(dessert.isAllergic() ? "Yes" : "No")
                        .append(", Feedbacks: ").append(String.join(", ", dessert.getFeedBacks()))
                        .append("\n");
            }
        }

        // Iterate through signed owners and display their recipes
        for (Owner owner : dataBase.signedStoreOwners) {
            for (Dessert dessert : owner.getRecipe()) {
                hasRecipes = true;
                recipesInfo.append("Owner: ").append(owner.getName())
                        .append(", Recipe Name: ").append(dessert.getName())
                        .append(", Recipe: ").append(dessert.getRecipe())
                        .append(", Allergic: ").append(dessert.isAllergic() ? "Yes" : "No")
                        .append(", Feedbacks: ").append(String.join(", ", dessert.getFeedBacks()))
                        .append("\n");
            }
        }

        if (!hasRecipes) {
            recipesInfo.append("No recipes available.");
        }

        // Display the recipes in the text area
        jTextArea1.setText(recipesInfo.toString());
    }

    private void addFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = JOptionPane.showInputDialog(this, "Enter the username:");
        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username.");
            return;
        }

        String itemName = JOptionPane.showInputDialog(this, "Enter the product or recipe name:");
        if (itemName == null || itemName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the product or recipe name.");
            return;
        }

        String feedback = JOptionPane.showInputDialog(this, "Enter your feedback:");
        if (feedback == null || feedback.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your feedback.");
            return;
        }

        boolean feedbackAdded = false;

        // Try to add feedback to user's recipes
        for (User user : dataBase.signedUsers) {
            if (user.getName().equals(username)) {
                for (Dessert dessert : user.getRecipe()) {
                    if (dessert.getName().equalsIgnoreCase(itemName)) {
                        dessert.getFeedBacks().add(feedback);
                        feedbackAdded = true;
                        break;
                    }
                }
            }
            if (feedbackAdded) break;
        }

        // Try to add feedback to owner's products or recipes
        if (!feedbackAdded) {
            for (Owner owner : dataBase.signedStoreOwners) {
                if (owner.getName().equals(username)) {
                    for (Product product : owner.getList()) {
                        if (product.getName().equalsIgnoreCase(itemName)) {
                            product.getFeedBacks().add(feedback);
                            feedbackAdded = true;
                            break;
                        }
                    }
                    if (!feedbackAdded) {
                        for (Dessert dessert : owner.getRecipe()) {
                            if (dessert.getName().equalsIgnoreCase(itemName)) {
                                dessert.getFeedBacks().add(feedback);
                                feedbackAdded = true;
                                break;
                            }
                        }
                    }
                }
                if (feedbackAdded) break;
            }
        }

        if (feedbackAdded) {
            JOptionPane.showMessageDialog(this, "Feedback added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "User or item not found.");
        }
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
            java.util.logging.Logger.getLogger(User_Content_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Content_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Content_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Content_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Content_GUI(new DataBase(), new User("username", "password", "email","city")).setVisible(true);
            }
        });
    }



    private javax.swing.JButton addFeedbackButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton postsButton;
    private javax.swing.JButton recipesButton;

//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JScrollPane jScrollPane1;
//
//
//    private javax.swing.JTextArea jTextArea1;
//    public javax.swing.JButton postsButton;
//    public javax.swing.JButton recipesButton;
//    private javax.swing.JButton backButton;
//    private javax.swing.JButton addFeedbackButton;

}
