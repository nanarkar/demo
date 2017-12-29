package com.northgateis.athena.model;

public class Login {
	public String user;
	public String password;
	public String email;

	public Login(String user, String password, String email) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
