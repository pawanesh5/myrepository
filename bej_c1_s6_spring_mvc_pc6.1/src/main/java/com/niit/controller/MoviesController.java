package com.niit.controller;

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

    @GetMapping("/addMovies")
    public String showAddMoviesPage(Model model) {
        Movies movies = new Movies();
        model.addAttribute("movies", movies);
        return "addMovies";
    }


    @PostMapping("/addMovies")
    public String addNewMovies(@ModelAttribute("movies") Movies movies, Model model) {

        model.addAttribute("myMovies",movies);
        return "viewMovies";
    }
}
