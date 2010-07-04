package com.wordpress.springeip;

public class UnsupportedQuestionException extends Exception {
	private static final long serialVersionUID = 42L;

	public UnsupportedQuestionException(String aQuestion) {
		super("I do not know the answer to '" + aQuestion + "?'");
	}

}
