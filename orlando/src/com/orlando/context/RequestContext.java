package com.orlando.context;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.orlando.bean.ConfirmEmail;
import com.orlando.bean.Email;

@ManagedBean
@RequestScoped
public class RequestContext implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private ConfirmEmail confirm;
	
	private Email email;
	
	public ConfirmEmail getConfirm() {
		if(confirm == null){
			confirm = new ConfirmEmail();
		}
		return confirm;
	}

	public void setConfirm(ConfirmEmail confirm) {
		this.confirm = confirm;
	}

	public Email getEmail() {
		if (email == null){
			email = new Email();
		}
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	

}
