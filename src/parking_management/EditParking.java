/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parking_management;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
public class EditParking extends javax.swing.JFrame {

    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "system";
    private static final String DB_PASSWORD = "system";

    // JDBC connection and statement variables
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    /**
     * Creates new form AdminDashboard
     */
    public EditParking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        dashboardButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        changeButton = new javax.swing.JButton();
        vehicleType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slotsNo = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        extraCharge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 50));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parker");

        logoutButton.setForeground(new java.awt.Color(0, 102, 102));
        logoutButton.setText("Logout");
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        dashboardButton.setForeground(new java.awt.Color(0, 102, 102));
        dashboardButton.setText("Dashboard");
        dashboardButton.setFocusable(false);
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/car.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboardButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(dashboardButton))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        changeButton.setBackground(new java.awt.Color(0, 102, 102));
        changeButton.setForeground(new java.awt.Color(255, 255, 255));
        changeButton.setText("CHANGE");
        changeButton.setFocusable(false);
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        vehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 wheeler", "4 wheeler", " " }));
        vehicleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Vehicle Type");

        jLabel3.setText("Total Parking Slots");

        jLabel4.setText("Charge per hour");

        slotsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotsNoActionPerformed(evt);
            }
        });

        jLabel5.setText("Extra Charge");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(changeButton))
                    .addComponent(slotsNo)
                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extraCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                .addGap(316, 316, 316))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slotsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extraCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeButton)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        homePage.pack();
        homePage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        // TODO add your handling code here:
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.setVisible(true);
        adminDashboard.pack();
        adminDashboard.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_dashboardButtonActionPerformed

     private void closeResources() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error closing database resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        String selectedVehicleType = (String) vehicleType.getSelectedItem();
        int totalSlots = Integer.parseInt(slotsNo.getText().trim());
        int chargePerHour = Integer.parseInt(amount.getText().trim());
        int extra = Integer.parseInt(extraCharge.getText().trim());

    try {
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        String slotsTable = (selectedVehicleType.equals("2 wheeler")) ? "slots_2wheeler" : "slots_4wheeler";

        // Check if details table is empty
        String checkEmptyQuery = "SELECT COUNT(*) FROM details WHERE vehicle_type = ?";
        pstmt = conn.prepareStatement(checkEmptyQuery);
        pstmt.setString(1, selectedVehicleType);
        rs = pstmt.executeQuery();
        rs.next();
        int rowCount = rs.getInt(1);

        if (rowCount == 0) {
            // Insert into details table if empty
            String insertDetailsQuery = "INSERT INTO details(vehicle_type, available_slots, charge, extraCharge) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertDetailsQuery);
            pstmt.setString(1, selectedVehicleType);
            pstmt.setInt(2, totalSlots);
            pstmt.setInt(3, chargePerHour);
            pstmt.setInt(4, extra);
            pstmt.executeUpdate();

            // Insert slots into corresponding slots table
            String insertSlotsQuery = "INSERT INTO " + slotsTable + "(slot_no, status) VALUES (?, 'available')";
            pstmt = conn.prepareStatement(insertSlotsQuery);
            for (int i = 1; i <= totalSlots; i++) {
                pstmt.setInt(1, i);
                pstmt.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Details added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Update details if slots are available
            String checkReservedQuery = "SELECT COUNT(*) FROM " + slotsTable + " WHERE status = 'reserved'";
            pstmt = conn.prepareStatement(checkReservedQuery);
            rs = pstmt.executeQuery();
            rs.next();
            int reservedCount = rs.getInt(1);

            if (reservedCount == 0) {
                // No reservations, proceed with updating details table
                String updateDetailsQuery = "UPDATE details SET available_slots = ?, charge = ?, extraCharge = ? WHERE vehicle_type = ?";
                pstmt = conn.prepareStatement(updateDetailsQuery);
                pstmt.setInt(1, totalSlots);
                pstmt.setInt(2, chargePerHour);
                pstmt.setInt(3, extra);
                pstmt.setString(4, selectedVehicleType);
                pstmt.executeUpdate();
                String deleteSlotsQuery = "DELETE FROM " + slotsTable;
                pstmt = conn.prepareStatement(deleteSlotsQuery);
                pstmt.executeUpdate();
                // Insert slots into corresponding slots table
                String insertSlotsQuery = "INSERT INTO " + slotsTable + "(slot_no, status) VALUES (?, 'available')";
                pstmt = conn.prepareStatement(insertSlotsQuery);
                for (int i = 1; i <= totalSlots; i++) {
                    pstmt.setInt(1, i);
                    pstmt.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Cannot update details, there are reserved slots.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        closeResources();
    }
    slotsNo.setText(" ");
    amount.setText(" ");

    }//GEN-LAST:event_changeButtonActionPerformed

    private void slotsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotsNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slotsNoActionPerformed

    private void vehicleTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleTypeActionPerformed

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
            java.util.logging.Logger.getLogger(EditParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditParking().setVisible(true);
            }
        });
        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JTextField extraCharge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField slotsNo;
    private javax.swing.JComboBox<String> vehicleType;
    // End of variables declaration//GEN-END:variables
}
