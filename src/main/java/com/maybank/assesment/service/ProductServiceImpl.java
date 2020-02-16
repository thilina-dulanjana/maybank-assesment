package com.maybank.assesment.service;

import java.util.Optional;

import com.maybank.assesment.entity.Product;
import com.maybank.assesment.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> getProduct(Integer id) {        
        return productRepository.findById(id);
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    

}