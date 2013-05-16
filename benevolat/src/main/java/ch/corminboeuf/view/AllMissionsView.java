package ch.corminboeuf.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Mission;

@RequestScoped
public class AllMissionsView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3297688869116450946L;

	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private List<Mission> missions;
	private List<Mission> missionsRegulieres;
	private List<Mission> missionsPonctuelles;
	
	public AllMissionsView(){
		this.missionsRegulieres = this.sessionBean.getgMissions().getDaoMission().getMissionsRegulieres();
		this.missionsPonctuelles = this.sessionBean.getgMissions().getDaoMission().getMissionsPonctuelles();
		this.missions = this.sessionBean.getgMissions().getDaoMission().getMissions();
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public List<Mission> getMissionsRegulieres() {
		return missionsRegulieres;
	}

	public void setMissionsRegulieres(List<Mission> missionsRegulieres) {
		this.missionsRegulieres = missionsRegulieres;
	}

	public List<Mission> getMissionsPonctuelles() {
		return missionsPonctuelles;
	}

	public void setMissionsPonctuelles(List<Mission> missionsPonctuelles) {
		this.missionsPonctuelles = missionsPonctuelles;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	
}
