package org.niit.config;
import org.niit.model.Author;
import org.niit.model.Book;
import org.springframework.context.annotation.Bean;

public class AppConfig
{
    @Bean("book1")
    public Book getBook1()
    {
        return new Book(102,"java","coding",new Author(11,"james gosling","america"));
    }
    @Bean("book2")
    public Book getBook2()
    {
        Book book = new Book();
        book.setBookno(02);
        book.setBookname("Spring Framework");
        book.setGenre("Software");
        return book;
    }

    @Bean("author")
    public Author getAuthor()
    {
        Author author = new Author();
        author.setAuthorid(101);
        author.setAuthorname("Rod Johnson");
        author.setLivewhere("sector 47 gurgao");
        return author;
    }
}
