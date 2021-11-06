package com.niit.dao;

import com.niit.dao.MovieDao;
import com.niit.model.Movies;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addMovies(Movies movies) {
        try
        {
            Session session = sessionFactory.getCurrentSession();
            session.save(movies);
            return true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Movies> getAllMovies() {
        List<Movies> allMovies = new ArrayList<>();
        try
        {
            Session session = sessionFactory.getCurrentSession();
            allMovies = session.createQuery("from Movies").list();
            return allMovies;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
}
