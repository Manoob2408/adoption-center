package com.manu.adoptioncenter.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.manu.adoptioncenter.model.enums.Gender;
import com.manu.adoptioncenter.model.enums.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Animal implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String image;
    private String name;
    private String description;
    private Integer age;
    private Size size;
    private Gender gender;
}
