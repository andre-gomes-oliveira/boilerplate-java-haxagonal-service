package com.br.portobank.domain.origin.error;

public class OriginNotFoundException extends RuntimeException {

    public OriginNotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}
