package com.br.portobank.domain.origin.service;

import com.br.portobank.domain.model.MovieFactory;
import com.br.portobank.domain.origin.error.OriginNotFoundException;
import com.br.portobank.domain.origin.model.Movie;
import com.br.portobank.domain.origin.outbound.OriginProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OriginServiceTest {

    @Mock
    private OriginProvider moviesProvider;

    private OriginService originService;

    @BeforeEach
    public void init() {
        originService = new OriginServiceImpl(moviesProvider);
    }

    @Test
    void should_fetch_populars() {
        // given
        final List<Movie> movies = List.of(MovieFactory.MOVIE_POJO);
        when(moviesProvider.getPopulars()).thenReturn(movies);
        // when
        final List<Movie> result = originService.getPopulars();
        // then
        assertEquals(movies, result);

    }

    @Test
    void should_not_fetch_popular() {
        // given
        final List<Movie> movies = List.of();
        when(moviesProvider.getPopulars()).thenReturn(movies);
        // when - then
        assertThrows(OriginNotFoundException.class, () -> originService.getPopulars());
    }

    @Test
    void should_fetch_lastest() {
        // given
        final List<Movie> movies = List.of(MovieFactory.MOVIE_POJO);
        when(moviesProvider.getUpcoming()).thenReturn(movies);
        // when
        final List<Movie> result = originService.getUpcoming();
        // then
        assertEquals(movies, result);
    }

    @Test
    void should_not_fetch_lastest() {
        // given
        final List<Movie> movies = List.of();
        when(moviesProvider.getUpcoming()).thenReturn(movies);
        // when - then
        assertThrows(OriginNotFoundException.class, () -> originService.getUpcoming());
    }

    @Test
    void should_get_by_id() {
        // given
        final String id = "Id";
        final Movie movie = MovieFactory.MOVIE_POJO;
        when(moviesProvider.getById(id)).thenReturn(Optional.of(movie));
        // when
        final Movie result = originService.getById(id);
        // then
        assertEquals(movie, result);
    }

    @Test
    void should_not_get_by_id() {
        // given
        final String id = "Id";
        when(moviesProvider.getById(id)).thenReturn(Optional.empty());
        // when
        assertEquals(
                "Movie with id [Id] not found",
                assertThrows(OriginNotFoundException.class, () -> originService.getById(id))
                        .getMessage()
        );
    }
}
