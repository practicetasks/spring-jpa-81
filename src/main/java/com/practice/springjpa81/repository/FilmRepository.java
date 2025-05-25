package com.practice.springjpa81.repository;

import com.practice.springjpa81.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findByTitleContainingIgnoreCaseAndMpa(String title, String mpa);

    List<Film> findByTitleContainingIgnoreCase(String title);

    List<Film> findByMpa(String mpa);

    @Query("""
            select f from Film f
            where (:q is null or lower(f.title) like lower(concat('%', :q, '%')))
              and (:mpa is null or f.mpa = :mpa)
              and (:minRating is null or f.rating >= :minRating)""")
    List<Film> search(String q, String mpa, Double minRating);
}

