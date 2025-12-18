package com.example.demo.repository;

import spring.frameworks.data.jpa.repository.JpaRepository;
import spring.frameworks.stereotype.Repository;

@Repository
public interface CertificateTemplateRepository extends JpaRepository<CertificateTemplate, Long>{

}