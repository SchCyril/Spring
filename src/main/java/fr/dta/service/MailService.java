package fr.dta.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.dta.model.Employe;

@Service
@Scope(scopeName="prototype")
public class MailService {
	
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void mailSend(Employe e) {
		System.out.println(message+" -- " +e.getNom());
		
	}

}

