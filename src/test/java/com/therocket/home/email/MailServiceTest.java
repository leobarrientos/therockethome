package com.therocket.home.email;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.therocket.home.domain.Email;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { EmailConfig.class, MailServiceTest.MailServiceTestConfig.class, MailService.class},loader = AnnotationConfigContextLoader.class )
@ComponentScan (basePackages="com.therocket")
@TestPropertySource({"classpath:app.properties"})
public class MailServiceTest {
	
	@Autowired
	MailService mailSvc;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void enviarEmail(){
		Email email = new Email();
		email.setFrom("leobarrientos@gmail.com");
		email.setBody("Hola desde el mundo TheRocket!");
		email.setSubject("Test therocket.cl");
		String[] to = {"leobarrientos@gmail.com"};
		email.setTo(to);
		
		mailSvc.sendContactEmail(email);
		
	}

	@Configuration
	static class MailServiceTestConfig {

		@Bean
		public static PropertySourcesPlaceholderConfigurer propertiesResolver() {
			return new PropertySourcesPlaceholderConfigurer();
		}

	}
}
