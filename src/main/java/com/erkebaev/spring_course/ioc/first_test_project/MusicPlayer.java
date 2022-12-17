package com.erkebaev.spring_course.ioc.first_test_project;

public class MusicPlayer {
    private Music music;

    // Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}