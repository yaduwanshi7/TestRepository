package com.test.rest;

public class Promotions {
	String Id;
	String Name;
	String Description;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getMinimumPhotoCount() {
		return MinimumPhotoCount;
	}
	public void setMinimumPhotoCount(int minimumPhotoCount) {
		MinimumPhotoCount = minimumPhotoCount;
	}
	int Price;
	int MinimumPhotoCount;	
}