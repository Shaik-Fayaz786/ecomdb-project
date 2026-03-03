package com.tatastrive.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatastrive.app.repository.OrdersRepository;



@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepo;

}
