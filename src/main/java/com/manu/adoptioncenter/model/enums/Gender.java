package com.manu.adoptioncenter.model.enums;


public enum Gender {
    
    FEMALE("Female"),
    MALE("Male");

    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
