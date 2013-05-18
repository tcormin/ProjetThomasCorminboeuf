package ch.corminboeuf.model;
import java.util.ArrayList;
import java.util.Date;

public class Evenement {

	private String nom;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	private String description;
	private String url;
	private ArrayList<Mission> missions = new ArrayList<Mission>();
	private int id;
	
	public Evenement(){}
	
	public Evenement(int id){
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<Mission> getMissions() {
		return missions;
	}
	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}
	public int getid() {
		return id;
	}

	
}
