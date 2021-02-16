/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.Book_Manager;
import domain.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static service.implementation.LibrarySystemImplemenation_JDBC.connString;

/**
 *
 * @author Jaenicx
 */
public class BookRentForm extends javax.swing.JFrame {

    JFrame frame;

    /**
     * Creates new form BookRentForm
     */
    public BookRentForm() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        bookNameBox = new javax.swing.JTextField();
        bookRentButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bookAuthorBox = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        bookPublisherBox = new javax.swing.JTextField();
        isbnBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bookCopiesBox = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
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
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 257, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Publisher");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 257, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book ISBN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        bookNameBox.setBackground(new java.awt.Color(51, 51, 255));
        bookNameBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bookNameBox.setForeground(new java.awt.Color(255, 255, 255));
        bookNameBox.setBorder(null);
        bookNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameBoxActionPerformed(evt);
            }
        });
        jPanel2.add(bookNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 30));

        bookRentButton.setBackground(new java.awt.Color(51, 51, 255));
        bookRentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        bookRentButton.setForeground(new java.awt.Color(255, 255, 255));
        bookRentButton.setText("Submit");
        bookRentButton.setBorder(null);
        bookRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookRentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 80, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Author");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        bookAuthorBox.setBackground(new java.awt.Color(51, 51, 255));
        bookAuthorBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bookAuthorBox.setForeground(new java.awt.Color(255, 255, 255));
        bookAuthorBox.setBorder(null);
        bookAuthorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAuthorBoxActionPerformed(evt);
            }
        });
        jPanel2.add(bookAuthorBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 257, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 257, 20));

        bookPublisherBox.setBackground(new java.awt.Color(51, 51, 255));
        bookPublisherBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bookPublisherBox.setForeground(new java.awt.Color(255, 255, 255));
        bookPublisherBox.setBorder(null);
        bookPublisherBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPublisherBoxActionPerformed(evt);
            }
        });
        jPanel2.add(bookPublisherBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 30));

        isbnBox.setBackground(new java.awt.Color(51, 51, 255));
        isbnBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        isbnBox.setForeground(new java.awt.Color(255, 255, 255));
        isbnBox.setBorder(null);
        isbnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnBoxActionPerformed(evt);
            }
        });
        jPanel2.add(isbnBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Copies");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        bookCopiesBox.setBackground(new java.awt.Color(51, 51, 255));
        bookCopiesBox.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        bookCopiesBox.setForeground(new java.awt.Color(255, 255, 255));
        bookCopiesBox.setBorder(null);
        bookCopiesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCopiesBoxActionPerformed(evt);
            }
        });
        jPanel2.add(bookCopiesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 257, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 320, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 550, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameBoxActionPerformed

    private void bookRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRentButtonActionPerformed
        // TODO add your handling code here:

        try {
            // Book_Manager bookAdd = new Book_Manager();
            //bookAdd.book_Insert(Integer.parseInt(isbnBox.getText()) , bookNameBox.getText(), bookAuthorBox.getText(), bookPublisherBox.getText(), Integer.parseInt(bookCopiesBox.getText()));
            // LibrarySystemImplemenation_JDBC lib = new LibrarySystemImplemenation_JDBC();
            // lib.student_Insert(Integer.parseInt(studentIDBox.getText()), fnameBox.getText(), lnameBox.getText(), mailBox.getText());
            try {

                Book book = new Book();
                book.setIsbn(Integer.parseInt(isbnBox.getText()));
                book.setBookName(bookNameBox.getText());
                book.setAuthor(bookAuthorBox.getText());
                book.setPublisher(bookPublisherBox.getText());
                book.setCopies(Integer.parseInt(bookCopiesBox.getText()));

                Connection conn = DriverManager.getConnection(connString);
                String sql = "INSERT INTO book (isbn, bookName, author, publisher, copies) VALUES (" + book.getIsbn() + ",'" + book.getBookName() + "','" + book.getAuthor() + "','" + book.getPublisher() + "', '" + book.getCopies() + "')";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error Message:" + e.getMessage());
            }
            JOptionPane.showMessageDialog(frame,
                    "Books Rented",
                    "Message",
                    JOptionPane.WARNING_MESSAGE);
            this.hide();
            StudentMainForm studentDisplay = new StudentMainForm();
            studentDisplay.show();
        } catch (Exception e) {
            System.out.print("Error Message: " + e.getMessage());
        }

    }//GEN-LAST:event_bookRentButtonActionPerformed

    private void bookAuthorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAuthorBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookAuthorBoxActionPerformed

    private void bookPublisherBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPublisherBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookPublisherBoxActionPerformed

    private void isbnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnBoxActionPerformed

    private void bookCopiesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCopiesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookCopiesBoxActionPerformed

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
            java.util.logging.Logger.getLogger(BookRentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField bookAuthorBox;
    public javax.swing.JTextField bookCopiesBox;
    public javax.swing.JTextField bookNameBox;
    public javax.swing.JTextField bookPublisherBox;
    private javax.swing.JButton bookRentButton;
    public javax.swing.JTextField isbnBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
