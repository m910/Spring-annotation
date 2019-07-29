package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

     String actorName,gender;
     int age;

    public Actor(String actorName, String gender, int age) {
        this.actorName = actorName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


}
