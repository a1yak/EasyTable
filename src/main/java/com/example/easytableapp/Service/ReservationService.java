package com.example.easytableapp.Service;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }
    public Reservation findById(int id){
        Optional<Reservation> found = reservationRepository.findById(id);
        return found.orElse(null);
    }
}
