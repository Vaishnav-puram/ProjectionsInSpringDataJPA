package com.example.projectioninspringdatajpa.service;



import com.example.projectioninspringdatajpa.dto.ProductDTO;
import com.example.projectioninspringdatajpa.entity.Product;


import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    Product updateProduct(int id, Product product);

    Product deleteProduct(int id);

     List<ProductDTO> getProductWithRequiredAttributes();


}
