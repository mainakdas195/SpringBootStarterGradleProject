package com.example.users.util;

import com.example.users.exception.InvalidAgeException;

public class ValidationUtil {

	public static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid");
		} else {
			System.out.println("welcome to vote");
		}
	}
}
