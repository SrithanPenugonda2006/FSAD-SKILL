package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = (Car)con.getBean("c");
		c.drive();
		Bike b = (Bike)con.getBean("b");
		b.ride();
	}
}
