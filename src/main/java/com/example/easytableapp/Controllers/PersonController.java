package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Person;
import com.example.easytableapp.Service.PersonService;
import com.example.easytableapp.Service.ReservationService;
import com.example.easytableapp.util.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/people")
public class PersonController {

    private final PersonService personService;
    private final ReservationService reservationService;
    private final PersonValidator personValidator;


    @Autowired
    public PersonController(PersonService personService, ReservationService reservationService, PersonValidator personValidator) {
        this.personService = personService;
        this.reservationService = reservationService;
        this.personValidator = personValidator;
    }

    @GetMapping()
    public String showAllPeople(Model model){
        model.addAttribute("person", personService.showPeople());
        return "people/show";
    }

    @GetMapping("/new/{id}")
    public String newPerson(@ModelAttribute Person person, Model model,
                            @PathVariable int id){
        model.addAttribute("resId", id);
        return "people/new";
    }

    @PostMapping("/{id}")
    public String addPeople(@ModelAttribute @Valid Person person, BindingResult bindingResult,
                            Model model,
                            @PathVariable int id){
        model.addAttribute("resId", id);
        if(bindingResult.hasErrors()) return "people/new";
        reservationService.findById(id).setPerson(person);
        personService.addPerson(person);
        return "people/successfullreservation";
    }
}
