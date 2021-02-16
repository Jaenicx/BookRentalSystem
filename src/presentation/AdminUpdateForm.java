/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.StudentLogin_Manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import domain.StudentLogin;
import static service.implementation.LibrarySystemImplemenation_JDBC.connString;

/**
 *
 * @author Jaenicx
 */
public class AdminUpdateForm extends javax.swing.JFrame {
    JFrame frame;
    

    /**
     * Creates new form AdminUpdateForm
     */
    public AdminUpdateForm() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        passwordUpdateBox = new javax.swing.JTextField();
        adminUpdateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idUpdateBox = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        usernameUpdateBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 174, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 257, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Username:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        passwordUpdateBox.setBackground(new java.awt.Color(51, 51, 255));
        passwordUpdateBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordUpdateBox.setForeground(new java.awt.Color(255, 255, 255));
        passwordUpdateBox.setBorder(null);
        passwordUpdateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUpdateBoxActionPerformed(evt);
            }
        });
        jPanel2.add(passwordUpdateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 30));

        adminUpdateButton.setBackground(new java.awt.Color(51, 51, 255));
        adminUpdateButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        adminUpdateButton.setText("Submit");
        adminUpdateButton.setBorder(null);
        adminUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(adminUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter ID Number:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        idUpdateBox.setBackground(new java.awt.Color(51, 51, 255));
        idUpdateBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        idUpdateBox.setForeground(new java.awt.Color(255, 255, 255));
        idUpdateBox.setBorder(null);
        idUpdateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUpdateBoxActionPerformed(evt);
            }
        });
        jPanel2.add(idUpdateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 257, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter Password:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 257, 20));

        usernameUpdateBox.setBackground(new java.awt.Color(51, 51, 255));
        usernameUpdateBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameUpdateBox.setForeground(new java.awt.Color(255, 255, 255));
        usernameUpdateBox.setBorder(null);
        usernameUpdateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameUpdateBoxActionPerformed(evt);
            }
        });
        jPanel2.add(usernameUpdateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 310, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 540, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordUpdateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUpdateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordUpdateBoxActionPerformed

    private void adminUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdateButtonActionPerformed
        // TODO add your handling code here:
        

        try {
            //StudentLogin_Manager stuLogin = new StudentLogin_Manager();
            //stuLogin.studentLogin_Update(Integer.parseInt(idUpdateBox.getText()), usernameUpdateBox.getText(), passwordUpdateBox.getName());
            // LibrarySystemImplemenation_JDBC lib = new LibrarySystemImplemenation_JDBC();
            // lib.student_Insert(Integer.parseInt(studentIDBox.getText()), fnameBox.getText(), lnameBox.getText(), mailBox.getText());
            try {

                StudentLogin login = new StudentLogin();
                login.setUsername(usernameUpdateBox.getText());
                login.setPassword(passwordUpdateBox.getText());
                login.setStudentID(Integer.parseInt(idUpdateBox.getText()));

                Connection conn = DriverManager.getConnection(connString);
               String sql = "UPDATE studentlogin SET username='" + login.getUsername() + "', password='" + login.getPassword() + "' WHERE studentID = " + login.getStudentID() + "";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate(sql); 
            } catch (Exception e) {
                System.out.println("Error Message:" + e.getMessage());
            }
            JOptionPane.showMessageDialog(frame,
                "Student Updated",
                "Message",
                JOptionPane.WARNING_MESSAGE);
            this.hide();
            AdminMainForm adminDisplay = new AdminMainForm();
            adminDisplay.show();
        } catch (Exception e) {
            System.out.print("Error Message: " + e.getMessage());
        }
    }//GEN-LAST:event_adminUpdateButtonActionPerformed

    private void idUpdateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUpdateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUpdateBoxActionPerformed

    private void usernameUpdateBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameUpdateBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameUpdateBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminUpdateButton;
    public javax.swing.JTextField idUpdateBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField passwordUpdateBox;
    public javax.swing.JTextField usernameUpdateBox;
    // End of variables declaration//GEN-END:variables
}
