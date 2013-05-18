package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Mission;

@RequestScoped
public class MissionView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7091166290127610568L;

	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private Mission m;
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public MissionView(){
		this.m = this.sessionBean.getgMissions().getDaoMission().getMissions().get(0);
	}

	public Mission getM() {
		return m;
	}

	public void setM(Mission m) {
		this.m = m;
	}

	public void setNextMission(String nextMission) {
		System.out.println("Prochaine mission : " + nextMission);
		this.m = sessionBean.getgMissions().getMissionFromId(Integer.parseInt(nextMission));
	}
	
}
