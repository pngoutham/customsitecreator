package com.csc.core.framework.hibernate.properties;

public class Login {
	private String username;
	private String password;
	private String username_hint;
	private String password_hint;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername_hint() {
		return username_hint;
	}

	public void setUsername_hint(String username_hint) {
		this.username_hint = username_hint;
	}

	public String getPassword_hint() {
		return password_hint;
	}

	public void setPassword_hint(String password_hint) {
		this.password_hint = password_hint;
	}
}
