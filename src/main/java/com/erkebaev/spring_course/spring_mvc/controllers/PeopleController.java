package com.erkebaev.spring_course.spring_mvc.controllers;

import com.erkebaev.spring_course.spring_mvc.dao.PersonDAO;
import com.erkebaev.spring_course.spring_mvc.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping
    public String index(Model model) {
        // Получим всех людей из DAO и передадим
        // на обнаружение в представление
        model.addAttribute("people", personDAO.index());

        return "people/index";
    }

    // READ
    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,
                       Model model) {
        // Получим одного человека по id из DAO и
        // передадим на обнаружение в представление

        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }

    // CREATE
    @GetMapping("/new")
    public String newPerson(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "people/new";

        personDAO.save(person);
        return "redirect:/people";
    }

    // UPDATE
    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", personDAO.show(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String edit(@ModelAttribute("person") @Valid Person person,
                       BindingResult bindingResult,
                       @PathVariable("id") int id) {
        if (bindingResult.hasErrors())
            return "people/edit";

        personDAO.update(id, person);
        return "redirect:/people";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        personDAO.delete(id);
        return "redirect:/people";
    }
}
