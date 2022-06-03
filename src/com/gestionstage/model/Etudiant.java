package com.gestionstage.model;

public class Etudiant {

	private int ID;
	private String email;
	private String nom;
	private String mdp;
	
	public Etudiant() {
		
	}
	
	public Etudiant(int iD, String email, String nom, String mdp) {
		super();
		ID = iD;
		this.email = email;
		this.nom = nom;
		this.mdp = mdp;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
