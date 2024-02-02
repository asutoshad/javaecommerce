package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String image;
}
