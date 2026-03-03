package com.tatastrive.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.app.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
