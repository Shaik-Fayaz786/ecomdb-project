package com.tatastrive.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatastrive.app.entity.Customer;
import com.tatastrive.app.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	
	public List<Customer> getCustomers()
	{
		return customerRepo.findAll();
	}
	
	public Customer getCustomer(Long id)
	{
		return customerRepo.findById(id).get();
	}
	
	public Customer createNewCustomer(Customer newCustomer)
	{
		return customerRepo.save(newCustomer);
	}
	
	public void deleteCustomer(Long id)
	{
		 customerRepo.deleteById(id);
	}
	
	
}
