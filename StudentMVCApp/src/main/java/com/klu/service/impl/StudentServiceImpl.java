package com.klu.service.impl;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
  @Override
    public String getWelcomeMessage() {
        return "Hello from Spring MVC Service Layer!";
    }

    @Override
    public String getStudentById(int id) {
        return "Student ID received: " + id;
    }

    @Override
    public String searchStudent(String name, String course) {
        return "Searching student with name = " + name + ", course = " + course;
    }
    @Override
    public Student createStudent(Student student) {
        // Normally save to DB
        return student;
    }
    @Override
    public String enrollStudent(int id, Student student) {
        return "Student " + student.getName()
                + " enrolled successfully with ID " + id;
    }
}