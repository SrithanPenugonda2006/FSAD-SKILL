package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private String productName;
	@Value("4")
	private int quantity;
	
	public Order(@Value("101") int orderId, @Value("Srithan") String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
	}
	
	public void setProductName(@Value("Laptop") String productName) {
		this.productName = productName;
	}
	
	public void display() {
		System.out.println("The following details are related to order :");
		System.out.println("Order ID : " + this.orderId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Product Name : " + this.productName);
		System.out.println("Quantity : " + this.quantity);
		System.out.println();
	}
}
