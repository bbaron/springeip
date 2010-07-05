package com.wordpress.springeip.crm.web;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import crm.integration.gateways.LeadGateway;
import crm.model.Country;
import crm.model.Lead;

/**
 * Handles requests for the application welcome page.
 */
@Controller
@RequestMapping("/lead")
public class LeadController {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	@Autowired
	private LeadGateway leadGateway;
	
	/**
	 * Simply selects the welcome view to render by returning void and relying
	 * on the default request-to-view-translator.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public void lead(ModelMap model) {
		model.addAttribute(Country.getCountries());
		model.addAttribute(new Lead());
		logger.info("received Lead request");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String lead(Lead lead) {
		lead.setDateCreated(new Date());
		leadGateway.createLead(lead);
		return "redirect:/lead?created=true";
		
	}
}
