package com.niit.service;

import com.niit.dao.MovieDao;
import com.niit.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;

    @Override
    public Iterable<Movie> getAllMovie() {
        return movieDao.findAll();
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public boolean deleteMovieById(Integer movieId) {
        try {
            Movie movie = movieDao.getById(movieId);
            movieDao.delete(movie);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Movie getMovieByGenre(String genre) {
        Movie movie = null;
        List<Movie> allMovie;
        allMovie = movieDao.findAll();
        for (Movie genre1 : allMovie) {
            if (genre.equals(genre1.getGenre())) {
                movie = genre1;
            }
        }
        return movie;
    }

    @Override
    public Movie getMovieByName(String movieName) {
        Movie movie = null;
        List<Movie> allMovie;
        allMovie = movieDao.findAll();
        for (Movie movie1 : allMovie) {
            if (movieName.equals(movie1.getMovieName())) {
                movie = movie1;
            }
        }
        return movie;
    }

    @Override
    public Movie update(Movie movie) {
        Movie movie2 = movieDao.save(movie);
        return movie2;
    }


}




