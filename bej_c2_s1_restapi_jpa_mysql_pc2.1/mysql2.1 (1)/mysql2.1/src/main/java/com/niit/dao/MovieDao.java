package com.niit.dao;

import com.niit.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface MovieDao extends CrudRepository<Movie,Integer> { }

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer> {}