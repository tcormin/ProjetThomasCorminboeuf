package ch.corminboeuf.model;

public class Administrateur extends Utilisateur{

	private String nom;
	private String prenom;
	
	public Administrateur(int ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
