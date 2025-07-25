package com.example.obragris.entity;


import jakarta.persistence.*;

@Entity
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 255)
    private String fileName;

    @Column(unique = false, nullable = false, length = 1000)
    private String filePath;

    @Column(unique = true, nullable = false, length = 255)
    private String description;

    @Column(length = 100)
    private String title;
}
