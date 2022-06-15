package com.capstone.capstonebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineerlogins")
public class EngineerLogin {

	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
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
	public EngineerLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public EngineerLogin() {
		
	}
	@Override
	public String toString() {
		return "EngineerLogin [username=" + username + ", password=" + password + "]";
	}
	
}
