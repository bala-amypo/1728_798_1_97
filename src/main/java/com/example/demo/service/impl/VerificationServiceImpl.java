package com.example.demo.service.impl;

import com.example.demo.entity.VerificationLog;
import com.example.demo.repository.VerificationLogRepository;
import com.example.demo.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VerificationServiceImpl implements VerificationService {

    private final VerificationLogRepository verificationLogRepository;

    @Autowired
    public VerificationServiceImpl(VerificationLogRepository verificationLogRepository) {
        this.verificationLogRepository = verificationLogRepository;
    }

    @Override
    public VerificationLog verifyCertificate(String verificationCode, String clientIp) {
        // Create a new VerificationLog
        VerificationLog log = new VerificationLog();
        log.setStatus("Verified");  // You can update this status based on your logic
        log.setIpAddress(clientIp); // Set the client IP
        log.setVerifiedAt(LocalDateTime.now());  // Set the verified timestamp (handled by @PrePersist in the entity)

        // You can implement your logic here to retrieve the certificate by verificationCode
        // Assuming you retrieve a certificate by its verification code (you would need a certificateRepository)
        // Example (use actual code to find certificate):
        // Certificate certificate = certificateRepository.findByVerificationCode(verificationCode);
        
        // For now, assume you have the certificate already:
        // log.setCertificate(certificate);
        
        // Save the verification log
        return verificationLogRepository.save(log);
    }

    @Override
    public List<VerificationLog> getLogsByCertificate(Long certificateId) {
        return verificationLogRepository.findByCertificateId(certificateId);  // Fetch logs by certificate ID
    }
}
