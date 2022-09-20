package com.br.portobank.domain.origin.service;

import com.br.portobank.domain.origin.error.OriginNotFoundException;
import com.br.portobank.domain.origin.model.Movie;
import com.br.portobank.domain.origin.outbound.OriginProvider;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class OriginServiceImpl implements OriginService {

    private final OriginProvider originProvider;

    @Override
    public List<Movie> getPopulars() {
        List<Movie> movies = originProvider.getPopulars();
        if (CollectionUtils.isEmpty(movies)) {
            throw new OriginNotFoundException("Populard movies not found");
        }
        return movies;
    }

    @Override
    public List<Movie> getUpcoming() {
        List<Movie> movies = originProvider.getUpcoming();
        if (CollectionUtils.isEmpty(movies)) {
            throw new OriginNotFoundException("Lastet movies not found");
        }
        return movies;
    }

    @Override
    public Movie getById(String id) {
        Optional<Movie> movie = originProvider.getById(id);
        if (movie.isEmpty()) {
            throw new OriginNotFoundException(String.format("Movie with id [%s] not found", id));
        }
        return movie.get();
    }
}
