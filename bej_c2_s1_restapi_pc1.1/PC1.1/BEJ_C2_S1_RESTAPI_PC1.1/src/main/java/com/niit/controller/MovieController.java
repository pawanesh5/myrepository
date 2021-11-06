package com.niit.controller;

import com.niit.model.Movie;
import com.niit.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MovieController
{
    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<String> addNewMovie(@RequestBody Movie movie)
    {
        Movie movie1 = movieService.addMovie(movie);
        if(movie1!=null)
        {
            return new ResponseEntity<>("Movie added successfully", HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Error while adding movie",HttpStatus.EXPECTATION_FAILED);
        }
    }
    @GetMapping("/allMovies")
    public ResponseEntity<Iterable<Movie>> getAllMovie()
    {
        Iterable<Movie> allMovies = movieService.getAllMovie();
        return new ResponseEntity<Iterable<Movie>>(allMovies,HttpStatus.ACCEPTED);
    }
}
