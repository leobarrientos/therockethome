package com.therocket.home.email;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MailService {

	private static final String FROM = "contacto@therocket.cl";
	
	@Autowired
	JavaMailSender mailSender;

	
	public void sendEmail(Object object) {

		Email email = (Email) object;

		MimeMessagePreparator preparator = getMessagePreparator(email);

		try {
			mailSender.send(preparator);
			
		} catch (MailException ex) {
			log.error(ex.getMessage());
		}
	}

	private MimeMessagePreparator getMessagePreparator(final Email email) {

		MimeMessagePreparator preparator = new MimeMessagePreparator() {

			public void prepare(MimeMessage mimeMessage) throws Exception {
				mimeMessage.setFrom(new InternetAddress(FROM));
			     InternetAddress[] toAddress = new InternetAddress[email.getTo().length];
		            for( int i=0; i < email.getTo().length; i++ ) { 
		                toAddress[i] = new InternetAddress(email.getTo()[i]);
		            }
				mimeMessage.setRecipients(Message.RecipientType.TO,toAddress);
				mimeMessage.setSubject(email.getSubject());
				mimeMessage.setText(email.getBody());
				
			}
		};
		return preparator;
	}

}
