package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepostitory;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
