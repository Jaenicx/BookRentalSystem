/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.interfaces;

import domain.Student;
import java.util.List;
import service.IService;

/**
 *
 * @author Jaenicx
 */
public interface IStudentService extends IService {
    public final String ServiceName = "IStudentService";
    
    public List<Student> student_SelectAll();
    
    //Overloaded operations below. You can Insert, Update or Delete using the attributes or object instance
    
    public void student_Insert(int studentID, String firstName, String lastName, String email);
    public void student_Insert(Student student);
    
    public void student_Delete(int studentID);
    public void student_Delete(Student student);
    
    public void student_Update(int studentID, String firstName, String lastName, String email);
    public void student_Update(Student student);
    
    
}
