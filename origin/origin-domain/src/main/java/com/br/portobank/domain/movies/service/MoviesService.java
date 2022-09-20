package com.br.portobank.domain.movies.service;

import com.br.portobank.domain.movies.model.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie> getPopulars();

    List<Movie> getUpcoming();

    Movie getById(final String id);
}
