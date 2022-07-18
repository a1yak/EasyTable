package com.example.easytableapp.util;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Component
public class ReservationValidation implements Validator {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationValidation(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Reservation.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Reservation reservation = (Reservation) target;
        LocalTime time = reservation.getReservationTime().truncatedTo(ChronoUnit.SECONDS);


        if(reservationRepository.findByReservationTime(reservation.getReservationTime())!=null) {
            errors.rejectValue("reservationTime","","This time is reserved");
        }


    }
}
