/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Jae Nicholas McDonald
//ID# 1700246995
package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jaenicx
 */
@Entity
@Table(name = "studentlogin")
public class StudentLogin {

    @Id
    @Column(name = "studentID")
    private int studentID;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public StudentLogin(int studentID, String username, String password) {
        this.studentID = studentID;
        this.username = username;
        this.password = password;
    }

  public  StudentLogin() {

    }

    public int getStudentID() {
        return studentID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /**
     *
     * @param studentID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentLogin{" + "studentID=" + studentID + ", username=" + username + ", password=" + password + '}';
    }

}
