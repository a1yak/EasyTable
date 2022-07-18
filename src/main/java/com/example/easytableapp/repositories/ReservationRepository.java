package com.example.easytableapp.repositories;

import com.example.easytableapp.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    Reservation findByReservationTime(LocalTime reservationTime);

    Reservation findByReservationTimeAndReservationDate(LocalTime reservationTime, LocalDate reservationDate);
}
