package com.northgateis.athena.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.northgateis.athena.model.Login;

public class LoginValidation implements Validator {

	public void validate(Login login, Errors errors) {
		if (login.getUser() == null || login.getUser().trim().length() == 0) {
			errors.rejectValue("username", "error.empty.field", "Please Enter User Name");
		} else if (!login.getUser().equals("admin")) {
			errors.rejectValue("username", "unknown.user", "Unknown User");
		}
		
		if (login.getPassword() == null || login.getPassword().trim().length() == 0) {
			errors.rejectValue("password", "error.empty.field", "Please Enter Password");
		} else if (!login.getPassword().equals("admin")) {
			errors.rejectValue("password", "wrong.password", "Wrong Password");
		}

		if (login.getEmail() == null || login.getEmail().trim().length() == 0) {
			errors.rejectValue("email", "error.empty.field", "Please Enter Email");
		} else if (!login.getEmail().equals("admin")) {
			errors.rejectValue("email", "wrong.email", "Wrong Email");
		}
	}

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}
}
