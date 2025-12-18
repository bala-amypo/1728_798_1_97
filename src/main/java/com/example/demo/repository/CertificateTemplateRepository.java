package com.example.demo.repository;

import com.example.demo.entity.CertificateTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

public interface CertificateTemplateRepository extends JpaRepository<CertificateTemplate, Long> {
    boolean existsByTemplateName(String templateName);  // Check if a template with this name exists
//     Optional<CertificateTemplate> findByTemplateName(String templateName);  // Retrieve template by name
// }
