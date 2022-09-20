package com.br.portobank.domain.movies.error;

public class MoviesNotFoundException extends RuntimeException {

    public MoviesNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}
