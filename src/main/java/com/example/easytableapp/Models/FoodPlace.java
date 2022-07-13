package com.example.easytableapp.Models;

import java.util.HashSet;
import java.util.Set;

public class FoodPlace implements Comparable<FoodPlace> {
    private String foodPlaceName;

    private Enum<FoodPlaceType> type;
    private Set<Reservation> reservations;

    {
        reservations = new HashSet<>();// надо будет прописать компаратор, чтоб даты резерваций выводился в порядке
        // возрастания по дате и времени
    }


    public FoodPlace(String foodPlaceName, Enum<FoodPlaceType> type) {
        this.foodPlaceName = foodPlaceName;
        this.type = type;
    }


    public String getFoodPlaceName() {
        return foodPlaceName;
    }

    // Прописал компаратор, чтоб заведения в правильном порядке были в TreeSet
    @Override
    public int compareTo(FoodPlace foodPlace) {
        return foodPlaceName.compareTo(foodPlace.getFoodPlaceName());
    }

    public void addReservationToTheList(Reservation reservation){
        this.reservations.add(reservation);
    }
}
