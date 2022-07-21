package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.FoodPlaceType;
import com.example.easytableapp.Service.FoodPlaceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FoodPlaceTypeController {

    private final FoodPlaceTypeService foodPlaceTypeService;

    @Autowired
    public FoodPlaceTypeController(FoodPlaceTypeService foodPlaceTypeService) {
        this.foodPlaceTypeService = foodPlaceTypeService;
    }

    @GetMapping("/start")
    public String showTypes(@ModelAttribute FoodPlaceType foodPlaceType, Model model){
        model.addAttribute("allTypes",foodPlaceTypeService.showAllTypes());
        return "foodplacetypes/typeslist";

    }
}
