package com.br.portobank.configuration;

import com.br.portobank.domain.movies.outbound.MoviesProvider;
import com.br.portobank.domain.movies.service.MoviesService;
import com.br.portobank.domain.movies.service.MoviesServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MoviesService moviesService(final MoviesProvider moviesProvider) {
        return new MoviesServiceImpl(moviesProvider);
    }
}
