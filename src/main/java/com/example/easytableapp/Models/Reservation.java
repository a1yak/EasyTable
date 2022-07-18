package com.example.easytableapp.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Please enter date")
    private Date reservationDate;


    public Reservation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @DateTimeFormat(pattern = "HH:mm")
    @NotNull(message = "Please enter time")
    private LocalTime reservationTime;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }


    @Autowired
    public Reservation(Date reservationDate, LocalTime reservationTime) {
        this.person = new Person();
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
    }


    public Reservation() {
    }
}
