package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Movie {


    private Actor actorRef;

    public Actor getActorRef() {
        return actorRef;
    }

    @Autowired
    public void setActorRef(Actor actorRef) {
        this.actorRef = actorRef;
    }

}
