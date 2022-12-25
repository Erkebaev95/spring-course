package com.erkebaev.spring_course.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    //@Autowired// Внедрение зависимости через поле
    //private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired// Внедрение зависимости через конструктор
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    /*@Autowired// Внедрение зависимости через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}