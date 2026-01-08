package com.klu.main;
import com.klu.model.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		CourseRegistration cr = (CourseRegistration)con.getBean("courseReg");
		cr.display();
	}

}
