package com.example.easytableapp.Service;

import com.example.easytableapp.Models.FoodPlaceType;
import com.example.easytableapp.repositories.FoodPlaceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodPlaceTypeService {

  private final FoodPlaceTypeRepository foodPlaceTypeRepository;

  @Autowired
    public FoodPlaceTypeService(FoodPlaceTypeRepository foodPlaceTypeRepository) {
        this.foodPlaceTypeRepository = foodPlaceTypeRepository;
    }

    public List<FoodPlaceType> showAllTypes(){
        return foodPlaceTypeRepository.findAll();
    }
}
