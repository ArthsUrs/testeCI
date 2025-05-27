package com.example.atvci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtvControllerTest {

	Teste01 controller = new Teste01();

	@Test
	void helloTest () {
		String response = controller.hello();
		assertEquals("Hello, World!", response);
	}
}