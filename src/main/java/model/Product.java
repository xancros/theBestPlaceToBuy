package model;

public class Product {

    private final Long id;
    private final String name;
    private int category;
    private float price;
    private int visibility;

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Product(Long id, String name, int category, float price, int visibility) {
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

    public float getPrice() {
        return price;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
