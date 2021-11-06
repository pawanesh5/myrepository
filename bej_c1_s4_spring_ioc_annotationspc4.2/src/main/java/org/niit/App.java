package org.niit;

import org.niit.config.AppConfig;
import org.niit.model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Book book1 =context.getBean("book2",Book.class);
        System.out.println("Book number: "+book1.getBookno()+",Book name:"+book1.getBookname()+",Book genre:"+book1.getGenre());
        System.out.println(("Author id:"+book1.getAuthor().getAuthorid()+",Author Name: "+book1.getAuthor().getAuthorname()+",where author Live: "+book1.getAuthor().getLivewhere()));
    }
}
