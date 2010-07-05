package com.wordpress.springeip.crm.web;

import org.junit.Test;
import org.springframework.ui.ModelMap;

public class LeadControllerTest {
	
	private LeadController controller = new LeadController();
	
	@Test
	public void lead() {
		controller.lead(new ModelMap());
	}
	
}
