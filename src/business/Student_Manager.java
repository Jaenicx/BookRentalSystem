/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.Student;
import java.util.List;
import service.interfaces.IStudentService;

/**
 *
 * @author Jaenicx
 */
public class Student_Manager extends Manager {
    
    public Student_Manager(){
    }
    
    public List<Student> student_SelectAll() throws Exception {
        IStudentService studentSvc = (IStudentService) this.getService(IStudentService.ServiceName); //loads service  
        return studentSvc.student_SelectAll();
    }
    
     public void student_Insert(int studentID, String firstName, String lastName, String email) throws Exception {
        IStudentService studentSvc = (IStudentService) this.getService(IStudentService.ServiceName); //loads service  
        studentSvc.student_Insert(studentID, firstName, lastName, email);
    }

    
    public void student_Update(int studentID, String firstName, String lastName, String email) throws Exception {
        IStudentService studentSvc = (IStudentService) this.getService(IStudentService.ServiceName); //loads service  
        studentSvc.student_Update(studentID, firstName, lastName, email);
    }
     

    public void student_Delete(int studentID) throws Exception {
        IStudentService officeworkerSvc = (IStudentService) this.getService(IStudentService.ServiceName); //loads service  
        officeworkerSvc.student_Delete(studentID);
    }
}
