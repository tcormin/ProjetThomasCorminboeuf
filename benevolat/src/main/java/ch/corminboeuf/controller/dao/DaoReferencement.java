package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Referencement;

public class DaoReferencement {

	private ArrayList<Referencement> referencements = new ArrayList<Referencement>();

	public DaoReferencement(){
		Referencement r = new Referencement();
		r.setLettre("Bravo");
		this.referencements.add(r);
	}

	public ArrayList<Referencement> getReferencements() {
		return referencements;
	}

	public void setReferencements(ArrayList<Referencement> referencements) {
		this.referencements = referencements;
	}
	
}
