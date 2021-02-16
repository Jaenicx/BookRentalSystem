/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.StudentLogin;
import java.util.List;
import service.interfaces.IStudentLoginService;

/**
 *
 * @author Jaenicx
 */
public class StudentLogin_Manager extends Manager {
      public StudentLogin_Manager(){
    }
    
    public List<StudentLogin> student_SelectAll() throws Exception {
        IStudentLoginService studentLoginSvc = (IStudentLoginService) this.getService(IStudentLoginService.ServiceName); //loads service  
        return studentLoginSvc.studentLogin_SelectAll();
    }
    
     public void studentLogin_Insert(int studentID, String username, String password) throws Exception {
        IStudentLoginService studentSvc = (IStudentLoginService) this.getService(IStudentLoginService.ServiceName); //loads service  
        studentSvc.studentLogin_Insert(studentID, username, password);
    }

    
     public void studentLogin_Update(int studentID, String username, String password) throws Exception {
        IStudentLoginService studentSvc = (IStudentLoginService) this.getService(IStudentLoginService.ServiceName); //loads service  
        studentSvc.studentLogin_Update(username, password, studentID);
    }
     

     public void studentLogin_Delete(int studentID) throws Exception {
        IStudentLoginService studentSvc = (IStudentLoginService) this.getService(IStudentLoginService.ServiceName); //loads service  
        studentSvc.studentLogin_Delete(studentID);
    }
    
}
