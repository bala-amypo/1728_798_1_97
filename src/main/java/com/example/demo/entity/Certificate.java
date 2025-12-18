package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Certificate{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Student student;

    @ManyToOne
    @JoinColumn
    private CertificateTemplate template;

    @Column(nullable = false)
    private LocalDate issuedDate;

    @Column(nullable = false)
    private String qrCodeUrl;

    @Column(nullable = false, unique = true)
    private String verificationCode;

}