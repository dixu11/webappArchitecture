package com.example.webapparchitecture.dto;

public class ProductDto {
    private String name; //zgodne nazy z jsonem! lub użycie korygujących adnotacji

    public ProductDto(String name) {
        this.name = name;
    }

    //bezparamatrowy konstruktor wymagany przez Jackson
    public ProductDto() {
    }

    //gettery do wszystkich pol!
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
