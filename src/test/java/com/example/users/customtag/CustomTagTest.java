package com.example.users.customtag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("non-functional")
class CustomTagTest {

	CallingClassFromCustomTAG customTag = new CallingClassFromCustomTAG();
	@Tag("security")
	@Test
	void test1() {
		customTag.methodSecurity();
	}
	
	@Tag("stress")
	@Test
	void test2() {
		customTag.methodStress();
	}
	
}
