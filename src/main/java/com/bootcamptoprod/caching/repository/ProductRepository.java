package com.bootcamptoprod.caching.repository;


import com.bootcamptoprod.caching.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}