package com.erkebaev.spring_course.spring_core.first_test_project;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

    // DI через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    // DI через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }

    // Get, Set для полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
