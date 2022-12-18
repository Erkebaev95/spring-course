package com.erkebaev.spring_course.spring_core.annotations;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
