package com.example.users.controller;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.users.model.Customer;
import com.example.users.model.Item;
import com.example.users.repository.CustomerRepository;


@SpringBootTest
class CustomerControllerTest {
	
	@Autowired
    private CustomerController controller;
	
	@MockBean
    private CustomerRepository customerRepository;
	
	@Test
	void testAddCustomer() throws Exception {
		
		Item item = new Item();
		item.setId(new Long(1));
		item.setName("item1");
		Set<Item> items = new HashSet<>();
		items.add(item);
		
		Customer customer = new Customer();
		customer.setId(new Long(1));
		customer.setName("Mainak");
		//customer.setItems(items);
		
		controller.addCustomer(customer);
	}
}

