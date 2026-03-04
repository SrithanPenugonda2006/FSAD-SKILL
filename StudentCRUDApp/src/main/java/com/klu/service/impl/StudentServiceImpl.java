package com.klu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.repo.StudentRepo;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo sr;

    @Override
    public Student createStudent(Student student) {
        return sr.save(student);
    }

    @Override
    public Page<Student> getAllStudents(int page, int size) {
        return sr.findAll(PageRequest.of(page, size));
    }

    @Override
    public Student getStudentById(Long id) {
        return sr.findById(id).orElse(null);
    }

    @Override
    public Page<Student> getStudentsByCourse(String course, int page, int size) {
        return sr.findByCourse(course, PageRequest.of(page, size));
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = sr.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(student.getName());
            existing.setCourse(student.getCourse());
            return sr.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        sr.deleteById(id);
    }
}