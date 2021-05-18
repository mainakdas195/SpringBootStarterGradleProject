package com.example.users.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.users.controller.CustomerController;
import com.example.users.model.Customer;
import com.example.users.model.Item;


class CustomerServiceTest {
	
	@Autowired
	CustomerController controller;
	
	@Test
	//@Disabled ("Not Implemented Yet")
	@DisplayName("Display Name for testGetValue")
	void testGetValue() {
		String [] inputs = {"A", "B", "A", "B"};
		CustomerService customerService = new CustomerService();
		String[] result = customerService.getValue(inputs);
		
		Assertions.assertEquals(2, result.length);
	}
	
	//Previously if any assertion fails junit doesn't look for the other assertions, in Junit 5 it checks for all the assertions.
	
	@Test
	void testItems() {
		
		String [] inputs = {"A", "B", "A", "B"};
		CustomerService customerService = new CustomerService();
		String[] result = customerService.getValue(inputs);
		
		Assumptions.assumeTrue(result.length > 2);
		
		//If the above condition is true only then the test will be executed.
		//As the above condition is not true, the below test case will not execute.
		List<Integer> items = Arrays.asList(2,3,4,5);
		
		Assertions.assertAll(() -> assertEquals(2, items.get(0)),
				() -> assertEquals(2, items.get(1)),
				() -> assertEquals(4, items.get(2)),
				() -> assertEquals(5, items.get(3)));
	}
	
	@ParameterizedTest
	@DisplayName("Parameterized test - GetValue") //Not important
	@ValueSource(strings = {"A,B,A","A,B,A,B"})
	void testParameterizedTestGetValue(String inputs) {
		String[] arrayParam = inputs.split("\\s*,\\s*");
		CustomerService customerService = new CustomerService();
		String[] result = customerService.getValue(arrayParam);
		
		Assertions.assertAll(() -> assertEquals(2, result.length));
	}
	
	
	@ParameterizedTest
	@DisplayName("Parameterized test - GetValue - Exception ")
	@ValueSource(ints = { 2, 1 })
	void testGetValue(int input) throws Exception {
		CustomerService customerService = new CustomerService();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {customerService.getValue(input);});
		
		assertTrue(ex.getMessage().contains("Exception"));
	}

}

