package com.erkebaev.spring_course.spring_core;

//@Component
public class MusicPlayer {
    /*@Autowired// Внедрение зависимости через поле
    @Qualifier("classicalMusic")// Указываем названия бина которого хотим вызвать
    private Music music;*/

    //@Value("${musicPlayer.name}")
    private String name;

    //@Value("${musicPlayer.volume}")
    private int volume;

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

    private Music music1;
    private Music music2;

    //@Autowired
    /*public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}