package com.erkebaev.spring_course.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring3 {
    public static void main(String[] args) {
       /* ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");*/

        // Добавляем annotation config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
