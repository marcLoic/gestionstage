package com.gestionstage.model;

public class Scolarite {
	
	private int ID;
	private String email;
	private String password;
	
	public Scolarite() {
		
	}
	
	public Scolarite(int iD, String email, String password) {
		super();
		ID = iD;
		this.email = email;
		this.password = password;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
