package com.example.demo.service;

import com.example.demo.enitity.CertificateTemplate;
import java.util.List;

public interface TemplateService {
    CertificateTemplate addTemplate(CertificateTemplate template) throws Exception;
    List<CertificateTemplate> getAllTemplates();
    CertificateTemplate findById(Long id) throws Exception;
}