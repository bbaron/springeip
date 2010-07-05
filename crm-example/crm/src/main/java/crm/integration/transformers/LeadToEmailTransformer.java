package crm.integration.transformers;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.Transformer;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;

import crm.model.Lead;

public class LeadToEmailTransformer {
	private Logger logger = Logger.getLogger(getClass());

	private String confFrom;
	private String confSubj;
	private String confText;

	public String getConfFrom() {
		return confFrom;
	}

	public void setConfFrom(String confFrom) {
		this.confFrom = confFrom;
	}

	public String getConfSubject() {
		return confSubj;
	}

	public void setConfSubject(String confSubj) {
		this.confSubj = confSubj;
	}

	public String getConfText() {
		return confText;
	}

	public void setConfText(String confText) {
		this.confText = confText;
	}

	@Transformer
	public MailMessage transform(Lead lead) {
		logger.info("Transforming lead to confirmation e-mail: " + lead);

		String leadFullName = lead.getFullName();
		String leadEmail = lead.getEmail();
		MailMessage msg = new SimpleMailMessage();

		msg.setTo(leadFullName == null ? leadEmail : leadFullName + " <"
				+ leadEmail + ">");

		msg.setFrom(confFrom);
		msg.setSubject(confSubj);
		msg.setSentDate(new Date());
		msg.setText(confText);

		logger.info("Transformed lead to confirmation e-mail: " + msg);
		return msg;
	}
}
