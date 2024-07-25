package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is for tennis coach";
    }
}
