package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Evenement;

@RequestScoped
public class EvenementView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1625032344132684042L;
	
	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private Evenement e;
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public EvenementView(){
		e = this.sessionBean.getgMissions().getDaoEvenement().getEvenements().get(0);
	}

	public Evenement getE() {
		return e;
	}

	public void setE(Evenement e) {
		this.e = e;
	}
	
	public void setNextEvenement(String nextEvenement) {
		this.e = sessionBean.getgMissions().getEvenementFromId(Integer.parseInt(nextEvenement));
	}
	
}
