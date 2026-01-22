package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	@Autowired
	public Order() {
		this.orderId = 111;
		this.customerName = "Srithan";
		this.quantity = 3;
	}
	
	public Order(int orderId, String customerName, int quantity) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.quantity = quantity;
	}
	
	public void display() {
		System.out.println("The following details are related to the recent order and products :");
		System.out.println("Order Id : " + this.orderId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Product Id : " + product.getProductId());
		System.out.println("Product Name : " + product.getProductName());
		System.out.println("Price : " + product.getPrice());
		System.out.println("Category : " + product.getCategory());
		System.out.println();
	}
}
