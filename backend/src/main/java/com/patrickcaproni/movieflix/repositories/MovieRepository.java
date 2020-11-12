package com.patrickcaproni.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrickcaproni.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
