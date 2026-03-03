package com.tatastrive.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatastrive.app.entity.Customer;
import com.tatastrive.app.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	
	@GetMapping("/all")
	public List<Customer> getCustomers()
	{
		return custService.getCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Long id)
	{
		return custService.getCustomer(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id)
	{
		custService.deleteCustomer(id);
		return "Customer Deleted!";
	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return custService.createNewCustomer(customer);
	}
	

}
