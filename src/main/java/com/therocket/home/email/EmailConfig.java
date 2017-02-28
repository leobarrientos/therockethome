package com.therocket.home.email;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


@Configuration
public class EmailConfig {

	private static final String FROM = "contacto@therocket.cl";
	
	@Value(value = "${mailSender.Host}")
	private String host;
	@Value(value = "${mailSender.Port}")
	private String port;

	@Bean
	public JavaMailSender getMailSender(){
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		//Using Gmail SMTP configuration.
		mailSender.setHost(host);
		mailSender.setPort(new Integer(port).intValue());
		mailSender.setUsername("tu_email@gmail.com");
		mailSender.setPassword("tu_password");

		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.smtp.mail.sender", FROM);
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");


		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}
}
