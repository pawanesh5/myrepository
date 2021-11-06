package com.niit;

import com.niit.dao.BookDao;
import com.niit.dao.impl.BookDaoimpl;
import com.niit.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book book= new Book();
        book.setBookno(4545);
        book.setBookName("java");
        book.setDescription("it's a programming language book");
        book.setPrice(780);
        book.setQuantity(5);
        BookDao bookdao=new BookDaoimpl();
        if(bookdao.addBook(book))
        {
            System.out.println("book added succefully");
        }
        else
        {
            System.out.println("Error adding Book");
        }

    }
}
