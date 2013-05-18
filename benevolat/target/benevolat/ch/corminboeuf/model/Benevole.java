package ch.corminboeuf.model;
import java.util.ArrayList;

public class Benevole extends Utilisateur{

	private String nom;
	private String prenom;
	private String dateNaissance;
	private String profession;
	private String presentation;
	private ArrayList<InscriptionMission> inscriptionsMissions = new ArrayList<InscriptionMission>();
	private ArrayList<Referencement> reference = new ArrayList<Referencement>();
	private ArrayList<Attestation> attestations = new ArrayList<Attestation>();
	private ArrayList<InscriptionFormation> inscriptionsFormations = new ArrayList<InscriptionFormation>();

	public Benevole(int ID) {
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
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getPresentation() {
		return presentation;
	}
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	public ArrayList<InscriptionMission> getInscriptionsMissions() {
		return inscriptionsMissions;
	}
	public void setInscriptionsMissions(
			ArrayList<InscriptionMission> inscriptionsMissions) {
		this.inscriptionsMissions = inscriptionsMissions;
	}
	public ArrayList<Referencement> getReference() {
		return reference;
	}
	public void setReference(ArrayList<Referencement> reference) {
		this.reference = reference;
	}
	public ArrayList<Attestation> getAttestations() {
		return attestations;
	}
	public void setAttestations(ArrayList<Attestation> attestations) {
		this.attestations = attestations;
	}
	public ArrayList<InscriptionFormation> getInscriptionsFormations() {
		return inscriptionsFormations;
	}
	public void setInscriptionsFormations(
			ArrayList<InscriptionFormation> inscriptionsFormations) {
		this.inscriptionsFormations = inscriptionsFormations;
	}
	
	public String displayName(){
		return this.nom + " " + this.prenom; 
	}
}
