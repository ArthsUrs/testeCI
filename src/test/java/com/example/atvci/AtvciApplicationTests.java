package com.example.atvci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtvControllerTest {

	AtvciApplication controller = new AtvciApplication();

	@Test
	void helloTest () {
		String response = controller.hello();
		assertEquals("Hello, World!", response);
	}
}