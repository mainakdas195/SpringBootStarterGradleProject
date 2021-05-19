package com.example.users.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.users.model.Customer;
import com.example.users.repository.CustomerRepository;


@SpringBootTest
class CustomerControllerTest {
	
	@Autowired
    private CustomerController controller;
	
	@MockBean
    private CustomerRepository customerRepository;
	
	//@RepeatedTest(5) Same test case is repeated mentioned number of time.
	//@Nested 
	@Test
	void testAddCustomer() throws Exception {
		Customer customer = new Customer();
		customer.setId(new Long(1));
		customer.setName("Mainak");
		
		controller.addCustomer(customer);
	}
}

