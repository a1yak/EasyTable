package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.Service.ReservationService;
import com.example.easytableapp.util.ReservationValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    private final ReservationValidation reservationValidation;


    @Autowired
    public ReservationController(ReservationService reservationService, ReservationValidation reservationValidation) {
        this.reservationService = reservationService;
        this.reservationValidation = reservationValidation;
    }


    @GetMapping()
    public String reservationForm(@ModelAttribute Reservation reservation) {
        return "reservation/create";
    }

    @PostMapping()
    public String createReservation(@ModelAttribute @Valid Reservation reservation, BindingResult bindingresult) {
        reservationValidation.validate(reservation, bindingresult);
        if(bindingresult.hasErrors()) return "reservation/create";
        reservationService.addReservation(reservation);
        return "redirect:/people/new/"+ reservation.getId();
    }

}
