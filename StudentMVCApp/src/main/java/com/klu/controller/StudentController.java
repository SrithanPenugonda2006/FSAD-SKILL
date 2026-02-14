package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    private StudentService studentService;
    
    @GetMapping("/greet")
    public String greet() {
          return studentService.getWelcomeMessage();
    }
    
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
    	return studentService.createStudent(student);
    }
    
    @GetMapping("/student/getbyid/{id}")
    public Student getStudentById(@PathVariable int id) {
    	return studentService.getStudentById(id);
    }

    @GetMapping("/student/getall")
    public List<Student> getAllStudents() {
    	return studentService.getAllStudents();
    }
    
    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable int id, Student student) {
        return studentService.updateStudent(id, student);
    }
    
    @DeleteMapping("/student/del/{id}")
    public String deleteStudent(@PathVariable int id, Student student) {
    	return studentService.deleteStudent(id);
    }
    
    @GetMapping("/student/search")
    public List<Student> searchStudent(@RequestParam String name, @RequestParam String course) {
    	return studentService.searchStudent(name, course);
    }
    
}