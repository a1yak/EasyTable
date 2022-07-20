package com.example.easytableapp.Service;

import com.example.easytableapp.Models.FoodPlace;
import com.example.easytableapp.repositories.FoodPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodPlaceService {

    private final FoodPlaceRepository foodPlaceRepository;

    @Autowired
    public FoodPlaceService(FoodPlaceRepository foodPlaceRepository) {
        this.foodPlaceRepository = foodPlaceRepository;
    }

    public List<FoodPlace> showAll (){
        return foodPlaceRepository.findAll();
    }

    public FoodPlace findById(int id) {
        Optional<FoodPlace> found = foodPlaceRepository.findById(id);
        return found.orElse(null);
    }

    public List<FoodPlace> allByType(int id) {
        return foodPlaceRepository.findAllByFoodPlaceTypeId(id);
    }



}
