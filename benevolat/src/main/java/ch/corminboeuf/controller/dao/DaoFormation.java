package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Formation;


public class DaoFormation {
	private ArrayList<Formation> formations = new ArrayList<Formation>();

	public ArrayList<Formation> getFormations() {
		return formations;
	}

	public void setFormations(ArrayList<Formation> formations) {
		this.formations = formations;
	}
}
