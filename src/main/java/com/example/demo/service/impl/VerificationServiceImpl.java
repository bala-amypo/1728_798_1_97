package com.example.demo.service;

import com.example.demo.entity.VerificationLog;
import com.example.demo.repository.VerificationLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VerificationServiceImpl implements VerificationService {

    private final VerificationLogRepository verificationLogRepository;

    // Constructor injection
    public VerificationServiceImpl(VerificationLogRepository verificationLogRepository) {
        this.verificationLogRepository = verificationLogRepository;
    }

    @Override
    public VerificationLog verifyCertificate(String verificationCode, String clientIp) {
        // Verify the certificate by verification code (you might need a certificate repository to validate this)
        // For now, let's assume that we're just logging the verification attempt and returning a log entry.

        // Creating and saving the verification log (This assumes that the verification process is done here)
        VerificationLog log = new VerificationLog();
        log.setVerificationCode(verificationCode);
        log.setClientIp(clientIp);
        log.setVerified(true); // This would depend on the logic of the certificate verification (set to true for success)

        // Save the log entry
        return verificationLogRepository.save(log);
    }

    @Override
    public List<VerificationLog> getLogsByCertificate(Long certificateId) {
        // Retrieve all verification logs associated with a specific certificate ID
        return verificationLogRepository.findByCertificateId(certificateId);
    }
}
