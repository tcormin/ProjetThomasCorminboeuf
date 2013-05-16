package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Benevole;

@RequestScoped
public class BenevoleView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3733912007149394439L;
	
	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private Benevole b;
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public BenevoleView(){
		System.out.println("BenevoleView cree");
		b = this.sessionBean.getgUtilisateurs().getDaoBenevole().getBenevoles().get(0);
	}

	public Benevole getB() {
		return b;
	}

	public void setB(Benevole b) {
		this.b = b;
	}
	
}
