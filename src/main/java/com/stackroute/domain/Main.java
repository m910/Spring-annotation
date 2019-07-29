package com.stackroute.domain;

////import jdk.internal.loader.Resource;
//import org.springframework.context.ApplicationContext;
////import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
////import org.springframework.core.io.ClassPathResource;
//import com.stackroute.domain.Actor;
//
////import org.springframework.beans.factory.BeanFactory;
////import org.springframework.beans.factory.xml.XmlBeanFactory;
////import org.springframework.core.io.Resource;
//import org.springframework.core.io.ClassPathResource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Actor actor = context.getBean("actor",Actor.class);
//
       //Movie movieref =(Movie)(context.getBean("movie"));
//
//        System.out.println(movieref.getActorRef().getAge());
//
//
//        //Resource res =new ClassPathResource("beans.xml");
//        //BeanFactory factory=new XmlBeanFactory(res);
//        //Actor act=(Actor)factory.getBean("actor");
//
       System.out.println(actor.getActorName());
        System.out.println(actor.getGender());
        System.out.println(actor.getAge());
//    }

    }
}
