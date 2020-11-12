package com.patrickcaproni.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrickcaproni.movieflix.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
