package com.wordpress.springeip;


/**
 * {@link Service} with hard-coded input data.
 */
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

}
