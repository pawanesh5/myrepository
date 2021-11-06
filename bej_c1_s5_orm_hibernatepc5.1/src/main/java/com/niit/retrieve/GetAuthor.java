package com.niit.retrieve;

import com.niit.model.Author;
import com.niit.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class GetAuthor
{
    private SessionFactory sessionFactory;
    private Session session;

    public GetAuthor()
    {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void getAllauthor()
    {
        session = sessionFactory.openSession();
        Query query = session.createQuery("from Author");
        List<Author> allauthors = query.list();
        for(Author author:allauthors)
        {
                System.out.println("author id:"+author.getAuthorID()+"\n author name:"+author.getAuthorname()+"\n password:"+author.getPassword()+"email:"+author.getEmailID());
        }
    }
}
