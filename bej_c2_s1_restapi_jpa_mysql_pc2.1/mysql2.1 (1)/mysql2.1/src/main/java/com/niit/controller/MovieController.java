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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") int id)
    {
        boolean result;
        result= movieService.deleteMovieById(id);
        if(result)
        {
            return new ResponseEntity("Movie deleted successfully",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity("Error while deleting record",HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/viewer-genre/{genre}")
    public ResponseEntity<Movie> getMovieByGenre(@PathVariable("genre") String genre)
    {
        Movie movie = movieService.getMovieByGenre(genre);
        if(movie!=null)
        {
            return new ResponseEntity(movie,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/viewer-name/{movieName}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("movieName") String movieName)
    {
        Movie movie = movieService.getMovieByName(movieName);
        if(movie!=null)
        {
            return new ResponseEntity(movie,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping("/update-movies")
    public ResponseEntity<String> updateMovie(@RequestBody Movie movie)
    {
        Movie movie1=movieService.update(movie);
        if(movie1!=null)
        {
            return new ResponseEntity<>("Movie Updated successfully",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Updating Movie was not successful",HttpStatus.EXPECTATION_FAILED);
        }
    }
}
