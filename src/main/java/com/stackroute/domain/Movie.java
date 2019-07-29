package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("beanmovie")

public class Movie {
    //@Autowired  //   when Spring finds n @Autowired annotation used with property , it tries to perform byName autowiring

    private Actor actor;

    @Autowired    //When Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the method.

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}