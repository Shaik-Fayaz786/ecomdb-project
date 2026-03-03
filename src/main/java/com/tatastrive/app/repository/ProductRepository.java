package com.tatastrive.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
