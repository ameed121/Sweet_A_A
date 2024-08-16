package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.User;
import Package_Sweet.Supplier;

import javax.swing.*;


public class Communication_Owner_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private Owner owner;


    public Communication_Owner_GUI(DataBase dataBase, Owner owner) {
        this.dataBase = dataBase;
        this.owner = owner;
        initComponents();
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        sendMessageButton = new javax.swing.JButton();
        recipientField = new javax.swing.JTextField();
        messageBodyField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Communication Page");

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        sendMessageButton.setBackground(new java.awt.Color(0, 0, 0));
        sendMessageButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        sendMessageButton.setForeground(new java.awt.Color(255, 255, 255));
        sendMessageButton.setText("Send msg");
        sendMessageButton.setActionCommand("Send msg");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        recipientField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Recipient");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Msg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(76, 76, 76)
                                                                .addComponent(jLabel4))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel5)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(messageBodyField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(recipientField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)))
                                .addContainerGap(30, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                        .addComponent(recipientField))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(messageBodyField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(sendMessageButton)
                                .addGap(29, 29, 29)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>









    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Owner_GUI ownerFrame = new Owner_GUI(dataBase, owner);
        ownerFrame.setVisible(true);
        this.dispose();
    }

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String recipientName = recipientField.getText().trim();
        String messageBody = messageBodyField.getText().trim();

        if (recipientName.isEmpty() || messageBody.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide both recipient name and message.");
            return;
        }

        boolean messageSent = false;

        // Try to send the message to a User
        User user = findUserByName(recipientName);
        if (user != null) {
            user.getNotifications().add(owner.getName() + ", " + messageBody);
            messageSent = true;
        }

        // Try to send the message to an Owner
        Owner recipientOwner = findOwnerByName(recipientName);
        if (recipientOwner != null) {
            recipientOwner.getNotifications().add(owner.getName() + ", " + messageBody);
            messageSent = true;
        }

        // Try to send the message to a Supplier
        Supplier supplier = findSupplierByName(recipientName);
        if (supplier != null) {
            supplier.getNotifications().add(owner.getName() + ", " + messageBody);
            messageSent = true;
        }

        if (messageSent) {
            JOptionPane.showMessageDialog(this, "Message sent successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Recipient not found.");
        }
    }

    private User findUserByName(String name) {
        for (User user : dataBase.signedUsers) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    private Owner findOwnerByName(String name) {
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equalsIgnoreCase(name)) {
                return owner;
            }
        }
        return null;
    }

    private Supplier findSupplierByName(String name) {
        for (Supplier supplier : dataBase.signedSuppliers) {
            if (supplier.getName().equalsIgnoreCase(name)) {
                return supplier;
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(Communication_Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Communication_Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Communication_Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Communication_Owner_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataBase dataBase = new DataBase(); // You should pass the actual database instance
                Owner owner = new Owner("OwnerName", "password", "email", "city"); // Replace with actual owner object
                new Communication_Owner_GUI(dataBase, owner).setVisible(true);
            }
        });

    }



    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageBodyField;
    private javax.swing.JTextField recipientField;
    private javax.swing.JButton sendMessageButton;



//    private javax.swing.JButton backButton;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JTextField messageBodyField;
//    private javax.swing.JTextField recipientField;
//    private javax.swing.JButton sendMessageButton;

}
