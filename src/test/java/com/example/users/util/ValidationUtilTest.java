package com.example.users.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.users.exception.InvalidAgeException;

@SpringBootTest
class ValidationUtilTest {
	@Test
	void testValidate() throws InvalidAgeException {
		
		InvalidAgeException ex = assertThrows(InvalidAgeException.class, () -> {ValidationUtil.validate(10);});
		
		assertTrue(ex.getMessage().contains("not valid"));
	}
}
