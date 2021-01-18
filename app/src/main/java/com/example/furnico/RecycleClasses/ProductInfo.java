package com.example.furnico.RecycleClasses;

public class ProductInfo {
    private String productName;
    private String category;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ProductInfo(String productName, String category,String img) {
        this.productName = productName;
        this.category = category;
        this.image = img;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
