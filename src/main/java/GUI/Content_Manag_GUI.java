package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Product;
import Package_Sweet.User;
import Package_Sweet.Dessert;


public class Content_Manag_GUI extends javax.swing.JFrame {

    private DataBase dataBase;


    public Content_Manag_GUI(DataBase dataBase) {
        this.dataBase = dataBase;
        initComponents();
    }





    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        postsButton = new javax.swing.JButton();
        recipesButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        postsButton.setBackground(new java.awt.Color(0, 0, 0));
        postsButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        postsButton.setForeground(new java.awt.Color(255, 255, 255));
        postsButton.setText("Show Post");
        postsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postsButtonActionPerformed(evt);
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
        jLabel1.setText("Content Management Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(recipesButton)
                                                        .addComponent(postsButton)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(postsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recipesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>






    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin_GUI adminFrame = new Admin_GUI(dataBase);
        adminFrame.setVisible(true);
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
            recipesInfo.append("No desserts available.");
        }

        // Display the recipes in the text area
        jTextArea1.setText(recipesInfo.toString());
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
            java.util.logging.Logger.getLogger(Content_Manag_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Content_Manag_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Content_Manag_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Content_Manag_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Content_Manag_GUI(new DataBase()).setVisible(true);
            }
        });
    }





    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JButton postsButton;
    public javax.swing.JButton recipesButton;


}
