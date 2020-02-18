package com.maybank.assesment.service;

import java.util.Optional;

import com.maybank.assesment.entity.Product;


public interface ProductService {
    Optional<Product> getProduct(Integer id);

    Iterable<Product> listAllProducts() throws Exception;
}