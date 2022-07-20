package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.FoodPlace;
import com.example.easytableapp.Service.FoodPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/list")
public class FoodPlacesController {
    private final FoodPlaceService foodPlaceService;

    @Autowired
    public FoodPlacesController(FoodPlaceService foodPlaceService) {
        this.foodPlaceService = foodPlaceService;
    }


    @GetMapping("/{id}")
    public String showAll(@ModelAttribute FoodPlace foodPlace, Model model,
                          @PathVariable int id){
        model.addAttribute("FoodPlaces", foodPlaceService.allByType(id));
        return "foodplaces/list";
    }
}
