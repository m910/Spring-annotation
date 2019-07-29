package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        Actor actor;
        Movie movie;


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BeanLifecycleDemoBean bean = (BeanLifecycleDemoBean)context.getBean("beanLifecycleDemoBean");
        bean.getMessage();



    }
}