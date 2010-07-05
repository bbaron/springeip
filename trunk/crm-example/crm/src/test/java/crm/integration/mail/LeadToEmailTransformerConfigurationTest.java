package crm.integration.mail;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import crm.integration.mail.LeadToEmailTransformer;

import static crm.ApplicationProperties.*;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class LeadToEmailTransformerConfigurationTest {
	@Autowired
	private LeadToEmailTransformer xformer;
	@Autowired
	@Qualifier("applicationProperties")
	private Properties applicationProperties;
	
	@Test
	public void transformerIsWired() throws Exception {
		assertNotNull(xformer);
	}
	
	@Test
	public void confFromIsNotNull() throws Exception {
		assertNotNull(xformer.getConfFrom());
		assertEquals(applicationProperties.getProperty(CRM_EMAIL_CONF_FROM_PROPERTY_KEY), xformer.getConfFrom());
	}
}
