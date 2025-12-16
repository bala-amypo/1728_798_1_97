package com.example.demo.service.impl;

import com.example.demo.entity.Certificate;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.service.CertificateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository repository;

    public CertificateServiceImpl(CertificateRepository repository) {
        this.repository = repository;
    }

    @Override
    public Certificate createCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    @Override
    public Certificate getCertificateById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Certificate not found with id " + id));
    }

    @Override
    public List<Certificate> getAllCertificates() {
        return repository.findAll();
    }

    @Override
    public void deleteCertificate(Long id) {
        Certificate certificate = getCertificateById(id);
        repository.delete(certificate);
    }

    @Override
    public boolean verifyCertificate(String certificateNumber) {
        return repository.existsByCertificateNumber(certificateNumber);
    }
}
