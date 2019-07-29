package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("beanmovie")

public class Movie {
    @Autowired
    private Actor actor;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
