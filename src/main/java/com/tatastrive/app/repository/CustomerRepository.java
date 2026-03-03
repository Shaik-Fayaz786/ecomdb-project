package com.tatastrive.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}