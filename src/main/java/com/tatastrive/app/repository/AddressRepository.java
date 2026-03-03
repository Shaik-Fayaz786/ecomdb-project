package com.tatastrive.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.app.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}