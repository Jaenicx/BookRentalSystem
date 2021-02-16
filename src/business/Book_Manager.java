/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import domain.Book;
import java.util.List;
import service.interfaces.IBookService;

/**
 *
 * @author Jaenicx
 */
public class Book_Manager extends Manager {
      public List<Book> OfficeWorker_SelectAll() throws Exception {
        IBookService bookSvc = (IBookService) this.getService(IBookService.ServiceName); //loads service  
        return bookSvc.book_SelectAll();
    }
    
    public void book_Insert(int isbn, String bookName, String author, String publisher, int copies) throws Exception {
        IBookService bookSvc = (IBookService) this.getService(IBookService.ServiceName); //loads service  
        bookSvc.book_Insert(isbn, bookName, author, publisher, copies); //services.OfficeWorkerSvcJDBCImpl  
    }
    
     public void book_Delete(int isbn) throws Exception {
        IBookService bookSvc = (IBookService) this.getService(IBookService.ServiceName); //loads service  
        bookSvc.book_Delete(isbn); //services.OfficeWorkerSvcJDBCImpl  
    }
    
       public void book_Update(int isbn, String bookName, String author, String publisher,int copies) throws Exception {
        IBookService bookSvc = (IBookService) this.getService(IBookService.ServiceName); //loads service  
        bookSvc.book_Update(isbn, bookName, author, publisher, copies);         
    }
}
