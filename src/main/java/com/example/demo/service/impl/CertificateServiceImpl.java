package com.example.demo.service.impl;

import com.example.demo.entity.Certificate;
import com.example.demo.exception.CertificateNotFoundException;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.service.CertificateService;
import org.springframework.stereotype.Service;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateServiceImpl(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    @Override
    public Certificate verifyCertificate(String code) {
        return certificateRepository.findByVerificationCode(code)
                .orElseThrow(CertificateNotFoundException::new);
    }
}
