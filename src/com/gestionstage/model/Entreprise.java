package com.gestionstage.model;

public class Entreprise {
	
	private int ID;
	private String nom;
	private String description;
	
	public Entreprise() {
		
	}
	
	public Entreprise(int iD, String nom, String description) {
		super();
		ID = iD;
		this.nom = nom;
		this.description = description;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
