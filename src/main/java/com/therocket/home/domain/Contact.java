package com.therocket.home.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

@ToString
@Component
@Getter @Setter
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6864299709001908012L;

	@NotEmpty
	private String name;
	
	@Email @NotEmpty
	private String email;
	
	@NotEmpty
	private String content;
	
	
}
