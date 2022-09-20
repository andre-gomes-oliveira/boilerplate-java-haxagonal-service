package com.br.portobank.infra.api.mapper;

import com.br.portobank.common.utils.DateTimeUtil;
import com.br.portobank.domain.origin.model.Movie;
import com.br.portobank.infra.api.model.OriginDBFactory;
import info.movito.themoviedbapi.model.MovieDb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OriginMapperTest {

    @Test
    void should_map_movie() {
        // given
        final MovieDb movieDb = OriginDBFactory.MOVIEDB_POJO;
        // when
        final Movie result = OriginMapper.toDomain(movieDb);
        // then
        assertEquals(String.valueOf(movieDb.getId()), result.getId());
        assertEquals(movieDb.getTitle(), result.getTitle());
        assertEquals(movieDb.getOverview(), result.getSynopsys());
        assertEquals(movieDb.getPopularity(), result.getRate().getValue());
        Assertions.assertEquals(DateTimeUtil.getFromISO(movieDb.getReleaseDate()), result.getReleaseDate());
    }

    @Test
    void should_not_map_movie_null() {
        // when
        final Movie result = OriginMapper.toDomain(null);
        // then
        assertNull(result);
    }

    @Test
    void should_not_instantiate_utility_class() {
        // given
        final Class<?> cls = OriginMapper.class;
        final Constructor<?> c = cls.getDeclaredConstructors()[0];
        c.setAccessible(true);
        // when - then
        assertThrows(InvocationTargetException.class, c::newInstance);
    }
}
