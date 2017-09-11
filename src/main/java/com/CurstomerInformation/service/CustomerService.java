package com.CurstomerInformation.service;

import com.CurstomerInformation.domain.Customer;


public interface CustomerService {
	
	Customer save(Customer curstomer);

	void addCustomer(Customer customer);

}
