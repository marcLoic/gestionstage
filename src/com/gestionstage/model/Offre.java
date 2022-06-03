package com.gestionstage.model;

public class Offre {
	
	private int ID;
	private String sujet;
	private String resultatAttendu;
	private String lieuDeStage;
	private int gratification;
	
	public Offre() {
		
	}
	
	public Offre(int iD, String sujet, String resultatAttendu, String lieuDeStage, int gratification) {
		super();
		ID = iD;
		this.sujet = sujet;
		this.resultatAttendu = resultatAttendu;
		this.lieuDeStage = lieuDeStage;
		this.gratification = gratification;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getResultatAttendu() {
		return resultatAttendu;
	}
	public void setResultatAttendu(String resultatAttendu) {
		this.resultatAttendu = resultatAttendu;
	}
	public String getLieuDeStage() {
		return lieuDeStage;
	}
	public void setLieuDeStage(String lieuDeStage) {
		this.lieuDeStage = lieuDeStage;
	}
	public int getGratification() {
		return gratification;
	}
	public void setGratification(int gratification) {
		this.gratification = gratification;
	}
	
	
}
