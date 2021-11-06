package com.niit;

import com.niit.insert.AddAuthor;
import com.niit.model.Author;
import com.niit.retrieve.GetAuthor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AddAuthor addAuthor = new AddAuthor();
        Author author = new Author();
        author.setAuthorID(101);
        author.setAuthorname("pawanesh");
        author.setPassword("bruhuu");
        author.setEmailID("pawanesh@gmail.com");
        addAuthor.AddNewAuthor(author);
        System.out.println("fetching user details...");
        GetAuthor getAuthor = new GetAuthor();
        getAuthor.getAllauthor();

    }
}
