package com.manu.adoptioncenter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manu.adoptioncenter.builder.AnimalBuilder;
import com.manu.adoptioncenter.model.Animal;
import com.manu.adoptioncenter.model.dto.AnimalDTO;
import com.manu.adoptioncenter.repository.AnimalRepository;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private AnimalBuilder animalBuilder;

    public List<AnimalDTO> getAnimals() {
        List<AnimalDTO> list = new ArrayList<>();
        List<Animal> animals = animalRepository.findAll();
        
        for(Animal animal : animals) {
            AnimalDTO dto = animalBuilder.buildAnimalDTO(animal);
            list.add(dto);
        }

        return list;
    }
}
