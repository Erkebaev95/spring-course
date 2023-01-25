package com.erkebaev.spring_course.spring_mvc.dao;

import com.erkebaev.spring_course.spring_mvc.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 25, "tom@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Jack", 33, "jack@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Sergey", 21, "sergey@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Ivan", 35, "ivan@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId()==id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    // UPDATE
    public void update(int id, Person person) {
        Person personToUpdate = show(id);
        personToUpdate.setName(person.getName());
    }

    // DELETE
    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
