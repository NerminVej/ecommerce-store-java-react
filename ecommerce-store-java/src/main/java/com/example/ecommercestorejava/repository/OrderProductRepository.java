package com.example.ecommercestorejava.repository;


import com.example.ecommercestorejava.entity.OrderProduct;
import com.example.ecommercestorejava.entity.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}