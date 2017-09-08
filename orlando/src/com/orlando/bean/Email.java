package com.orlando.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.orlando.utils.EmailSender;

public class Email extends Form{

	/**
	 * Email form bean
	 */
	private static final long serialVersionUID = -8206301612284338683L;
	
	private String name;
	
	private String email;
	
	private String subject;
	
	private String message;
	
	
	public void test(){
		if(name == null || name == ""){
			putMessage("Error!", "Please fill the name field!");
			return;
		}
		if(email == null || email == ""){
			putMessage("Error!", "Please fill the email field!");
			return;
		}
		if(subject == null || subject == ""){
			putMessage("Error!", "Please fill the subject field!");
			return;
		}
		if(message == null || message == ""){
			putMessage("Error!", "Please fill the message field!");
			return;
		}
		EmailSender emailsender = new EmailSender();
		emailsender.setTo("orlandolozaarr@gmail.com");
		emailsender.setSubject(subject);
		message += "\nby " + name + " email: " + email;
		emailsender.setMessage(message);
		emailsender.send();
		putMessage("Succesful!", "Thank you " + name + ". your message has been sent.");
		name = "";
		email = "";
		subject = "";
		message = "";
	}
	
	public void putMessage(String type, String message){
		FacesContext context = getFacesContext();	
		context.addMessage(null, new FacesMessage(type,  message) );
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
