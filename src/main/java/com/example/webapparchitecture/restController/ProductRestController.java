package com.example.webapparchitecture.restController;

import com.example.webapparchitecture.dto.ProductDto;
import com.example.webapparchitecture.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    private ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/v1/products")
    public void addProduct(@RequestBody ProductDto productDto) { //wykorzystanie pod spodem biblioteki Jackson -> do mapowania jsona z ciała zapytania http na obiekt dto
        productService.addProduct(productDto);
    }
}
