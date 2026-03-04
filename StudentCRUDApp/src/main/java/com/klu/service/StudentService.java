package com.klu.service;

import org.springframework.data.domain.Page;
import com.klu.model.Student;

public interface StudentService {

    Student createStudent(Student student);

    Page<Student> getAllStudents(int page, int size);

    Student getStudentById(Long id);

    Page<Student> getStudentsByCourse(String course, int page, int size);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}