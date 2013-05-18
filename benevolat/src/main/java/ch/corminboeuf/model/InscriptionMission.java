package ch.corminboeuf.model;
import java.util.Date;


public class InscriptionMission {
	
	private Benevole benevole;
	private Mission mission;
	private Date dateInscription = new Date();
	private Status status;
	private String commentaire;
	
	public Benevole getBenevole() {
		return benevole;
	}
	public void setBenevole(Benevole benevole) {
		this.benevole = benevole;
	}
	public Mission getMission() {
		return mission;
	}
	public void setMission(Mission mission) {
		this.mission = mission;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
