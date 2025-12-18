package com.example.demo.service;

import com.example.demo.entity.CertificateTemplate;
import com.example.demo.repository.CertificateTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemplateServiceImpl implements TemplateService {

    private final CertificateTemplateRepository templateRepository;

    public TemplateServiceImpl(CertificateTemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public CertificateTemplate addTemplate(CertificateTemplate template) throws Exception {
        // Check if template name already exists
        if (templateRepository.existsByName(template.getName())) {
            throw new Exception("Template name exists");
        }
        return templateRepository.save(template);
    }

    @Override
    public List<CertificateTemplate> getAllTemplates() {
        return templateRepository.findAll();
    }

    @Override
    public CertificateTemplate findById(Long id) throws Exception {
        Optional<CertificateTemplate> template = templateRepository.findById(id);
        if (template.isEmpty()) {
            throw new Exception("Template not found");
        }
        return template.get();
    }
}
