package com.manu.adoptioncenter.builder;

import java.util.ArrayList;
import java.util.List;

import com.manu.adoptioncenter.model.Animal;
import com.manu.adoptioncenter.model.dto.AnimalDTO;

import lombok.Builder;

@Builder
public class AnimalBuilder {
    
    public AnimalDTO buildAnimalDTO(Animal animal) {

        AnimalDTO dto = new AnimalDTO();
        dto.setName(animal.getName());
        dto.setDescription(animal.getDescription());
        dto.setImage(animal.getImage());
        dto.setAge(animal.getAge());
        dto.setGender(animal.getGender().getGender());
        dto.setSize(animal.getSize().getSize());

        return dto;
    }
}
