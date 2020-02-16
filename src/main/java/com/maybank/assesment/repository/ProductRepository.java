package com.maybank.assesment.repository;

import com.maybank.assesment.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}