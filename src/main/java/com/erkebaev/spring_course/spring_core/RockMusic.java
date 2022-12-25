package com.erkebaev.spring_course.spring_core;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
