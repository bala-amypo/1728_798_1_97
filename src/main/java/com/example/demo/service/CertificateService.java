package com.example.demo.service;

import com.example.demo.enitity.Certificate;

public interface CertificateService {
    Certificate generateCertificate(Long studentId, Long templateId);
    Certificate getCertificate(Long certificateId) throws Exception;
    Certificate findByVerificationCode(String Code);
    List<Certificate> findByStudentId(Long studentId);
}