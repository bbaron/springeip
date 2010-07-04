package com.wordpress.springeip;


/**
 * {@link Service} with hard-coded input data.
 */
public class ExampleService implements Service {
	
	@Override
	public String getTheAnswerTo(String theQuestion) throws UnsupportedQuestionException {
		if (theQuestion.equals(THE_ULTIMATE_QUESTION)) {
			return THE_ULTIMATE_ANSWER;
		}
		throw new UnsupportedQuestionException(theQuestion);
	}

}
