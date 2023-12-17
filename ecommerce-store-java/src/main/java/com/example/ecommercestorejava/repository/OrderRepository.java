package com.example.ecommercestorejava.repository;


import com.example.ecommercestorejava.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
}