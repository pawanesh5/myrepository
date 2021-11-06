package com.niit.insert;

import com.niit.model.Author;
import com.niit.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddAuthor {
    private SessionFactory sessionFactory;
    private Session session;

    public AddAuthor()
    {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public boolean AddNewAuthor(Author author)
    {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(author);
            session.flush();
            transaction.commit();
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
}
