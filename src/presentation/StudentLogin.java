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
import javax.swing.*;
import javax.swing.JOptionPane;
import static service.implementation.LibrarySystemImplemenation_JDBC.connString;

/**
 *
 * @author Jaenicx
 */
public class StudentLogin extends javax.swing.JFrame {
    JFrame frame;

    /**
     * Creates new form StudentLogin
     */
    public StudentLogin() {
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
        studentLoginPasswordBox = new javax.swing.JTextField();
        studentLoginBox = new javax.swing.JTextField();
        studentsubmitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Login");
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

        studentLoginPasswordBox.setBackground(new java.awt.Color(51, 51, 255));
        studentLoginPasswordBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        studentLoginPasswordBox.setForeground(new java.awt.Color(255, 255, 255));
        studentLoginPasswordBox.setBorder(null);
        studentLoginPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginPasswordBoxActionPerformed(evt);
            }
        });
        jPanel2.add(studentLoginPasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 30));

        studentLoginBox.setBackground(new java.awt.Color(51, 51, 255));
        studentLoginBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        studentLoginBox.setForeground(new java.awt.Color(255, 255, 255));
        studentLoginBox.setBorder(null);
        studentLoginBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginBoxActionPerformed(evt);
            }
        });
        jPanel2.add(studentLoginBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 30));

        studentsubmitButton.setBackground(new java.awt.Color(51, 51, 255));
        studentsubmitButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentsubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        studentsubmitButton.setText("Submit");
        studentsubmitButton.setBorder(null);
        studentsubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsubmitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(studentsubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 490, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 400, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentLoginPasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginPasswordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLoginPasswordBoxActionPerformed

    private void studentLoginBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLoginBoxActionPerformed

    private void studentsubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsubmitButtonActionPerformed
        // TODO add your handling code here:
        try {
            String username = studentLoginBox.getText();
            String password = studentLoginPasswordBox.getText();
            Connection conn = DriverManager.getConnection(connString);
            String sql = "SELECT * FROM studentlogin WHERE username='" +username + "' AND password='" +password+ "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);

            if (rs.next()){
                StudentMainForm studentDisplay = new StudentMainForm();
                this.hide();
                studentDisplay.show();
            } else{
                   JOptionPane.showMessageDialog(frame,
                    "Username or Password Incorrect",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            }
                }catch(Exception e){
                    
                }
    }//GEN-LAST:event_studentsubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField studentLoginBox;
    private javax.swing.JTextField studentLoginPasswordBox;
    private javax.swing.JButton studentsubmitButton;
    // End of variables declaration//GEN-END:variables
}