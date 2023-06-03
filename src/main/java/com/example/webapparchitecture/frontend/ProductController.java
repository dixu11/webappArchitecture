package com.example.webapparchitecture.frontend;

import com.example.webapparchitecture.dto.ProductDto;
import com.example.webapparchitecture.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private RestApiClient restApiClient;

    public ProductController(RestApiClient restApiClient) {
        this.restApiClient = restApiClient;
    }

    @GetMapping("/add-product")
    public String getAddProductForm() {
        return "add-product.html";
    }

    @PostMapping("/add-new-product")
    public String addProduct(String name) {
        ProductDto productDto = new ProductDto(name);
        restApiClient.sendAddProductHttpRequest(productDto);
        return "success.html";
    }
}
