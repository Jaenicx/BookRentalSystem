/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import domain.Admin;
import domain.Book;
import domain.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import domain.StudentLogin;
import service.HibernateConfig;
import service.IService;

/**
 *
 * @author Jaenicx
 */
public class LibrarySystemImplementation_Hibernate extends HibernateConfig implements IService{


    public static void addAdmin(Admin admin) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.save(admin);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }

    }

    public static void deleteAdmin(Admin admin) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.delete(admin);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }

    public void addBook(Book book) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.save(book);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }

    public static List<Book> selectBook() {
        List<Book> bookList = new ArrayList<>();

        Session session = getSession(); //gets the session            

        try {
            NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM book").addEntity(Book.class);
            bookList = nativeQuery.list();

        } catch (Exception e) {
            System.out.println("e--" + e.toString());
            throw new HibernateException("Unable to retreive Data" + e.toString());
        } finally {

            //closeSession();
        }

        return bookList;
    }

    public static void deleteBook(Book book) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.delete(book);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void updateBook(Book book) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.update(book);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void addStudent(Student student) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.save(student);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static List<Student> selectStudent() {
        List<Student> studentList = new ArrayList<>();

        Session session = getSession(); //gets the session            

        try {
            NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM student").addEntity(Student.class);
            studentList = nativeQuery.list();

        } catch (Exception e) {
            System.out.println("e--" + e.toString());
            throw new HibernateException("Unable to retreive Data" + e.toString());
        } finally {

            //closeSession();
        }

        return studentList;
    }

    public static void deleteStudent(Student student) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.delete(student);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void updateStudent(Student student) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.update(student);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void addlogin(StudentLogin login) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.save(login);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static List<StudentLogin> selectStudentLogin() {
        List<StudentLogin> studentLoginList = new ArrayList<>();

        Session session = getSession(); //gets the session            

        try {
            NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM studentlogin").addEntity(StudentLogin.class);
            studentLoginList = nativeQuery.list();

        } catch (Exception e) {
            System.out.println("e--" + e.toString());
            throw new HibernateException("Unable to retreive Data" + e.toString());
        } finally {

            closeSession();
        }

        return studentLoginList;
    }

    public static void deleteStudentLogin(StudentLogin studentlogin) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.delete(studentlogin);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }

    public static void updateStudentLogin(StudentLogin studentlogin) {
        Session session = getSession();
        Transaction tranx = null;

        try {
            tranx = session.beginTransaction();
            session.update(studentlogin);
            tranx.commit();
        } catch (HibernateException e) {
            if (tranx != null) {
                tranx.rollback();
            }
            throw new HibernateException("Unable to store info" + e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
    
}
