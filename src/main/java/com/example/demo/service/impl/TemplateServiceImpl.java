package com.example.demo.service.impl;

import com.example.demo.entity.CertificateTemplate;
import com.example.demo.repository.CertificateTemplateRepository;
import com.example.demo.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemplateServiceImpl implements TemplateService {

    private final CertificateTemplateRepository certificateTemplateRepository;

    @Autowired
    public TemplateServiceImpl(CertificateTemplateRepository certificateTemplateRepository) {
        this.certificateTemplateRepository = certificateTemplateRepository;
    }

    @Override
    public CertificateTemplate addTemplate(CertificateTemplate template) throws Exception {
        // Check if a template with the same name already exists
        if (certificateTemplateRepository.existsByTemplateName(template.getTemplateName())) {
            throw new Exception("Template with the name " + template.getTemplateName() + " already exists");
        }
        return certificateTemplateRepository.save(template);
    }

    @Override
    public List<CertificateTemplate> getAllTemplates() {
        return certificateTemplateRepository.findAll();
    }

    @Override
    public CertificateTemplate findById(Long id) throws Exception {
        Optional<CertificateTemplate> template = certificateTemplateRepository.findById(id);
        if (template.isEmpty()) {
            throw new Exception("Template with ID " + id + " not found");
        }
        return template.get();
    }

    @Override
    public CertificateTemplate findByTemplateName(String templateName) throws Exception {
        // Fetch template by name
        Optional<CertificateTemplate> template = certificateTemplateRepository.findByTemplateName(templateName);
        if (template.isEmpty()) {
            throw new Exception("Template with name " + templateName + " not found");
        }
        return template.get();
    }
}
