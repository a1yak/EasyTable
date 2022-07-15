package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.Service.PersonService;
import com.example.easytableapp.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;


    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @GetMapping()
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation/create";
    }

    @PostMapping()
    public String createReservation(@ModelAttribute @Valid Reservation reservation, BindingResult bindingresult) {
        if(bindingresult.hasErrors()) return "reservation/create";
        reservationService.addReservation(reservation);
        return "redirect:/people/new";
    }

}
