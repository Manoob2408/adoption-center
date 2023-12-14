package com.manu.adoptioncenter.model.enums;


public enum Size {
    
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
