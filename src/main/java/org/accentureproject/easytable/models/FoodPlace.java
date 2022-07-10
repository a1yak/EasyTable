package org.accentureproject.easytable.models;

import java.sql.Time;
import java.util.Date;
import java.util.TreeMap;

public class FoodPlace implements Comparable<FoodPlace> {
    private String foodPlaceName;
    private Person person;
    private Enum<FoodPlaceType> type;
    private TreeMap<Time,Person> dayReservation;
    private TreeMap<Date, TreeMap<Time,Person>> monthReservation;

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
}
