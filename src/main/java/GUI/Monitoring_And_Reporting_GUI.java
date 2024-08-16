package GUI;

import javax.swing.JOptionPane;
import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Product;
import Package_Sweet.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * MonitoringAndReportingFrame class for monitoring and reporting activities.
 */
public class Monitoring_And_Reporting_GUI extends javax.swing.JFrame {

    private DataBase dataBase;


    public Monitoring_And_Reporting_GUI(DataBase dataBase) {
        this.dataBase = dataBase;
        initComponents();
    }


    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        profitsButton = new javax.swing.JButton();
        bestSellingButton = new javax.swing.JButton();
        statisticsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("Monitoring and Reporting Page");

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        profitsButton.setBackground(new java.awt.Color(0, 0, 0));
        profitsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        profitsButton.setForeground(new java.awt.Color(255, 255, 255));
        profitsButton.setText("Profits");
        profitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profitsButtonActionPerformed(evt);
            }
        });

        bestSellingButton.setBackground(new java.awt.Color(0, 0, 0));
        bestSellingButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bestSellingButton.setForeground(new java.awt.Color(255, 255, 255));
        bestSellingButton.setText("Best-Selling");
        bestSellingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestSellingButtonActionPerformed(evt);
            }
        });

        statisticsButton.setBackground(new java.awt.Color(0, 0, 0));
        statisticsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        statisticsButton.setForeground(new java.awt.Color(255, 255, 255));
        statisticsButton.setText("Statistics");
        statisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(backButton)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 32, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bestSellingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(profitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(profitsButton)
                                .addGap(12, 12, 12)
                                .addComponent(statisticsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bestSellingButton)
                                .addGap(53, 53, 53)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>





    public void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Admin_GUI adminFrame = new Admin_GUI(dataBase);
        adminFrame.setVisible(true);
        this.dispose();
    }

    public void statisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Create a list to hold users sorted by city
        List<User> sortedUsers = new ArrayList<User>(dataBase.signedUsers);

        // Sort users by city using a traditional comparator
        Collections.sort(sortedUsers, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.getCity().compareToIgnoreCase(u2.getCity());
            }
        });

        // Prepare the display string
        StringBuilder userInfo = new StringBuilder("Users Ordered by City:\n\n");

        for (User user : sortedUsers) {
            userInfo.append("City: ").append(user.getCity())
                    .append(", Username: ").append(user.getName())
                    .append(", Email: ").append(user.getEmail())
                    .append(", Orders: ").append(user.getOrders().size())
                    .append("\n");
        }

        // Display the user information in a message dialog
        JOptionPane.showMessageDialog(this, userInfo.toString(), "User Statistics", JOptionPane.INFORMATION_MESSAGE);
    }

    public void bestSellingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Initialize variables to track the best-selling product
        Owner bestOwner = null;
        Product bestProduct = null;

        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getList() != null) { // Ensure list is not null
                for (Product product : owner.getList()) {
                    if (bestProduct == null || product.getSold() > bestProduct.getSold()) {
                        bestProduct = product;
                        bestOwner = owner;
                    }
                }
            }
        }

        // Prepare the message
        if (bestProduct != null && bestOwner != null) {
            String message = String.format("Owner: %s\nProduct: %s\nPrice: %.2f\nNumber of Sales: %d",
                    bestOwner.getName(), bestProduct.getName(), bestProduct.getPrice(), bestProduct.getSold());
            JOptionPane.showMessageDialog(this, message, "Best-Selling Product", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No products found.", "Best-Selling Product", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void profitsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder profitInfo = new StringBuilder("Owner Profits:\n\n");
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("report1.txt"));

            for (Owner owner : dataBase.signedStoreOwners) {
                if (owner.getList() != null) { // Ensure list is not null
                    double totalProfit = 0.0;
                    for (Product product : owner.getList()) {
                        totalProfit += product.getPrice() * product.getSold();
                    }

                    String ownerInfo = String.format("Owner: %s, Profit: %.2f\n", owner.getName(), totalProfit);
                    profitInfo.append(ownerInfo);
                    writer.write(ownerInfo);
                }
            }

            JOptionPane.showMessageDialog(this, profitInfo.toString(), "Owner Profits", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to file.", "File Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error closing the file writer.", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
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
            java.util.logging.Logger.getLogger(Monitoring_And_Reporting_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitoring_And_Reporting_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitoring_And_Reporting_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitoring_And_Reporting_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitoring_And_Reporting_GUI(new DataBase()).setVisible(true);
            }
        });
    }


    private javax.swing.JButton backButton;
    private javax.swing.JButton bestSellingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton profitsButton;
    private javax.swing.JButton statisticsButton;


//    private javax.swing.JButton backButton;
//    private javax.swing.JButton bestSellingButton;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JButton profitsButton;
//    private javax.swing.JButton statisticsButton;


    
}
