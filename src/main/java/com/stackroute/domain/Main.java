package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        Actor actor;
        Movie movie;


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Actor actor = context.getBean("actor",Actor.class);
//        Actor actor2 = context.getBean("actor2",Actor.class);
//        Actor actor3 = context.getBean("actor3",Actor.class);


       Movie movie1 =(Movie)(context.getBean("beanmovie"));
        System.out.println(movie1.toString());


//        System.out.println(actor);
//        System.out.println(actor2);
//        System.out.println(actor3);


    }
}
