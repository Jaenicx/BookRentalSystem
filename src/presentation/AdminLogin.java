/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import static service.implementation.LibrarySystemImplemenation_JDBC.connString;

/**
 *
 * @author Jaenicx
 */
public class AdminLogin extends javax.swing.JFrame {
    JFrame frame;
private static final Logger log = Logger.getLogger(AdminLogin.class);
    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adminPassword = new javax.swing.JTextField();
        adminUserName = new javax.swing.JTextField();
        adminsubmitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("to the");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 257, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 257, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ncx Library System");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 174, -1, -1));

        adminPassword.setBackground(new java.awt.Color(51, 51, 255));
        adminPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        adminPassword.setForeground(new java.awt.Color(255, 255, 255));
        adminPassword.setBorder(null);
        adminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(adminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 30));

        adminUserName.setBackground(new java.awt.Color(51, 51, 255));
        adminUserName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        adminUserName.setForeground(new java.awt.Color(255, 255, 255));
        adminUserName.setBorder(null);
        adminUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(adminUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 30));

        adminsubmitButton.setBackground(new java.awt.Color(51, 51, 255));
        adminsubmitButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminsubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        adminsubmitButton.setText("Submit");
        adminsubmitButton.setBorder(null);
        adminsubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsubmitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(adminsubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 410, 630));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 626));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPasswordActionPerformed

    private void adminUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUserNameActionPerformed

    private void adminsubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsubmitButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            
            String username = adminUserName.getText();
            String password = adminPassword.getText();
            Connection conn = DriverManager.getConnection(connString);
            String sql = "SELECT * FROM admininfo WHERE username= '" +username+"' AND password='" +password+ "'";
            /* 
                            pstmt.setString(1, admin.getUsername());
                            pstmt.setString(2, admin.getPassword());
                            
             */
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if(rs.next()){
            AdminMainForm adminDisplay = new AdminMainForm();
            this.hide();
            adminDisplay.show();
            } else{
                  JOptionPane.showMessageDialog(frame,
                    "Username or Password Incorrect",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            log.debug("This is where Logging should happen");
            JOptionPane.showMessageDialog(frame,
                    "Username or Password Incorrect",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_adminsubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminPassword;
    private javax.swing.JTextField adminUserName;
    private javax.swing.JButton adminsubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
