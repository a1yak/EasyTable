package com.example.easytableapp.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class FoodPlace  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String title;
    @NotBlank
    private int capacity;
    @NotBlank
    private String address;

    @OneToMany(mappedBy ="foodPlace" ,cascade = CascadeType.ALL)
    private List<Reservation> reservation;

    @ManyToOne
    private FoodPlaceType foodPlaceType;

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    public FoodPlace() {
    }

    public FoodPlace(String title, int capacity, String address) {
        this.title = title;
        this.capacity = capacity;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
}
