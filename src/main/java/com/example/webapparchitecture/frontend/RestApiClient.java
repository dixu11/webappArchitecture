package com.example.webapparchitecture.frontend;

import com.example.webapparchitecture.dto.ProductDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestApiClient {


    public void sendAddProductHttpRequest(ProductDto productDto) {
        RestTemplate restTemplate = new RestTemplate(); //lepiej by bylo go stworzyc jako bean i dodać do springa i wstrzyknac tutaj
        restTemplate.postForObject("http://localhost:8080/api/v1/products", productDto, String.class);

    }
}
