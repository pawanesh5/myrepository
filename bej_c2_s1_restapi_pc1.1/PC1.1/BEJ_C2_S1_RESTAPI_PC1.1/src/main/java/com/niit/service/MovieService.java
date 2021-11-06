package com.niit.service;

import com.niit.model.Movie;

public interface MovieService
{
    public Iterable<Movie> getAllMovie();
    public Movie addMovie(Movie movie);
}
