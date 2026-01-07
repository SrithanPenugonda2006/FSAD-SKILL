package com.klu;

public class Bike {
	private Engine engine;
	
	public void setEngine(Engine e) {
		this.engine = e;
	}
	
	public void ride() {
		engine.start();
		System.out.println("Initiated bike riding..");
	}
}
