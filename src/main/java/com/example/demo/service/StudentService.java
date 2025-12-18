package com.example.demo.service;

import com.example.demo.enitity.Student;
import java.util.List;


public interface StudentService {
    Student addStudent(Student student) throws Exception;
    List<Student> getAllStudents();
    Student findById(Long Id) throws Exception;
}