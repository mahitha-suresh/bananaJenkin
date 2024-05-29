package com.example.model;

import java.util.List;
import lombok.*;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data

public class Shoes {
	public Shoes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shoes(List<Shoe> shoes, String brand) {
		super();
		this.shoes = shoes;
		this.brand = brand;
	}
	public List<Shoe> getShoes() {
		return shoes;
	}
	public void setShoes(List<Shoe> shoes) {
		this.shoes = shoes;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private List<Shoe>shoes;
	private String brand;
}
