package com.therocket.home.springmvc.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.therocket.home.domain.Contact;

@Controller
@RequestMapping("/")
@Slf4j
public class TheRocketHomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		
		model.addAttribute("title", "TheRocket.cl!!!");
		model.addAttribute("greeting", "Hola Bienvenidos al Mundo TheRocket.cl!!!");
		return "welcome2";
	}
	
	
	 /*
     * This method will be called on form submission, handling POST request
     * It also validates the user input
     * http://websystique.com/springmvc/spring-4-mvc-form-validation-with-hibernate-jsr-validator-resource-handling-using-annotations/
     * http://websystique.com/springmvc/spring-mvc-4-angularjs-example/
     */
    @RequestMapping(method = RequestMethod.POST)
    public String saveRegistration( @Valid Contact contact, BindingResult result, ModelMap model){
    	log.info("contact: " + contact.toString());
        if(result.hasErrors()) {
                return "welcome2";
        }
 
        model.addAttribute("success", "Gracias "+ contact.getName()+" , pronto nos contactaremos contigo");
        return "welcome2";
    }

}