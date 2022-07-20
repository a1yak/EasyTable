package com.example.easytableapp.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class FoodPlaceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    @OneToMany
    private List<FoodPlace> foodPlace;

    public FoodPlaceType(String type, List<FoodPlace> foodPlace) {
        this.type = type;
        this.foodPlace = foodPlace;
    }

    public FoodPlaceType() {
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<FoodPlace> getFoodPlace() {
        return foodPlace;
    }
}
