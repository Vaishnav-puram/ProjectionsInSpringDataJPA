package com.example.projectioninspringdatajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private int id ;
    private String name;

    private Double price;

    private int quantity;
}
