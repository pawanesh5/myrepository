package com.niit.dao;

import com.niit.model.Movies;

import java.util.List;

public interface MovieDao {

    public boolean addMovies(Movies movies);
    public List<Movies> getAllMovies();

}

