package com.patrickcaproni.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrickcaproni.movieflix.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

}