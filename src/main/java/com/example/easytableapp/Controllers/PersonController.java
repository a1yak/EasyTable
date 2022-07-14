package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Person;
import com.example.easytableapp.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    public String showAllPeople(Model model){
        model.addAttribute("person", personService.showPeople());
        return "people/show";
    }

    @PostMapping("/new")
    public String addPeople(@ModelAttribute("person") Person person){
        personService.addPerson(person);
        return "redirect: /people";
    }
}
