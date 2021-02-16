/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import domain.Book;
import domain.Student;
import domain.StudentLogin;
import service.interfaces.IBookService;
import service.interfaces.IStudentLoginService;
import service.interfaces.IStudentService;

/**
 *
 * @author Jaenicx
 */
public class LibrarySystemImplemenation_JDBC implements IStudentService, IStudentLoginService, IBookService {

    

    public static String connString = "jdbc:mysql://localhost:3306/librarysystem?user=root";

    @Override
    public List<Book> book_SelectAll() {
        List<Book> bookList = new ArrayList<>();
        Book book = null;
        try {

            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();
            String sql = "SELECT *FROM book";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                book = new Book();

                book.setIsbn(rs.getInt("isbn"));
                book.setBookName(rs.getString("bookName"));
                book.setAuthor(rs.getString("author"));
                book.setPublisher(rs.getString("publisher"));
                book.setCopies(rs.getInt("copies"));

                System.out.println(book);

                bookList.add(book);
            }

        } catch (SQLException ex) {
            System.out.print("Error Message" + ex.getMessage());
        }

        return bookList;

    }

    /**
     *
     * @param book
     */
    @Override
    public void book_Update(Book book) {
        try {

            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO book(isbn, bookName, author, publisher, copies) VALUES('" + book.getBookName() + "', '" + book.getAuthor() + "', '" + book.getPublisher() + "', '" + book.getCopies() + "')";

            PreparedStatement pstmtInsert1 = conn.prepareStatement(sql);
            /*
            pstmtInsert1.setInt(1, book.getIsbn());
            pstmtInsert1.setString(2, book.getBookName());
            pstmtInsert1.setString(3, book.getAuthor());
            pstmtInsert1.setString(4, book.getPublisher());
            pstmtInsert1.setInt(5, book.getCopies());
            pstmtInsert1.executeUpdate(sql);
             */
        } catch (SQLException ex) {
            System.out.println(" " + ex.getMessage());
        }
    }

    @Override
    public void book_Delete(Book book) {
        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM book WHERE isbn = " + book.getIsbn() + "";

            PreparedStatement pstmtDelete = conn.prepareStatement(sql);

            pstmtDelete.executeUpdate();

        } catch (Exception ex) {
            System.out.println(" " + ex.getMessage());
        }

    }

    @Override
    public void book_Insert(Book book) {
        try {

            Connection conn = DriverManager.getConnection(connString);

            Statement stmt = conn.createStatement();
            String insertSql = "INSERT INTO book (isbn, bookName, author, publisher, copies)VALUES (" + book.getIsbn() + ",'" + book.getBookName() + "','" + book.getAuthor() + "','" + book.getPublisher() + "','" + book.getCopies() + "')";

            PreparedStatement pstmt = conn.prepareStatement(insertSql);
            /*
            pstmt.setInt(1, book.getIsbn());
            pstmt.setString(2, book.getBookName());
            pstmt.setString(3, book.getAuthor());
            pstmt.setString(4, book.getPublisher());
            pstmt.setInt(5, book.getCopies());
             */

            pstmt.executeUpdate(insertSql);

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
    }

    @Override
    public List<Student> student_SelectAll() {
        List<Student> studentList = new ArrayList<>();
        Student student = null;

        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                student = new Student();

                student.setStudentID(rs.getInt("studentID"));
                student.setFirstName(rs.getString("firstName"));
                student.setLastName(rs.getString("lastName"));
                student.setEmail(rs.getString("email"));
            }

            System.out.println(student);

            studentList.add(student);

        } catch (SQLException ex) {

            System.out.println("Error Message:" + ex.getMessage());
        }

        return studentList;
    }

    @Override
    public void student_Update(Student student) {
        try {

            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO student(firstName, lastName, email,) VALUES '" + student.getFirstName() + "','" + student.getLastName() + "' , '" + student.getEmail() + "') WHERE studentID = " + student.getStudentID() + "";

            PreparedStatement pstmtInsert1 = conn.prepareStatement(sql);
            /*
            pstmtInsert1.setInt(1, student.getStudentID());
            pstmtInsert1.setString(2, student.getFirstName());
            pstmtInsert1.setString(3, student.getLastName());
            pstmtInsert1.setString(4, student.getEmail());
             */
            pstmtInsert1.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
    }

    @Override
    public void student_Delete(Student student) {
        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM student WHERE studentID = " + student.getStudentID() + " ";

            stmt = conn.prepareStatement(sql);
            //pstmtDelete.setInt(1, student.getStudentID());

            stmt.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

    }

    @Override
    public void student_Insert(Student student) {
       try {
          
            Connection conn = DriverManager.getConnection(connString);
            String sql = "INSERT INTO student (studentID, firstName, lastName, email) VALUES (" + student.getStudentID() + ",'" + student.getFirstName()+ "','" + student.getLastName() + "','" + student.getEmail() + "')";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error Message:" + e.getMessage());
        }
    }

    public static List<StudentLogin> login_SelectAll() {
        List<StudentLogin> loginList = new ArrayList<>();
        StudentLogin login = null;
        try {

            Connection conn = DriverManager.getConnection(connString);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM studentlogin";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                login = new StudentLogin();
                login.setStudentID(rs.getInt("studentID"));
                login.setUsername(rs.getString("username"));
                login.setPassword(rs.getString("password"));

                System.out.println(login);

                loginList.add(login);
            }

        } catch (SQLException ex) {
            System.out.print("Error Message" + ex.getMessage());
        }

        return loginList;

    }

    public static void login_Insert(StudentLogin login) {
        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement pstmt = conn.createStatement();
            String sql = "INSERT INTO studentlogin(studentID, username, password) VALUES('" + login.getStudentID() + "','" + login.getUsername() + "','" + login.getPassword() + "')";
            //PreparedStatement pstmt = conn.prepareStatement(sql);

            /* pstmt.setInt(1, login.getStudentID());
            pstmt.setString(2, login.getUsername());
            pstmt.setString(3, login.getPassword());
             */
            pstmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.print("Error" + e.getMessage());
        }
    }

    public static void login_Update(StudentLogin login) {
        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement pstmt = conn.createStatement();
            String sql = "UPDATE studentlogin SET username='" + login.getUsername() + "', password='" + login.getPassword() + "' WHERE studentID = " + login.getStudentID() + "";
            //PreparedStatement pstmt = conn.prepareStatement(sql);

            /* pstmt.setInt(1, login.getStudentID());
            pstmt.setString(2, login.getUsername());
            pstmt.setString(3, login.getPassword());
             */
            pstmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.print("Error" + e.getMessage());
        }
    }

    public static void login_Delete(StudentLogin login) {
        try {
            Connection conn = DriverManager.getConnection(connString);
            Statement pstmt = conn.createStatement();
            String sql = "DELETE FROM studentlogin WHERE studentID = " + login.getStudentID() + "";
            //PreparedStatement pstmt = conn.prepareStatement(sql);

            /* pstmt.setInt(1, login.getStudentID());
            pstmt.setString(2, login.getUsername());
            pstmt.setString(3, login.getPassword());*/
            pstmt.executeUpdate(sql);

        } catch (Exception e) {
            System.out.print("Error" + e.getMessage());
        }
    }

    @Override
    public void student_Insert(int studentID, String firstName, String lastName, String email) {

    }

    @Override
    public void student_Delete(int studentID) {

    }

    @Override
    public void student_Update(int studentID, String firstName, String lastName, String email) {

    }

    @Override
    public List<StudentLogin> studentLogin_SelectAll() {
        return null;

    }

    @Override
    public void studentLogin_Insert(int studentID, String username, String password) {

    }

    @Override
    public void studentLogin_Insert(StudentLogin studentlogin) {

    }

    public void studentLogin_Update(int studentID, String username, String password) {

    }

    @Override
    public void studentLogin_Update(StudentLogin studentlogin) {

    }

    @Override
    public void studentLogin_Delete(int studentID) {

    }

    @Override
    public void studentLogin_Delete(StudentLogin studentlogin) {

    }

    @Override
    public void book_Insert(int isbn, String bookName, String author, String publisher, int copies) {

    }

    @Override
    public void book_Update(int isbn, String bookName, String author, String publisher, int copies) {

    }


    @Override
    public void book_Delete(int isbn) {
        
    }

    @Override
    public void studentLogin_Update(String username, String password, int studentID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
