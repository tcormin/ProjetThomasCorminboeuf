package ch.corminboeuf.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ch.corminboeuf.model.Benevole;

@RequestScoped
@Named("benevoleView")
public class BenevoleView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3733912007149394439L;
	
	//@ManagedProperty(value = "sessionBean")
	@Inject
	private SessionManager sessionBean;
	
	private Benevole b;
	
	public SessionManager getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionManager sessionBean) {
		this.sessionBean = sessionBean;
	}

	public BenevoleView(){
	}

	@PostConstruct
	public void init() {
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
