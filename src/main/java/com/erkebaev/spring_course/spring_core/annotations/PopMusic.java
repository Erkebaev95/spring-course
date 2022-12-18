package com.erkebaev.spring_course.spring_core.annotations;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    public String getSong() {
        return "Belli jean";
    }
}
