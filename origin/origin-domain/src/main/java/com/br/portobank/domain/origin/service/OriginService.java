package com.br.portobank.domain.origin.service;

import com.br.portobank.domain.origin.model.Movie;

import java.util.List;

public interface OriginService {
    List<Movie> getPopulars();

    List<Movie> getUpcoming();

    Movie getById(final String id);
}
