package com.example.demo.service;

import com.example.demo.enitity.CertificateTemplate;

public interface TemplateService {
    CertificateTemplate addTemplate(CertificateTemplate template);
    List<CertificateTemplate> getAllTemplates();
    CertificateTemplate findById(Long id);
}