package com.wordpress.springeip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExampleServiceTest {

	private ExampleService service = new ExampleService();
	
	@Test
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
