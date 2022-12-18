package com.erkebaev.spring_course.spring_core.first_test_project;

public class ClassicalMusic implements Music {

    // ограничиваем создание новых объектов
    private ClassicalMusic() {}

    // фабричный метод: мы можем получить новый объект через этот метод
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    // init method
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    // destroy method
    public void doMyDestroy() {
        System.out.println("Doing my destroying");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
