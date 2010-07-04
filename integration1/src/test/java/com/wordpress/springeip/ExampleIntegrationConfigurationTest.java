/*
 * Copyright 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wordpress.springeip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.wordpress.springeip.Service.*;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleIntegrationConfigurationTest {

	@Autowired
	private DeepThoughtGateway gateway;

	@Test
	public void the_Answer_to_the_Ultimate_Question_of_Life_the_Universe_and_Everything_is_42()
			throws Exception {
		assertEquals(THE_ULTIMATE_ANSWER,
				gateway.askQuestion(THE_ULTIMATE_QUESTION));
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration-context.xml");
		DeepThoughtGateway gateway = ctx.getBean(DeepThoughtGateway.class);
		System.out.printf("%s? %s\n", THE_ULTIMATE_QUESTION, gateway.askQuestion(THE_ULTIMATE_QUESTION));
		ctx.close();
	}

}
