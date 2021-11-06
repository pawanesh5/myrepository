package com.niit.dao.impl;

import com.niit.config.HibernateConfig;
import com.niit.dao.BookDao;
import com.niit.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoimpl implements BookDao {

    private SessionFactory sessionFactory;
    private Session session;

    public BookDaoimpl() {
        sessionFactory = HibernateConfig.getSessionFactory();
    }

    @Override
    public boolean addBook(Book book)
    {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(book);
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
