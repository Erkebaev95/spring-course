package com.erkebaev.spring_course.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // В ручную внедряем зависимость
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // использовали Di через web.xml
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        // Init, destroy and factory methods
        /*ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());*/

        // Value
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        // Scope, PostConstruct, PreDestroy
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        //System.out.println(classicalMusic1 == classicalMusic2);


        context.close();
    }
}
