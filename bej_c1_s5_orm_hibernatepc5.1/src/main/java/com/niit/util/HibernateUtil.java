package com.niit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;
    static
    {
        try
        {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory=configuration.buildSessionFactory();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
