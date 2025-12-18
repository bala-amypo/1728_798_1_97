package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CertificateTemplate{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String templateName;

    @Column(nullable = false)
    private String backgroundUrl;

    @Column(nullable = false)
    private String fontStyle;

    @Column(nullable = false)
    private String signatureName;
}