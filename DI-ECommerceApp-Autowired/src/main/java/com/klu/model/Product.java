package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product() {
		this.productId = 101;
		this.productName = "Laptop";
		this.price = 45000.00;
		this.category = "Electronics";
	}
	
	public int getProductId() {
		return this.productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getCategory() {
		return this.category;
	}
}
