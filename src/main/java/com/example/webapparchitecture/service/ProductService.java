package com.example.webapparchitecture.service;

import com.example.webapparchitecture.dto.ProductDto;
import com.example.webapparchitecture.entity.Product;
import com.example.webapparchitecture.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(ProductDto productDto) {
        System.out.println("Service rozpoczyna prace z produktem");
        Product product = new Product(productDto.getName());
        productRepository.save(product);
    }
}
