package com.erkebaev.spring_course.spring_mvc.controllers;

import com.erkebaev.spring_course.spring_mvc.dao.PersonDAO;
import com.erkebaev.spring_course.spring_mvc.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final PersonDAO personDAO;

    @Autowired
    public AdminController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String adminPage(@ModelAttribute("person")Person person,
                            Model model) {
        model.addAttribute("people", personDAO.index());

        return "adminPage";
    }

    @PatchMapping("/add")
    public String makeAdmin(@ModelAttribute("person") Person person) {

        return "redirect:/people";
    }
}
