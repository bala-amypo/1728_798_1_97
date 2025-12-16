package com.example.demo.controller;

import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verify")
public class VerificationController {

    private final CertificateService certificateService;

    public VerificationController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping("/{code}")
    public Certificate verify(@PathVariable String code) {
        return certificateService.verifyCertificate(code);
    }
}
