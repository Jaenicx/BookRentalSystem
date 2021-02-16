/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.interfaces;

import domain.StudentLogin;
import java.util.List;
import service.IService;

/**
 *
 * @author Jaenicx
 */
public interface IStudentLoginService extends IService {
     public final String ServiceName = "IStudentLoginService";
    
    public List<StudentLogin> studentLogin_SelectAll();
    
    //Overloaded operations below. You can Insert, Update or Delete using the attributes or object instance
    
    public void studentLogin_Insert(int studentID, String username, String password);
    public void studentLogin_Insert(StudentLogin studentlogin);
    
    public void studentLogin_Update(String username, String password, int studentID);
    public void studentLogin_Update(StudentLogin studentlogin);
    
    public void studentLogin_Delete(int studentID);
    public void studentLogin_Delete(StudentLogin studentlogin);
    
}
