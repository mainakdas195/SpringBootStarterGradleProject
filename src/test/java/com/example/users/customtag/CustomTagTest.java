package com.example.users.customtag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@Disabled("All Tests in this class will be skipped")
@SpringBootTest
@Tag("non-functional")
class CustomTagTest {

	CallingClassFromCustomTAG customTag = new CallingClassFromCustomTAG();
	@Tag("security")
	@Test
	void test1() {
		customTag.methodSecurity();
	}
	
	//@Disabled("Only this test will be skipped")
	@Tag("stress")
	@Test
	void test2() {
		customTag.methodStress();
	}
	
}
