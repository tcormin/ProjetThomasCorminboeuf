package ch.corminboeuf.model;
import java.util.ArrayList;
import java.util.Date;


public class Mission {

	private String titre;
	private Date dateDebut;
	private Date dateFin;
	private int nombreBenevoles;
	private Date delaiInscription;
	private String description;
	private String lieu;
	private Domaine categorie;
	private Association association;
	private ArrayList<InscriptionMission> inscriptionsMissions = new ArrayList<InscriptionMission>();
	private ArrayList<Attestation> attestations = new ArrayList<Attestation>();
	private Evenement evenement;
	private TypeMission typeMission;
	private final int id;
	
	public Mission(final int id){
		this.id = id;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getNombreBenevoles() {
		return nombreBenevoles;
	}
	public void setNombreBenevoles(int nombreBenevoles) {
		this.nombreBenevoles = nombreBenevoles;
	}
	public Date getDelaiInscription() {
		return delaiInscription;
	}
	public void setDelaiInscription(Date delaiInscription) {
		this.delaiInscription = delaiInscription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Domaine getCategorie() {
		return categorie;
	}
	public void setCategorie(Domaine categorie) {
		this.categorie = categorie;
	}
	public Association getAssociation() {
		return association;
	}
	public void setAssociation(Association association) {
		this.association = association;
	}
	public ArrayList<InscriptionMission> getInscriptionsMissions() {
		return inscriptionsMissions;
	}
	public void setInscriptionsMissions(
			ArrayList<InscriptionMission> inscriptionsMissions) {
		this.inscriptionsMissions = inscriptionsMissions;
	}
	public ArrayList<Attestation> getAttestations() {
		return attestations;
	}
	public void setAttestations(ArrayList<Attestation> attestations) {
		this.attestations = attestations;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	public int getid() {
		return id;
	}
	public String getidString() {
		return String.valueOf(id);
	}
	public TypeMission getTypeMission() {
		return typeMission;
	}
	public void setTypeMission(TypeMission typeMission) {
		this.typeMission = typeMission;
	}
	
}
