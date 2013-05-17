package ch.corminboeuf.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Evenement;

@RequestScoped
public class AllEvenementsView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5003811116459112872L;
	
	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private List<Evenement> evenements;
	
	public AllEvenementsView(){
		this.evenements = this.sessionBean.getgMissions().getDaoEvenement().getEvenements();
	}

	public SessionBean getPlateformeController() {
		return sessionBean;
	}

	public void setPlateformeController(SessionBean plateformeController) {
		this.sessionBean = plateformeController;
	}

	public List<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(List<Evenement> evenements) {
		this.evenements = evenements;
	}


	
	
}
