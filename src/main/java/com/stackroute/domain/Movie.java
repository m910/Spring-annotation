package com.stackroute.domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beanmovie")
@Scope("prototype")
public class Movie {


    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
