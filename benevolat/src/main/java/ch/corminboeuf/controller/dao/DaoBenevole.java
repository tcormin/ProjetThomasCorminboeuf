package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Benevole;

public class DaoBenevole {
	
	private ArrayList<Benevole> benevoles = new ArrayList<Benevole>();

	public DaoBenevole(){
		
		Benevole b0 = new Benevole(4);
		b0.setNom("Corminboeuf");
		b0.setPrenom("Thomas");
		b0.setEmail("tcormin@bluewin.ch");
		b0.setDateNaissance("29.4.1984");
		b0.setTelephone("079 735 72 49");
		b0.setAdresse("avenue des Amazones 12");
		b0.setNpa("1224");
		b0.setCommune("Chenes-Bougeries");
		b0.setProfession("Etudiant");
		b0.setUrl("www.cabareve.ch");
		b0.setPresentation("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum, sem et consectetur sodales, nibh dolor accumsan arcu, sit amet tincidunt erat nibh non lacus. Nunc ac dui urna. Vestibulum sed lacus elit. Ut id sapien eget diam imperdiet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
		this.benevoles.add(b0);
		
		Benevole b1 = new Benevole(9);
		b1.setNom("Graber");
		b1.setPrenom("Maurice");
		b1.setEmail("maurice@promisjarrete.ch");
		b1.setTelephone("Ça va sonner occupé de toute façon...");
		this.benevoles.add(b1);
		
		Benevole b2 = new Benevole(10);
		b2.setNom("Cateau");
		b2.setPrenom("Françoise");
		b2.setEmail("francoise.cateau@bluewin.ch");
		b2.setTelephone("022 798 45 XX");
		this.benevoles.add(b2);
	}
	
	public ArrayList<Benevole> getBenevoles() {
		return benevoles;
	}

	public void setBenevoles(ArrayList<Benevole> benevoles) {
		this.benevoles = benevoles;
	}

}
