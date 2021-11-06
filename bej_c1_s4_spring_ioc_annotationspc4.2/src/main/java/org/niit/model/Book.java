package org.niit.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Book
{
    private int bookno;
    private String bookname;
    private String genre;

    public int getBookno() {
        return bookno;
    }

    public Book(int bookno, String bookname, String genre, Author author) {
        this.bookno = bookno;
        this.bookname = bookname;
        this.genre = genre;
        this.author = author;
    }

    public Book()
    {
        this.bookname="";
        this.genre="";
    }
    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @Autowired
    private Author author;
}
