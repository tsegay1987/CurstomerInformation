package com.CurstomerInformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CurstomerInformation.domain.Customer;
import com.CurstomerInformation.repository.CustomerRepository;

@Service 
public class CustomerServiceImp implements CustomerService{
	@Autowired 
	private CustomerRepository customerRepository;
	@Override
	public Customer save(Customer customer) {
		
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		this.customerRepository.save(customer);
		
		
	}
	
	
}
