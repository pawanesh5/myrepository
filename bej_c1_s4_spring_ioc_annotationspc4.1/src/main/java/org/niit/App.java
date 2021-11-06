package org.niit;

import org.niit.config.AppConfig;
import org.niit.model.Author;
import org.niit.model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Book book1 =context.getBean("book2",Book.class);
        Author author1 = context.getBean("author",Author.class);
        System.out.println("Book number: "+book1.getBookno()+",Book name:"+book1.getBookname()+",Book genre:"+book1.getGenre());
        System.out.println(("Author id:"+author1.getAuthorid()+",Author Name: "+author1.getAuthorname()+",where author Live: "+author1.getLivewhere()));
    }
}
