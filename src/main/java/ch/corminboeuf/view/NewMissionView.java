package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Mission;

@RequestScoped
public class NewMissionView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7091166290127610568L;

	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private String progressString = "Fill the form please";
	
	private String lieu;
	private String titre;
	private String description;
	private int id = 54;
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}
	
	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		System.out.println("Titre mission : " + titre);
		this.titre = titre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String success() {
		 Mission m = new Mission(id);
		 m.setTitre(titre);
		 m.setDescription(description);
		 m.setLieu(lieu);
		 this.sessionBean.getgMissions().getDaoMission().getMissions().add(m);
		 setProgressString(getProgressString() + "(Enregistrement réussi)");
		 return"profileMission";
    }

	public String getProgressString() {
		return progressString;
	}

	public void setProgressString(String progressString) {
		this.progressString = progressString;
	}

	 
}
