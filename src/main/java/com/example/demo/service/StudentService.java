package com.example.demo.service;

import com.example.demo.enitity.Student;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student findById(Long Id);
}