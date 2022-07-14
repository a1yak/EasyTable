package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String createReservation(@ModelAttribute Reservation reservation) {
        reservationService.addReservation(reservation);
        return "redirect:/people";
    }

}
