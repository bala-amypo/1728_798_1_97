package com.example.demo.repository;

import spring.framework.data.jpa.repository.JpaRepository;
import spring.framework.stereotype.Repository;

@Repository
public interface CertificateTemplateRepository extends JpaRepository<CertificateTemplate, Long>{

}