package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);

    List<Student> getAllStudents();

    void deleteStudent(Long id);
}
