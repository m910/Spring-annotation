package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean{
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }


    @PostConstruct
    public void customInit(){
        System.out.println("Bean is going through init");

    }
    @PreDestroy
    public void customDestroy(){
        System.out.println("Bean will destroy now.");

    }
    @Override
    public void destroy() throws Exception {
        System.out.println("The bean is destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set");

    }
}
