package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Evenement;


public class DaoEvenement {

	private ArrayList<Evenement> evenements = new ArrayList<Evenement>();
	
	public DaoEvenement(){
		
		Evenement e0 = new Evenement(0);
		e0.setLieu("Genève");
		e0.setNom("Course de l'escalade");
		e0.setDescription("Chaque année, le premier samedi de décembre, se déroule dans les rues de la vieille ville de Genève la manifestation la plus populaire de la vie genevoise : La Course de l'Escalade. L'année dernière, près de 27'000 coureurs se sont inscrits ; cette année, cela pourrait être votre tour.");
		e0.setUrl("www.escalade.ch");
		this.evenements.add(e0);
				
		Evenement e1 = new Evenement(1);
		e1.setLieu("Genève");
		e1.setNom("Fête de la musique");
		this.evenements.add(e1);
		
		Evenement e2 = new Evenement(2);
		e2.setLieu("Onex");
		e2.setNom("Festival des GEunes Talents");
		this.evenements.add(e2);	
	}
	
	public ArrayList<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(ArrayList<Evenement> evenements) {
		this.evenements = evenements;
	}
}
