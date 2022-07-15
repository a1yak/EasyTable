package com.example.easytableapp.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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

    public Date getReservationTime() {
        return reservationTime;
    }

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date reservationDate;


    public Reservation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @DateTimeFormat(pattern = "HH:mm")
    @Temporal(TemporalType.TIME)
    private Date reservationTime;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }


    @Autowired
    public Reservation(Date reservationDate, Date reservationTime) {
        this.person = new Person();
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
    }


    public Reservation() {
    }
}
