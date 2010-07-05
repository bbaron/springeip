package crm.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import crm.model.Lead;

@Service("leadService")
public class LeadServiceImpl implements LeadService {
	private Logger logger = Logger.getLogger(getClass());
	
	public void createLead(Lead lead) {
		logger.info("Creating lead: " + lead);
	}
}
