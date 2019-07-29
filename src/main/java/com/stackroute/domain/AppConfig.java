package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


        @Bean(name="actor")
        public Actor actor () {
            Actor actor = new Actor();
            actor.setActorName("Ranveer");
            actor.setGender("Male");
            actor.setAge(36);

             return actor;
        }

        @Bean(name="movie")
        public Movie movie () {
            Movie movie = new Movie();

            return movie;


        }

}
