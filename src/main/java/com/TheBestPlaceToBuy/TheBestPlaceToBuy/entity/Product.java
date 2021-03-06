package com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Product")
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     @NotBlank
     private String name;
     private int category;
     private float price;
     private int visibility;

    public Product(){}

    public Product(String name) {
        this.name = name;
    }

    public Product(@NotBlank String name, int category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.visibility=0;
    }

    public Product(@NotBlank String name, int category, float price, int visibility) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.visibility = visibility;
    }

    public Product(Long id, @NotBlank String name, int category, float price, int visibility) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.visibility = visibility;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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
