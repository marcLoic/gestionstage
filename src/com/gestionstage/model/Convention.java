package com.gestionstage.model;

public class Convention {
	
	private int Id;
	private String statut;
	private Offre offre;

    public Convention() {
    }
    
	public Convention(int id, String statut, Offre offre) {
		super();
		Id = id;
		this.statut = statut;
		this.offre = offre;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
}