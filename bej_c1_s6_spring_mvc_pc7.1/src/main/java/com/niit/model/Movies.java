package com.niit.model;

import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieID;
    private String movieName;

    private String datePlayed;

    private String directorName;

    public Movies() {
    }

    public Movies(int movieID, String movieName, String datePlayed, String directorName) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.datePlayed = datePlayed;
        this.directorName = directorName;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(String datePlayed) {
        this.datePlayed = datePlayed;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}