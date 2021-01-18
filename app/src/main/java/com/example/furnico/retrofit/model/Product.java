package com.example.furnico.retrofit.model;

import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("image")
	private Object image;

	@SerializedName("bestPrice")
	private int bestPrice;

	@SerializedName("warrantyPeriod")
	private int warrantyPeriod;

	@SerializedName("color")
	private String color;

	@SerializedName("keywords")
	private String keywords;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("category")
	private int category;

	@SerializedName("dimensions")
	private int dimensions;

	public void setImage(Object image){
		this.image = image;
	}

	public Object getImage(){
		return image;
	}

	public void setBestPrice(int bestPrice){
		this.bestPrice = bestPrice;
	}

	public int getBestPrice(){
		return bestPrice;
	}

	public void setWarrantyPeriod(int warrantyPeriod){
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getWarrantyPeriod(){
		return warrantyPeriod;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	public String getKeywords(){
		return keywords;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(int category){
		this.category = category;
	}

	public int getCategory(){
		return category;
	}

	public void setDimensions(int dimensions){
		this.dimensions = dimensions;
	}

	public int getDimensions(){
		return dimensions;
	}
}