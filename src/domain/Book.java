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
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "author")
    private String author;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "copies")
    private int copies;

    public Book(int isbn, String bookName, String author, String publisher, int copies) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.copies = copies;
    }

   public Book() {

    }

    public int getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopies() {
        return copies;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + ", copies=" + copies + '}';
    }

}
