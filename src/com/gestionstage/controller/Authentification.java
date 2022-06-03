package com.gestionstage.controller;

import java.util.ArrayList;
import java.util.List;

import com.gestionstage.model.Entreprise;
import com.gestionstage.model.Etudiant;
import com.gestionstage.model.Scolarite;

public class Authentification {
	
	private List<Entreprise> listEntreprise;
	private List<Etudiant> listEtudiant;
	private List<Scolarite> listScolarite;
	
	public void utilisateur() {
		List<Entreprise> entreprises = new ArrayList<>();
		List<Etudiant> etudiants = new ArrayList<>();
		List<Scolarite> scolarites = new ArrayList<>();
		
		entreprises.add(new Entreprise(1, "Mercedes", "Construction voiture"));
		entreprises.add(new Entreprise(2, "McDonald", "Fast Food"));
		
		etudiants.add(new Etudiant(1, "marc@gmail.com", "Marc", "marc1234"));
		etudiants.add(new Etudiant(1, "loic@gmail.com", "Loic", "marc1234"));
		
		scolarites.add(new Scolarite(1, "isty@gmail.com", "isty1234"));
		scolarites.add(new Scolarite(2, "iut@gmail.com", "iut"));
	}

	public List<Entreprise> getListEntreprise() {
		return listEntreprise;
	}

	public void setListEntreprise(List<Entreprise> listEntreprise) {
		this.listEntreprise = listEntreprise;
	}

	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}

	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}

	public List<Scolarite> getListScolarite() {
		return listScolarite;
	}

	public void setListScolarite(List<Scolarite> listScolarite) {
		this.listScolarite = listScolarite;
	}
	
}
