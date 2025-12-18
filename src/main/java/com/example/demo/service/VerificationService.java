package com.example.demo.service;

import com.example.demo.enitity.VerificationLog;

public interface TemplateService {
    CertificateTemplate addTemplate(CertificateTemplate template);
    List<CertificateTemplate> getAllTemplates();
    CertificateTemplate findById(Long id);
}