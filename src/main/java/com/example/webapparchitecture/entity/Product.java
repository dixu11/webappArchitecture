package com.example.webapparchitecture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }
}
