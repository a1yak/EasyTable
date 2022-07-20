package com.example.easytableapp.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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

    public FoodPlace getFoodPlace() {
        return foodPlace;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please enter date")
    private LocalDate reservationDate;

    @NotNull(message = "Please enter time")
    private LocalTime reservationTime;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "food_place_id")
    private FoodPlace foodPlace;

    public void setFoodPlace(FoodPlace foodPlace) {
        this.foodPlace = foodPlace;
    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }


    public Reservation(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }


    @Autowired
    public Reservation(LocalDate reservationDate, LocalTime reservationTime, FoodPlace foodPlace) {
        this.person = new Person();
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.foodPlace = foodPlace;
    }


    public Reservation() {
    }
}
