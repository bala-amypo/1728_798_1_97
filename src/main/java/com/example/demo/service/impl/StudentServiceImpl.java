package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) throws Exception {
        // Check if email already exists
        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new Exception("Student email exists");
        }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) throws Exception {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty()) {
            throw new Exception("Student not found");
        }
        return student.get();
    }
}
