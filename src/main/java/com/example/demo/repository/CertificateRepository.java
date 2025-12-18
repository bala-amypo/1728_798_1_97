package com.example.demo.repository;

import spring.frameworks.data.jpa.repository.JpaRepository;
import spring.frameworks.stereotypes.Repository;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{

}