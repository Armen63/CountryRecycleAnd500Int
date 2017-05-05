package com.example.countryrecycle.model;

/**
 * Created by Armen on 5/4/2017.
 */


public class Country {
    private String name;
    private String code;
    private boolean isSelected;

    public Country(String name, String code, boolean isSelected) {
        this.name = name;
        this.code = code;
        this.isSelected = isSelected;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
