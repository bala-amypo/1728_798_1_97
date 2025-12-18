package com.example.demo.repository;

import spring.framework.data.jpa.repository.JpaRepository;
import spring.framework.stereotypes.Repository;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{

}