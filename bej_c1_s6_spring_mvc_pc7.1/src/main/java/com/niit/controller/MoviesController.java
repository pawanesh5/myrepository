package com.niit.controller;

import com.niit.dao.MovieDao;
import com.niit.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MoviesController {

    @Autowired
    private MovieDao movieDao;

    @GetMapping("/add")
    public String showAddMoviesPage(Model model)
    {
        Movies movies = new Movies();
        model.addAttribute("movies",movies);
        return "addMovies";
    }

    @PostMapping("/addMovies")
    public String addNewMovies(@ModelAttribute("movies") Movies movies, Model model)
    {
        boolean result;
        result = movieDao.addMovies(movies);
        if(result)
        {
            model.addAttribute("message","Movies Record Added Successfully in the Database");
            return "success";
        }
        else {
            model.addAttribute("message","Error While Adding Record in Database...");
            return "error";
        }
    }

    @GetMapping("/view")
    public String getAllMovies(Model model)
    {
        List<Movies> allMovies =movieDao.getAllMovies();
        if(allMovies!=null)
        {
            model.addAttribute("allMovies",allMovies);
            return "viewMovies";
        }
        else
        {
            model.addAttribute("message","Error While Fetching Movies from Database...");
            return "error";
        }
    }
}
