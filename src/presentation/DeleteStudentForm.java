/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import domain.StudentLogin;
import javax.swing.JFrame;
import static service.implementation.LibrarySystemImplemenation_JDBC.connString;

/**
 *
 * @author Jaenicx
 */
public class DeleteStudentForm extends javax.swing.JFrame {
JFrame frame;
    /**
     * Creates new form DeleteStudentForm
     */
    public DeleteStudentForm() {
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
        studentDeleteButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        studentIDBox = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delete Student");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 174, -1, -1));

        studentDeleteButton.setBackground(new java.awt.Color(51, 51, 255));
        studentDeleteButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        studentDeleteButton.setText("Submit");
        studentDeleteButton.setBorder(null);
        studentDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(studentDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 130, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Student ID Number:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        studentIDBox.setBackground(new java.awt.Color(51, 51, 255));
        studentIDBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        studentIDBox.setForeground(new java.awt.Color(255, 255, 255));
        studentIDBox.setBorder(null);
        studentIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDBoxActionPerformed(evt);
            }
        });
        jPanel2.add(studentIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 257, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 320, 580));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 550, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDeleteButtonActionPerformed
        // TODO add your handling code here:
              try {
           //Book_Manager bookDelete = new Book_Manager();
            //bookDelete.book_Delete(Integer.parseInt(isbnDeleteBox.getText()));

            StudentLogin login = new StudentLogin();
            login.setStudentID(Integer.parseInt(studentIDBox.getText()));

            Connection conn = DriverManager.getConnection(connString);
            String sql = "DELETE FROM studentlogin WHERE studentID = " + login.getStudentID() + "";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error Message:" + e.getMessage());
        }
        JOptionPane.showMessageDialog(frame,
                "Student Login Deleted",
                "Message",
                JOptionPane.WARNING_MESSAGE);
        this.hide();
        AdminMainForm adminDisplay = new AdminMainForm();
        adminDisplay.show();
        
    }//GEN-LAST:event_studentDeleteButtonActionPerformed

    private void studentIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDBoxActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton studentDeleteButton;
    public javax.swing.JTextField studentIDBox;
    // End of variables declaration//GEN-END:variables
}
