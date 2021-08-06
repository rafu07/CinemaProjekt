package com.rafael.cinemaservice.repository;

import com.rafael.cinemaservice.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

    Cinema findByCinemaId(Long cinemaId);
}
