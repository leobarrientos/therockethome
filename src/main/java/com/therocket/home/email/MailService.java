package com.therocket.home.email;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.therocket.home.domain.Email;

import freemarker.template.Configuration;

@Service
@Slf4j
public class MailService {

	private static final String FROM = "contacto@therocket.cl";

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	Configuration freemarkerConfiguration;


	public void sendContactEmail(Object object) {

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


				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
				helper.setFrom(new InternetAddress(FROM));
				helper.setSubject(email.getSubject());;

				InternetAddress[] toAddress = new InternetAddress[email.getTo().length];
				for( int i=0; i < email.getTo().length; i++ ) { 
					toAddress[i] = new InternetAddress(email.getTo()[i]);
				}

				helper.setTo(toAddress);

				Map<String, Object> model = new HashMap<String, Object>();
				model.put("contactName", email.getFrom());

				String text = prepareContactEmailTemplate(model);      
				helper.setText(text, true);	
			}
		};
		return preparator;
	}

	private String prepareContactEmailTemplate(Map<String, Object> model){
		StringBuffer content = new StringBuffer();
		try{
			content.append(FreeMarkerTemplateUtils.processTemplateIntoString( 
					freemarkerConfiguration.getTemplate("contactEmailTemplate"),model));
			return content.toString();
		}catch(Exception e){
			log.error("Exception occured while processing fmtemplate:"+e.getMessage());
		}
		return "";
	}

}
