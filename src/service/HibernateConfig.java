/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Admin;
import domain.Book;
import domain.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import presentation.StudentLogin;

/**
 *
 * @author Jaenicx
 */
public abstract class HibernateConfig {
    private static final Configuration CONFIG = new Configuration();//Used to read in the Hibernate configuration
    private static SessionFactory sessionFactory = null;//A factory for acquiring Hibernate Sessions

    /**
     * gets session for Hibernate
     *
     * @return SessionFactory
     * @throws HibernateException
     */
    private static SessionFactory getSessionFactory() throws HibernateException {
        if (sessionFactory == null) {
            try {
                //configure hibernate using XML file
                CONFIG.configure("hibernate.cfg.xml");

                //add annotated classes
                CONFIG.addAnnotatedClass(Student.class);
                CONFIG.addAnnotatedClass(Admin.class);
                CONFIG.addAnnotatedClass(StudentLogin.class);
                CONFIG.addAnnotatedClass(Book.class);
                
                //build session factory
                sessionFactory = CONFIG.buildSessionFactory();
            } catch (HibernateException e) {
                throw new HibernateException("Unable to configure session" + e.toString());

            }
        }

        return sessionFactory;
    }

    /**
     * utility method for getting session factory
     *
     * @return
     */
    protected static Session getSession() throws HibernateException {
        sessionFactory = getSessionFactory();
        return (sessionFactory != null) ? sessionFactory.openSession() : null; //opens & retuns the session
    }

    protected static void closeSession() throws HibernateException {
        sessionFactory.close();
    }
    }
    
