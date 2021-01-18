package com.example.furnico.RecycleClasses;

public class MerchantClass {
    private String merchantName;
    private String rating;
    private String price;

    public MerchantClass(String merchantName, String rating, String price) {
        this.merchantName = merchantName;
        this.rating = rating;
        this.price = price;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
