package com.example.easytableapp.repositories;

import com.example.easytableapp.Models.FoodPlace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodPlaceRepository extends JpaRepository<FoodPlace, Integer> {

    List<FoodPlace> findAllByFoodPlaceTypeId(int id);

}
