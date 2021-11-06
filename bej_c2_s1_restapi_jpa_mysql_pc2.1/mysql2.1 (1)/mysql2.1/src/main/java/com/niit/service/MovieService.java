package com.niit.service;

import com.niit.model.Movie;

public interface MovieService
{
    public Iterable<Movie> getAllMovie();
    public Movie addMovie(Movie movie);
    public boolean deleteMovieById(Integer movieId);
    public Movie getMovieByGenre(String genre);
    public Movie getMovieByName(String movieName);
    public Movie update(Movie movie);
}
