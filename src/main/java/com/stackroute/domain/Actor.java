package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Actor {

    private String actorName,gender;
    private int age;

    public String getActorName() {
        return actorName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
