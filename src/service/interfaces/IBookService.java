/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.interfaces;

import domain.Book;
import java.util.List;
import service.IService;

/**
 *
 * @author Jaenicx
 */
public interface IBookService extends IService {
     public final String ServiceName = "IBookService";
    
    public List<Book> book_SelectAll();
    
    //Overloaded operations below. You can Insert, Update or Delete using the attributes or object instance
    
    public void book_Insert(int isbn, String bookName, String author, String publisher, int copies);
    public void book_Insert(Book book);
    
    public void book_Update(int isbn, String bookName, String author, String publisher, int copies);
    public void book_Update(Book book);
    
    public void book_Delete(int isbn);
    public void book_Delete(Book book);
    
}
