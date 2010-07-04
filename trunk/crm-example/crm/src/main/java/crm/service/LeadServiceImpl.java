package crm.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import crm.model.Lead;

@Service("leadService")
public class LeadServiceImpl implements LeadService {
	private static Logger log = Logger.getLogger("global");
	
	public void createLead(Lead lead) {
		log.info("Creating lead: " + lead);
	}
}
