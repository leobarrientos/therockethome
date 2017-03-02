package com.therocket.home.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Component
@Getter @Setter
public class Email {
	
	private String from;
	private String [] to;
	private String subject;
	private String body;
	
	
}
