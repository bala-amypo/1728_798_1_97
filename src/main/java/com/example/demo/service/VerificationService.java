package com.example.demo.service;

import com.example.demo.enitity.VerificationLog;

public interface VerificationService {
    VerificationLog verifyCertificate(String verificationCode, String clientIp);
    List<VerificationLog> getLogsByCertificate(Long CertificateId);
}