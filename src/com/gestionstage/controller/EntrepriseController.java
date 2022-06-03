package com.gestionstage.controller;

import java.util.ArrayList;
import java.util.List;

import com.gestionstage.model.Offre;

public class EntrepriseController {
	
	private List<Offre> listOffre;
	
	public void creerOffre(Offre offre) {
		listOffre.add(offre);
	}
	
	public void offres() {
		List<Offre> offres = new ArrayList<>();
		
		offres.add(new Offre(1, "Developement d'une application mobile pour la gestion de stock", 
									"Developper une application mobile", "À Vélizy", 500));
		offres.add(new Offre(2, "Developement d'une application desktop pour la gestion de stock", 
				"Developper une application desktop", "À Paris", 530));
		offres.add(new Offre(3, "Optimisation d'un système de gestion de stock", 
				"Optimiser le système de gestion de stock actuellement en place", "À Mantes la ville", 600));
		offres.add(new Offre(4, "Developpement d'un site vitrine", 
				"Developpement d'un site vitrince", "À Saint Denis", 400));
		
		setListOffre(offres);
	}
	
	public void supprimerOffre(Offre offre) {
		for (Offre element : listOffre) {
			if (element.getID() == offre.getID()) {
				listOffre.remove(offre);
			}
		}
	}

	public List<Offre> getListOffre() {
		return listOffre;
	}

	public void setListOffre(List<Offre> listOffre) {
		this.listOffre = listOffre;
	}
	
}
