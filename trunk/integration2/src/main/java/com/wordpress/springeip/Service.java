package com.wordpress.springeip;

public interface Service {
	
	public static final String THE_ULTIMATE_QUESTION = "What is the answer to the Ultimate Question of Life the Universe and Everything";
	public static final String THE_ULTIMATE_ANSWER = "42";
	
	String getTheAnswerTo(String theQuestion) throws UnsupportedQuestionException;

}
