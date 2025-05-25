package com.practice.springjpa81.controller;

import com.practice.springjpa81.model.Film;
import com.practice.springjpa81.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/films")
public class FilmController {
    private final FilmRepository filmRepository;

    @GetMapping("/search")

    //  /films/search?q=НАЗВАНИЕ&mpa=PG-13
    public List<Film> findAll(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) String mpa,
            @RequestParam(required = false) Double minRating
    ) {
        // select * from films where title = 'Interstellar' and mpa is null
        return filmRepository.search(q, mpa, minRating);
    }
}
