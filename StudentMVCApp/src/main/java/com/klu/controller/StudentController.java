package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
      // 1️ Simple GET
      @GetMapping("/hello")
      public String hello() {
          return studentService.getWelcomeMessage();
      }
      // 2️ Path Variable
      @GetMapping("/student/{id}")
      public String getStudentById(@PathVariable int id) {
          return studentService.getStudentById(id);
      }

      // 3️ Request Parameters
      @GetMapping("/search")
      public String searchStudent(
              @RequestParam String name,
              @RequestParam String course) {

          return studentService.searchStudent(name, course);
      }

      // 4️ JSON POST
      @PostMapping("/student")
      public Student createStudent(@RequestBody Student student) {
          return studentService.createStudent(student);
      }

      // 5️ PathVariable + JSON
      @PostMapping("/student/{id}/enroll")
      public String enrollStudent(
              @PathVariable int id,
              @RequestBody Student student) {

          return studentService.enrollStudent(id, student);
      }
}