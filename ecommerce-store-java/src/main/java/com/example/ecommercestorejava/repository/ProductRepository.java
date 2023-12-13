package com.example.ecommercestorejava.repository;


import com.example.ecommercestorejava.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}