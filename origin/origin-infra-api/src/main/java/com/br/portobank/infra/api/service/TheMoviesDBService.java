package com.br.portobank.infra.api.service;

import com.br.portobank.domain.origin.model.Movie;
import com.br.portobank.domain.origin.outbound.OriginProvider;
import com.br.portobank.infra.api.mapper.OriginMapper;
import info.movito.themoviedbapi.TmdbMovies;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TheMoviesDBService implements OriginProvider {

    private final TmdbMovies tmdbMovies;

    @Override
    public List<Movie> getPopulars() {
        return tmdbMovies.getPopularMovies("en", 1)
                .getResults()
                .stream()
                .map(OriginMapper::toDomain)
                .toList();
    }

    @Override
    public List<Movie> getUpcoming() {
        return tmdbMovies.getUpcoming("en", 1, "FR")
                .getResults()
                .stream()
                .map(OriginMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Movie> getById(String id) {
        return Optional.ofNullable(OriginMapper
                .toDomain(tmdbMovies.getMovie(Integer.parseInt(id), "en")));
    }
}
