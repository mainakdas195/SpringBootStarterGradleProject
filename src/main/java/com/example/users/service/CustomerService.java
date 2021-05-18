package com.example.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.users.model.Customer;
import com.example.users.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public String[] getValue(String[] inputs) {
		return StringUtils.removeDuplicateStrings(inputs);
	}
	
	public int getValue(int number) {
		if (number < 3) {
			throw new IllegalArgumentException("Exception occurs");
		}
		return number;
	}
}
