package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Administrateur;


public class DaoAdministrateur {
	private ArrayList<Administrateur> administrateurs = new ArrayList<Administrateur>();

	public DaoAdministrateur(){
		Administrateur a = new Administrateur(1);
		a.setNom("Corminboeuf");
		a.setPrenom("Thomas");
		a.setEmail("tcormin@bluewin.ch");
		a.setAdresse("Dekoijmemel");
		a.setTelephone("079 735 72 49");
		a.setUrl("http://www.humour.com");
		
		this.administrateurs.add(a);
	}
	
	public ArrayList<Administrateur> getAdministrateurs() {
		return administrateurs;
	}

	public void setAdministrateurs(ArrayList<Administrateur> administrateurs) {
		this.administrateurs = administrateurs;
	}
}
