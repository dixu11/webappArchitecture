package com.example.webapparchitecture.repository;

import com.example.webapparchitecture.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
