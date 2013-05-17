package ch.corminboeuf.model;

import java.util.ArrayList;


public class Association extends Utilisateur{
	private String nom;
	private String acronyme;
	private String presentation;
	private String buts;
	private String dateCreation;
	private String contact;
	private ArrayList<Mission> missions = new ArrayList<Mission>();
	private ArrayList<Formation> formations = new ArrayList<Formation>();
	private ArrayList<Referencement> reference = new ArrayList<Referencement>();
	private Domaine domaineNiveau1;
	private Domaine domaineNiveau2;
	
	public Association(int ID) {
		super(ID);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String name) {
		this.nom = name;
	}
	public String getPresentation() {
		return presentation;
	}
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	public String getButs() {
		return buts;
	}
	public void setButs(String buts) {
		this.buts = buts;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public ArrayList<Mission> getMissions() {
		return missions;
	}
	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}
	public ArrayList<Formation> getFormations() {
		return formations;
	}
	public void setFormations(ArrayList<Formation> formations) {
		this.formations = formations;
	}
	public ArrayList<Referencement> getReference() {
		return reference;
	}
	public void setReference(ArrayList<Referencement> reference) {
		this.reference = reference;
	}
	public Domaine getDomaineNiveau1() {
		return domaineNiveau1;
	}
	public void setDomaineNiveau1(Domaine domaineNiveau1) {
		this.domaineNiveau1 = domaineNiveau1;
	}
	public Domaine getDomaineNiveau2() {
		return domaineNiveau2;
	}
	public void setDomaineNiveau2(Domaine domaineNiveau2) {
		this.domaineNiveau2 = domaineNiveau2;
	}
	public String getAcronyme() {
		return acronyme;
	}
	public void setAcronyme(String acronyme) {
		this.acronyme = acronyme;
	}
	
	
	
}
