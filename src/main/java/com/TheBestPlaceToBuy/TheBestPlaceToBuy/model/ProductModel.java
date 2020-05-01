package com.TheBestPlaceToBuy.TheBestPlaceToBuy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class ProductModel {
    @NotBlank
    private String name;
    private int category;
    private float price;
    private int visibility;


    public ProductModel(@JsonProperty("name") String name, @JsonProperty("category") int category, @JsonProperty("price") float price, @JsonProperty("visibility") int visibility) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.visibility = visibility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
}
