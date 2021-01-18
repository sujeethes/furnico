package com.example.furnico.RecycleClasses;

public class TotalProductInformation {
    private int id;
    private String category;
    private int warrantPeriod;
    private int dimensions;
    private int bestPrice;
    private String name;
    private String color;
    private String image;
    private String description;
    public int getId() {
        return id;
    }

    public TotalProductInformation(String category, int bestPrice, String name,String img) {
        this.category = category;
        this.bestPrice = bestPrice;
        this.name = name;
        this.image=img;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getWarrantPeriod() {
        return warrantPeriod;
    }
    public void setWarrantPeriod(int warrantPeriod) {
        this.warrantPeriod = warrantPeriod;
    }
    public int getDimensions() {
        return dimensions;
    }
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
    public int getBestPrice() {
        return bestPrice;
    }
    public void setBestPrice(int bestPrice) {
        this.bestPrice = bestPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
