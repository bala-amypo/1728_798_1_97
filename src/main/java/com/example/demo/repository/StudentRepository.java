package com.example.demo.repository;

import spring.framework.data.jpa.repository.JpaRepostitory;
import spring.framework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
