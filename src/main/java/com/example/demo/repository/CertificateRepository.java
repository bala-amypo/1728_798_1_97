package com.example.demo.repository;

import com.example.demo.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    Certificate findByVerificationCode(String verificationCode);
    List<Certificate> findByStudentId(Long studentId); 
}
