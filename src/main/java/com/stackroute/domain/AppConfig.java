package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Target;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {
//
//
       @Bean
       public Actor actor () {
            Actor actor = new Actor("Ranveer","Male",36);
            return actor;
        }

        @Bean
        public Actor actor2(){
           Actor actor2 = new Actor("Sharukh","Male",51);
           return actor2;
        }
        @Bean
        public Actor actor3(){
           Actor actor3 = new Actor("Deepika Padukone","Female",36);
           return actor3;
        }




}
