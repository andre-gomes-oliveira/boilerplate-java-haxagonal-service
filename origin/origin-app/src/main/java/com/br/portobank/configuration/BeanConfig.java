package com.br.portobank.configuration;

import com.br.portobank.domain.origin.outbound.OriginProvider;
import com.br.portobank.domain.origin.service.OriginService;
import com.br.portobank.domain.origin.service.OriginServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public OriginService moviesService(final OriginProvider originProvider) {
        return new OriginServiceImpl(originProvider);
    }
}
