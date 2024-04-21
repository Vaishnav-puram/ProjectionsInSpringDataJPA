package com.example.projectioninspringdatajpa.repository;


import com.example.projectioninspringdatajpa.entity.Product;

import com.example.projectioninspringdatajpa.projections.ProductProjections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query(value = "select id,name,price,quantity from product_table", nativeQuery = true)
    List<ProductProjections> getProductsWithRequiredAttributes();

}
