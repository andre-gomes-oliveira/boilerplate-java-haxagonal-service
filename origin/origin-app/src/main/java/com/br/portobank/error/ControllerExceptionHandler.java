package com.br.portobank.error;

import com.br.portobank.domain.origin.error.OriginNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(OriginNotFoundException.class)
    public ResponseEntity<String> moviesNotFoundExceptionHandler(final OriginNotFoundException originNotFoundException) {
        return ResponseEntity
                .noContent()
                .build();
    }

    @ExceptionHandler(ParametersException.class)
    public ResponseEntity<String> badRequest(final ParametersException exception) {
        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());
    }
}
