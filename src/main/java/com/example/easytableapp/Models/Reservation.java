package com.example.easytableapp.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


public class Reservation {

    private static int RESERVATION_ID;


    private Person person;


    private Date reservationDate;


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


    public Reservation(Person person, Date reservationDate, Date reservationTime) {
        this.person = person;
        this.reservationDate = reservationDate;
    }


    public Reservation() {
    }
}
