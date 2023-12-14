package com.manu.adoptioncenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.manu.adoptioncenter.model.dto.AnimalDTO;
import com.manu.adoptioncenter.service.AnimalService;

@Controller
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    
    @GetMapping("/list")
    public List<AnimalDTO> getAnimals() {
        return animalService.getAnimals();
    }
}
