package com.niit.service;

import com.niit.dao.MovieDao;
import com.niit.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService
{
    @Autowired
    private MovieDao movieDao;
    @Override
    public Iterable<Movie> getAllMovie()
    {
        return movieDao.findAll();
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieDao.save(movie);
    }
}
