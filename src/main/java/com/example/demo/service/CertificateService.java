package com.example.demo.service;

import com.example.demo.entity.Certificate;

import java.util.List;

public interface CertificateService {

    Certificate createCertificate(Certificate certificate);

    Certificate getCertificateById(Long id);

    List<Certificate> getAllCertificates();

    void deleteCertificate(Long id);

    boolean verifyCertificate(String certificateNumber);
}
