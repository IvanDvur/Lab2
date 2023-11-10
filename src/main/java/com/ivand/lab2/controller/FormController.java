package com.ivand.lab2.controller;

import com.ivand.lab2.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    private List<Person> personList = new ArrayList<>();

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("persons", personList);
        return "index";
    }

    @PostMapping("/add")
    public String submitForm(Person person) {
        personList.add(person);
        return "redirect:/";
    }
}