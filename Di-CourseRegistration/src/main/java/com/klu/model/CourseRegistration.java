package com.klu.model;

public class CourseRegistration {
	private int rollNo;
	private String studentName;
	private String courseName;
	private int semester;
	
	public CourseRegistration(int rollNo, String studentName) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public void display() {
		System.out.println("Roll No.: " + this.rollNo);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Semester: " + this.semester);
	}
}
