package com.erkebaev.spring_course.spring_core.first_test_project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getMusicList();
        context.close();
    }
}
