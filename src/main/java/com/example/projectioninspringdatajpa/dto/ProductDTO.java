package com.example.projectioninspringdatajpa.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private int id ;
    private String name;

    private Double price;

    private int quantity;

    public ProductDTO(int id, String name, Double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
