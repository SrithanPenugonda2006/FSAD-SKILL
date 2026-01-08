package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {
	
	@Value("101")
	private int rollNo;
	@Value("Srithan")
	private String studentName;
	@Value("FSAD")
	private String courseName;
	@Value("4")
	private int semester;
	
	public CourseRegistration() {
	}
	
	public void display() {
		System.out.println("Roll No.: " + this.rollNo);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Semester: " + this.semester);
	}
}
