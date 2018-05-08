package com.training.core.mail.service;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.training.core.data.EmailData;


public class EmailSenderService 
{
	private MailSender mailSender;
	private VelocityEngine velocityEngine;
	
	public MailSender getMailSender() {
		return mailSender;
	}
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	public VelocityEngine getVelocityEngine() {
		return velocityEngine;
	}
	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}
	
	public void sendEmail(EmailData mail)
	{
		SimpleMailMessage message= new SimpleMailMessage();
		message.setFrom(mail.getFrom());
		message.setTo(mail.getTo());
		message.setSubject(mail.getSubject());
		
		Template template= velocityEngine.getTemplate("./templates/"+mail.getTemplateName());
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("firstName", mail.getCustomerData().getFirstName());
		velocityContext.put("lastName", mail.getCustomerData().getLastName());
		StringWriter stringWriter = new StringWriter();
		template.merge(velocityContext, stringWriter);
		message.setText(stringWriter.toString());
		mailSender.send(message);
	}	
}
