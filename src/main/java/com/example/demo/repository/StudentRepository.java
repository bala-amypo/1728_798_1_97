package com.example.demo.repository;

import spring.frameworks.data.jpa.repository.JpaRepostitory;
import spring.frameworks.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
