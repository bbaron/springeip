package com.wordpress.springeip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static com.wordpress.springeip.Service.*
;
public class ExampleServiceTest {

	private ExampleService service = new ExampleService();
	
	@Test
	public void ExampleService_knows_the_Answer_to_the_Ultimate_Question_of_Life_the_Universe_and_Everything_is_42() throws Exception {
		assertEquals(THE_ULTIMATE_ANSWER, service.getTheAnswerTo(THE_ULTIMATE_QUESTION));
	}

	@Test(expected = UnsupportedQuestionException.class)
	public void ExampleService_does_not_know_the_Answer_to_the_Penultimate() throws Exception {
		service.getTheAnswerTo("What's for dinner");
	}

}
