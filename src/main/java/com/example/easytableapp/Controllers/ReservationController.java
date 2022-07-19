package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.DatePicker;
import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.Models.TimePicker;
import com.example.easytableapp.Service.ReservationService;
import com.example.easytableapp.util.ReservationValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

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


    @ModelAttribute("timePicker")
    public List<TimePicker> pickTime(){
        List<TimePicker> list = new ArrayList<>();
        list.add(new TimePicker("10:00", LocalTime.of(10,00)));
        list.add(new TimePicker("11:00", LocalTime.of(11,00)));
        list.add(new TimePicker("12:00", LocalTime.of(12,00)));
        list.add(new TimePicker("13:00", LocalTime.of(13,00)));
        list.add(new TimePicker("14:00", LocalTime.of(14,00)));
        list.add(new TimePicker("15:00", LocalTime.of(15,00)));
        list.add(new TimePicker("16:00", LocalTime.of(16,00)));
        list.add(new TimePicker("17:00", LocalTime.of(17,00)));
        list.add(new TimePicker("18:00", LocalTime.of(18,00)));
        list.add(new TimePicker("19:00", LocalTime.of(19,00)));
        list.add(new TimePicker("20:00", LocalTime.of(20,00)));
        list.add(new TimePicker("21:00", LocalTime.of(21,00)));
        list.add(new TimePicker("22:00", LocalTime.of(22,00)));

        return list;
    }

    @ModelAttribute("datePicker")
    public List<DatePicker> pickDate(){
        List<DatePicker> listOfDates = new ArrayList<>();
        DateTimeFormatter customFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(1).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(1).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(2).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(2).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(3).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(3).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(4).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(4).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(5).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(5).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(6).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(6).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(7).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(7).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(8).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(8).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(9).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(9).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(10).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(10).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(11).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(11).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(12).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(12).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(13).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(13).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(14).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(14).toString(), customFormatter)));
        listOfDates.add(new DatePicker(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(15).toString(), LocalDate.parse(LocalDate.now(ZoneId.of("Europe/Paris")).plusDays(15).toString(), customFormatter)));

        return listOfDates;
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
