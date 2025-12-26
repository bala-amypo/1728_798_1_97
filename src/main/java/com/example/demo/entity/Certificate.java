package com.example.demo.entity;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "template_id")
    private CertificateTemplate template;

    @Column(nullable = false)
    private LocalDate issuedDate;

    @Column(nullable = false)
    private String qrCodeUrl;

    @Column(nullable = false, unique = true)
    private String verificationCode;

}