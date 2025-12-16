package com.example.demo.controller;

import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/generate")
    public Certificate generateCertificate(
            @RequestParam Long studentId,
            @RequestParam Long templateId) {
        return certificateService.generateCertificate(studentId, templateId);
    }

    @GetMapping("/{id}")
    public Certificate getCertificate(@PathVariable Long id) {
        return certificateService.getCertificate(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Certificate> getByStudent(@PathVariable Long studentId) {
        return certificateService.getCertificatesByStudent(studentId);
    }
}
