package com.example.webapparchitecture.controller;

import com.example.webapparchitecture.dto.ProductDto;
import com.example.webapparchitecture.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add-product")
    public String getAddProductForm() {
        return "add-product.html";
    }

    @PostMapping("/add-new-product")
    public String addProduct(String name) {
        ProductDto productDto = new ProductDto(name);
        productService.addProduct(productDto);
        return "success.html";
    }
}
