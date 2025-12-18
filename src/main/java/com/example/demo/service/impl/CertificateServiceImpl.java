package com.example.demo.service;

import com.example.demo.entity.Certificate;
import com.example.demo.entity.CertificateTemplate;
import com.example.demo.entity.Student;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.repository.CertificateTemplateRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository certificateRepository;
    private final StudentRepository studentRepository;
    private final CertificateTemplateRepository certificateTemplateRepository;

    public CertificateServiceImpl(CertificateRepository certificateRepository, 
                                  StudentRepository studentRepository, 
                                  CertificateTemplateRepository certificateTemplateRepository) {
        this.certificateRepository = certificateRepository;
        this.studentRepository = studentRepository;
        this.certificateTemplateRepository = certificateTemplateRepository;
    }

    @Override
    public Certificate generateCertificate(Long studentId, Long templateId) {
        // Retrieve student and template
        Optional<Student> student = studentRepository.findById(studentId);
        Optional<CertificateTemplate> template = certificateTemplateRepository.findById(templateId);

        if (student.isEmpty() || template.isEmpty()) {
            throw new RuntimeException("Student or Template not found");
        }

        // Generate and save certificate
        Certificate certificate = new Certificate();
        certificate.setStudent(student.get());
        certificate.setTemplate(template.get());
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate getCertificate(Long certificateId) throws Exception {
        Optional<Certificate> certificate = certificateRepository.findById(certificateId);
        if (certificate.isEmpty()) {
            throw new Exception("Certificate not found");
        }
        return certificate.get();
    }

    @Override
    public Certificate findByVerificationCode(String code) {
        return certificateRepository.findByVerificationCode(code);
    }

    @Override
    public List<Certificate> findByStudentId(Long studentId) {
        return certificateRepository.findByStudentId(studentId);
    }
}
