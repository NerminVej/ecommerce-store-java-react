package com.example.ecommercestorejava.repository;


import com.example.ecommercestorejava.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}